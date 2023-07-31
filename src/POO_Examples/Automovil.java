package POO_Examples;

public class Automovil {
    String fabricante;
    String modelo;
    String color = "Rojo";
    double cilindraje;
    int capacidadTnaque = 40;

    public String verDetalle() {
        return "\nFabricante: " + this.fabricante +
                "\nModelo: " + this.modelo +
                "\nColor: " + this.color +
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
        return 0.0f;
    }
}
