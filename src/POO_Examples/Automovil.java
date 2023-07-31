package POO;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.BLANCO;
    private double cilindraje;
    private int capacidadTnaque = 40;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.AZUL; // Variable de clase o atributo de clase
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";
    public Automovil() {
        this.id = ++ultimoId;
    }
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, Color color, double cilindraje) {
        this(fabricante, modelo, color);
        this.cilindraje = cilindraje;
    }
    public Automovil(String fabricante, String modelo, Color color, double cilindraje, int capacidadTnaque) {
        this(fabricante, modelo, color, cilindraje);
        this.capacidadTnaque = capacidadTnaque;
    }

    //*************** GETTERS Y SETTERS *****************
    public int getId() {
        return id;
    }
    public String getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double setCilindraje() {
        return this.cilindraje;
    }
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    public int getCapacidadTanque() {
        return this.capacidadTnaque;
    }
    public void setCapacidadTanque(int capacidadTnaque) {
        this.capacidadTnaque = capacidadTnaque;
    }
    public static Color getColorPatente() {
        return Automovil.colorPatente;
    }
    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }
    public TipoAutomovil getTipo() {
        return this.tipo;
    }
    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    //*************** METODOS *****************
    public String verDetalle() {
        return "\nId:" + this.id +
                "\nFabricante: " + this.fabricante +
                "\nModelo: " + this.modelo +
                "\nTipo: " + this.getTipo().getDescripcion() +
                "\nColor: " + this.color.getColor()+
                "\nPatente: " + Automovil.colorPatente +
                "\nCilindraje: " + this.cilindraje;
    }

    public String acelerar (int rpm) {
        return "El automovil " + this.modelo + " esta acelerando a " + rpm + " rpm";
    }

    public String frenar () {
        return "El automovil " + this.modelo + " esta frenando";
    }

    public String acelerarFrenar (int rpm) {
        return this.acelerar(rpm) + "\n" + this.frenar();
    }

    public float calcularConsumo( int km, float porcentajeBencina){
        return km/(capacidadTnaque*porcentajeBencina);
    }
    public float calcularConsumo( int km, int porcentajeBencina){
        return km/(capacidadTnaque*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Automovil)) return false;
        Automovil a = (Automovil) obj;
        return  (this.fabricante != null && this.modelo != null) &&
                (this.fabricante.equals(a.fabricante) && this.modelo.equals(a.modelo));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadTnaque=" + capacidadTnaque +
                '}';
    }
}
