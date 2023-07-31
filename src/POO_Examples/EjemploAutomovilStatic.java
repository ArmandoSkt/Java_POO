package POO;

import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil nissan = new Automovil("Toyota", "Corolla");
        nissan.setColor(Color.BLANCO);
        nissan.setCilindraje(1.6);
        nissan.setTipo(TipoAutomovil.SEDAN);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AMARILLO, 2.5, 50);
        mazda.setTipo(TipoAutomovil.PICKUP);
        Automovil toyota = new Automovil("toyota", "corolla", Color.GRIS, 1.6, 50);
        toyota.setTipo(TipoAutomovil.SEDAN);
        Automovil toyota2 = new Automovil("toyota", "corolla", Color.ROJO, 1.6, 50);
        toyota2.setTipo(TipoAutomovil.CONVERTIBLE);
        Automovil auto = new Automovil();
        auto.setTipo(TipoAutomovil.CONVERTIBLE);

        System.out.println(nissan.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(toyota.verDetalle());





    }
}
