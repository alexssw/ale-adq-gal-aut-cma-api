package ale.adq.gal.aut.cma.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SummaryTransactiondDeniedDto implements CMASummary {

    private Long type;
    private String Description;
    private Long quantity;

}
