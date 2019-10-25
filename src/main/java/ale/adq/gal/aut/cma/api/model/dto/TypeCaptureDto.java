package ale.adq.gal.aut.cma.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeCaptureDto {

    private String name;
    private CMASummary summary;

}
