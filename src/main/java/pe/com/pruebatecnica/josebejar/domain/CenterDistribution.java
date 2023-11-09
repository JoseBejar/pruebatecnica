package pe.com.pruebatecnica.josebejar.domain;

public enum CenterDistribution {

    LURIN("ES UN DISTRITO COSTEÑO QUE SE ENCUENTRA AL SUR DE LIMA"),
    ICA(" ICA ES UNA CIUDAD DEL CENTRO DEL SUR DEL PERU"),
    TRUJILLO(" TRIJILLO ES UNA CIUDAD DEL NOROESTE DEL PERU"),
    HUANUCO(" HUANUCO ES UN DEPARTAMENTO DEL PERU UBICADO EN EL CENTRO NORTE DEL PAIS");

    private final String functioning;

    CenterDistribution(final String functioning) {
        this.functioning = functioning;
    }

    public String getValue() {
        return functioning;
    }
}
