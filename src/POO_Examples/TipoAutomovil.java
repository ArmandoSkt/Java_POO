package POO;

public enum TipoAutomovil {
    SEDAN("Sedan", 4, "Automovil mediano"),
    STATION_WAGON("Station Wagon", 4, "Automovil mediano"),
    HATCHBACK("Hatchback", 5, "Automovil pequeño"),
    PICKUP("Pickup", 4, "Camioneta para carga"),
    COUPE("Coupe", 2, "Automovil deportivo"),
    CONVERTIBLE("Convertible", 2, "Automovil deportivo"),
    DEPORTIVO("Deportivo", 2, "Automovil deportivo");

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    private TipoAutomovil(String nombre, int numeroPuerta, String descripcion) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
