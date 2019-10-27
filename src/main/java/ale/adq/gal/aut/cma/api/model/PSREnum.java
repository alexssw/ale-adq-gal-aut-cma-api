package ale.adq.gal.aut.cma.api.model;

public enum PSREnum {

    CIELO("Cielo"),
    GETNET("Getnet"),
    REDE("Rede"),
    SICREDI("Sicrede"),
    PAGSEGURO("PageSeguro");

    private String psr;

    PSREnum(String psr){
        this.psr = psr;
    }
}
