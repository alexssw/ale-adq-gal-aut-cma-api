package ale.adq.gal.aut.cma.api.model;

public enum ProductEnum {

    REFEICAO("Refeicao"),
    ALIMENTACACAO("Alimentacao"),
    MULTIBENEFICIOS("Multibeneficios");

    private String product;

    ProductEnum(String product) {
        this.product = product;
    }

}
