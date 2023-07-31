package POO_Examples;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil nissan = new Automovil();

        nissan.fabricante = "Toyota";
        nissan.modelo = "Corolla";
        nissan.color = "Azul";
        nissan.cilindraje = 1.8;

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "Mazda 3";
        mazda.color = "Gris";
        mazda.cilindraje = 2.0;

        System.out.println(nissan.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.acelerar(3000));
        System.out.println(mazda.acelerar(2000));
        System.out.println(nissan.frenar());
        System.out.println(mazda.frenar());

        System.out.println(nissan.acelerarFrenar(4000));


    }
}
