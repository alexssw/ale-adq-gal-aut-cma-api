package ale.adq.gal.aut.cma.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeCaptureDto {

    private String name;
    private List<TransactionSummary> summaries = new ArrayList<>();

}
