package ale.adq.gal.aut.cma.api.model;

public enum TypeCaptureEnum {

    POS("Pos"),
    TEF("Tef"),
    ECOMMERCE("e-Commerce");

    private String typeCapture;

    TypeCaptureEnum(String typeCapture) {
        this.typeCapture = typeCapture;
    }

}
