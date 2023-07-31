package POO;

public enum Color {
    ROJO,
    AMARILLO,
    AZUL,
    BLANCO,
    GRIS,
    NARANJA;

    private final String color;

    private Color() {
        this.color = this.name().toLowerCase();
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
