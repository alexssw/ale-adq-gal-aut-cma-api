package ale.adq.gal.aut.cma.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CMATransacoesAcionadasDto {

    private String psa;
    private String produto;
    private String tipoCaptura;
    private Long quantidadeDesfazimentos;
    private BigDecimal montanteDesfazimentos;
    private long quantidadeTransacoesNegadas;
    private BigDecimal montanteTransacoesNegadas;
    private Long quantidadeTransacoesCanceladas;
    private BigDecimal montanteTransacoesCanceladas;
    private Long quantidadeTransacoesAprovadas;
    private BigDecimal montanteTransacoesAprovadas;
    private Long quantidadeTransacoesTotais;
    private BigDecimal montanteTotalTransacoes;
    private Boolean statusStandIn;

}
