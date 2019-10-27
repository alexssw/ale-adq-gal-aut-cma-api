package ale.adq.gal.aut.cma.api.model.dto;

import ale.adq.gal.aut.cma.api.model.MTICodeEnum;
import ale.adq.gal.aut.cma.api.model.PSREnum;
import ale.adq.gal.aut.cma.api.model.ProductEnum;
import ale.adq.gal.aut.cma.api.model.TypeCaptureEnum;
import ale.adq.gal.aut.cma.api.repository.AutorizationOpenTransaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionData {

    public List<AutorizationOpenTransaction> geTriggeredTransactionData() {
        final List<AutorizationOpenTransaction> transactions = new ArrayList<>();

        //Cielo
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(1))
                .psr(PSREnum.CIELO.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(1000.00)).build());
        //Cielo
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(12))
                .psr(PSREnum.CIELO.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(500.00)).build());
        //Cielo
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(451))
                .psr(PSREnum.CIELO.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(1276.00)).build());

        //Getnet
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(16734))
                .psr(PSREnum.GETNET.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(100.00)).build());
        //Getnet
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(1674))
                .psr(PSREnum.GETNET.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(123.00)).build());
        //GetNet
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(16783))
                .psr(PSREnum.GETNET.name())
                .product(ProductEnum.ALIMENTACACAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(100.00)).build());
        //Getnet
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(45781))
                .psr(PSREnum.GETNET.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.NEGADAS.name())
                .transactionValue(Double.valueOf(1000.00)).build());
        //GetNet
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(23451))
                .psr(PSREnum.GETNET.name())
                .product(ProductEnum.ALIMENTACACAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.NEGADAS.name())
                .transactionValue(Double.valueOf(1000.00)).build());
        //Sicredi
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(15678))
                .psr(PSREnum.SICREDI.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(1000.00)).build());

        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(97541))
                .psr(PSREnum.PAGSEGURO.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(10.00)).build());
        transactions.add(AutorizationOpenTransaction.builder()
                .Id(Long.valueOf(97541))
                .psr(PSREnum.PAGSEGURO.name())
                .product(ProductEnum.REFEICAO.name())
                .typeCapture(TypeCaptureEnum.TEF.name())
                .mtiCode(MTICodeEnum.DESFEITAS.name())
                .transactionValue(Double.valueOf(50.00)).build());

        return transactions;
    }

    public List<AutorizationOpenTransaction> getTransactionDeniedData() {
        final List<AutorizationOpenTransaction> transactions = new ArrayList<>();

        return transactions;
    }

}
