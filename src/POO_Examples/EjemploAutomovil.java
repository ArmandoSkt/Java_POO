package POO;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Date fecha = new Date();
        Automovil nissan = new Automovil("Toyota", "Corolla");
        nissan.setColor(Color.BLANCO);
        nissan.setCilindraje(1.6);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.NARANJA, 2.5, 50);

        Automovil toyota = new Automovil("toyota", "corolla", Color.AZUL, 1.6, 50);
        Automovil toyota2 = new Automovil("toyota", "corolla", Color.ROJO, 1.6, 50);
        System.out.println("Son iguales " + (toyota == toyota2));
        System.out.println("Son iguales " + toyota.equals(toyota2));

        Automovil auto = new Automovil();
        System.out.println("Son iguales " + (auto.equals(fecha)));

        System.out.println(nissan);

        System.out.println(nissan.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.acelerar(3000));
        System.out.println(mazda.acelerar(2000));
        System.out.println(nissan.frenar());
        System.out.println(mazda.frenar());

        System.out.println(nissan.acelerarFrenar(4000));
        System.out.println("Kilomotros por litro " + nissan.calcularConsumo(300, 0.75f));
        System.out.println("Kilomotros por litro " + nissan.calcularConsumo(300, 75));
        System.out.println("Kilomotros por litro " + toyota.calcularConsumo(300, 75));


        int a = 0;



    }
}
