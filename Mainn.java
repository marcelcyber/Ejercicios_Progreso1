public class Mainn {
    public static void main(String[] args) {

        Automovilezz bmw = new Automovilezz();

        bmw.setMarca("BMW");
        bmw.setCilindraje(1200);
        bmw.setColor("Negro");
        bmw.setModelo("i40");

        System.out.println("Datos: ");

        System.out.println( bmw.getMarca());
        System.out.println( bmw.getColor());
        System.out.println( bmw.getModelo());

        System.out.println();
        System.out.println( bmw.detalleVeh());
        System.out.println("El consumo del combustible del vehiculo es: " + bmw.consumoCombustible());

    }
}