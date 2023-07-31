package POO;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil nissan = new Automovil("Toyota", "Corolla");
        nissan.setColor(Color.BLANCO);
        nissan.setCilindraje(1.6);
        nissan.setTipo(TipoAutomovil.SEDAN);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AMARILLO, 2.5, 50);
        mazda.setTipo(TipoAutomovil.PICKUP);

        TipoAutomovil tipo = nissan.getTipo();
        System.out.println("Tipo Automovil nissan = " + tipo.getNombre());
        System.out.println("Descripción = " + tipo.getDescripcion());
        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable");
                break;
            case COUPE:
                System.out.println("El automovil es pequeño de dos puertas y tipicamente deportivo");
                break;
            case SEDAN:
                System.out.println("El automovil es mediano de cuatro puertas");
                break;
            case STATION_WAGON:
                System.out.println("El automovil es mediano de cuatro puertas y un amplio espacio en el maletero");
                break;
            case HATCHBACK:
                System.out.println("El automovil es pequeño de cinco puertas");
                break;
            case PICKUP:
                System.out.println("El automovil es una camioneta para carga");
                break;
            case DEPORTIVO:
                System.out.println("El automovil es deportivo");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil t : tipos) {
            System.out.println(t + " -> " + t.name() + " -> " + t.getNombre()
                    + " -> " + t.getNumeroPuerta() + " -> " + t.getDescripcion());
        }
    }
}
