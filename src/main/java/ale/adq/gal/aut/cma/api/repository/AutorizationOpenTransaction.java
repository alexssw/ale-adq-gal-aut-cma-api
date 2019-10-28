package ale.adq.gal.aut.cma.api.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AutorizationOpenTransaction {

    @Column(name = "ID_TRANSACTION")
    private Long Id;

    //acquirer / emitter
    private String origin;

    @Column(name = "VAN_ID")
    private String psr;

    @Column(name = "ID_PRODUCT")
    private String product;

    @Column(name = "POS_ENTRY_MODE")
    private String typeCapture;

    //acquirer return code
    @Column(name = "ID_ORIGINAL_RESPONSE_CODE")
    private String originalResponseCode;

    //emitter return code
    @Column(name = "ID_RESPONSE_CODE")
    private String responseCode;

    @Column(name = "TRANSACTION_BIN")
    private String transactionBin;

    @Column(name = "ADDITIONAL_RESPONSE_DATA")
    private Boolean standIn;

    @Column(name = "TRANSACTION_END_TIME")
    private LocalDateTime transactionEndTime;

    @Column(name = "MTI_CODE")
    private String mtiCode;

    @Column(name = "POS_ENTRY_CODE")
    private String posEntryCode;

    private Double transactionValue;

    public String getkey() {
        String result = (this.getPsr() + "-" + this.getProduct() + "-" + this.getTypeCapture() + "-" + this.getMtiCode());
        return result;
    }
}
