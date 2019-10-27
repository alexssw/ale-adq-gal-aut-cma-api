package ale.adq.gal.aut.cma.api.model;

public enum MTICodeEnum {

    APROVADAS("0400"),
    NEGADAS("0410"),
    ADVICES("0420"),
    CANCELADAS("0430"),
    OFFLINE("0440"),
    DESFEITAS("0450");

    private String mtiCode;

    MTICodeEnum(String code) {
        this.mtiCode = code;
    }

}
