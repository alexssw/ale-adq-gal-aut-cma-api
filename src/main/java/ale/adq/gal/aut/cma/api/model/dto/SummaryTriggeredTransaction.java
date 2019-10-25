package ale.adq.gal.aut.cma.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SummaryTriggeredTransaction implements CMASummary {

    private Long quantidadeDesfazimentos;
    private BigDecimal montanteDesfazimentos;
    private Long quantidadeTransacoesNegadas;
    private BigDecimal montanteTransacoesNegadas;
    private Long quantidadeTransacoesCanceladas;
    private BigDecimal montanteTransacoesCanceladas;
    private Long quantidadeTransacoesAprovadas;
    private BigDecimal montanteTransacoesAprovadas;
    private Long quantidadeTransacoesTotais;
    private BigDecimal montanteTotalTransacoes;
    private Boolean statusStandIn;

}
