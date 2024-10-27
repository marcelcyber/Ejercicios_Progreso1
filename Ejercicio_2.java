public class Ejercicio_2 {

    public static void main(String[] args) {

        Musica music = new Musica();

        music.setGenero("Chicha");
        music.setFecha("2020");
        music.setLugar("Ecuador");

        // Llamamiento método

        System.out.println("Detalle:\n" + music.detalle_musica());

    }
}
