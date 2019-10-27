package ale.adq.gal.aut.cma.api.service;

import ale.adq.gal.aut.cma.api.model.dto.CMATriggeredTransactionDto;
import ale.adq.gal.aut.cma.api.model.dto.TransactionData;
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

        AutorizationOpenTransaction transaction = null;

        LocalDateTime endDate = startPeriod.minus(interval, ChronoUnit.DAYS);
        //repository.searchByTriggeredTransaction(
        // Date.valueOf(startPeriod.toLocalDate()),Date.valueOf(endDate.toLocalDate()));
        List<AutorizationOpenTransaction> transactions = new ArrayList<>();
        transactions.addAll( (new TransactionData()).geTriggeredTransactionData());


        final Map<String, Long> mapCount = transactions.stream()
                .collect(Collectors.groupingBy(AutorizationOpenTransaction::getkey, Collectors.counting()));

        final Map<String, Double> mapSum = transactions.stream()
                .collect(Collectors.groupingBy(AutorizationOpenTransaction::getkey,
                        Collectors.summingDouble(AutorizationOpenTransaction::getTransactionValue)));
        return null;
    }

    public CMATriggeredTransactionDto getSummeryByTransactionsDenied(
            LocalDateTime startPeriod, Long interval) {
        LocalDateTime endDate = startPeriod.minus(interval, ChronoUnit.DAYS);
        return null;
    }

}
