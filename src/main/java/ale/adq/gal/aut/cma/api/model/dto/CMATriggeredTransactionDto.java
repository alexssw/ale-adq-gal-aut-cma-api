package ale.adq.gal.aut.cma.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CMATriggeredTransactionDto {

    private String origin;
    private PSRDto psr;

}
