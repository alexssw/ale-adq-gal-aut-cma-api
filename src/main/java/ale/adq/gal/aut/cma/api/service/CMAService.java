package ale.adq.gal.aut.cma.api.service;

import ale.adq.gal.aut.cma.api.model.dto.*;
import ale.adq.gal.aut.cma.api.repository.AutorizationOpenTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CMAService {

//    @Autowired
//    AutorizationOpenTransactionRepository repository;

    public CMATriggeredTransactionDto getSummeryByTriggeredTransactions(
            LocalDateTime startPeriod, Long interval) {

        CMATriggeredTransactionDto triggeredTransactionDto = new CMATriggeredTransactionDto();
        AutorizationOpenTransaction transaction = null;
        final List<TransactionSummary> sumf = new ArrayList<>();

        LocalDateTime endDate = startPeriod.minus(interval, ChronoUnit.MINUTES);

//        List<AutorizationOpenTransaction> transactions =
//                repository.searchByTriggeredTransaction(Timestamp.valueOf(startPeriod), Timestamp.valueOf(endDate));

        List<AutorizationOpenTransaction> transactions = new ArrayList<>();
        transactions.addAll((new TransactionData()).geTriggeredTransactionData());

        final Map<String, Long> mapCount = transactions.stream()
                .collect(Collectors.groupingBy(AutorizationOpenTransaction::getkey, Collectors.counting()));

        final Map<String, Double> mapSum = transactions.stream()
                .collect(Collectors.groupingBy(AutorizationOpenTransaction::getkey,
                        Collectors.summingDouble(AutorizationOpenTransaction::getTransactionValue)));

        mapCount.forEach((k, v) -> {
            sumf.add(new TransactionSummary(k, v, mapSum.get(k)));
        });

        sumf.forEach(ts -> {
            String[] nodes = ts.getName().split("-");

            TransactionSummary summary = new TransactionSummary();
            summary.setName(nodes[3]);
            summary.setCount(ts.getCount());
            summary.setValue(ts.getValue());

            TypeCaptureDto typeCapture = new TypeCaptureDto();
            typeCapture.setName(nodes[2]);
            typeCapture.getSummaries().add(summary);

            ProductDto product = new ProductDto();
            product.setName(nodes[1]);
            product.getTypeCaptures().add(typeCapture);

            PSRDto psr = new PSRDto();
            psr.setName(nodes[0]);
            psr.getProducts().add(product);

            triggeredTransactionDto.getPsrs().add(psr);
        });

        return triggeredTransactionDto;
    }

    public CMATriggeredTransactionDto getSummeryByTransactionsDenied(
            LocalDateTime startPeriod, Long interval) {
        LocalDateTime endDate = startPeriod.minus(interval, ChronoUnit.DAYS);
        return null;
    }

}
