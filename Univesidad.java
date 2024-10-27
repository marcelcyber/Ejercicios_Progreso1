public class Univesidad {

    // Atributos

   private String nombreUniversidad;
   private String alumnos;
   private String carreras;


    // Constructor

    public Univesidad() {

    }

    // Getters and Setters

    public String getNombre_universidad() {
        return nombreUniversidad;
    }

    public void setNombre_universidad(String nombre_universidad) {
        this.nombreUniversidad = nombre_universidad;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public String getCarreras() {
        return carreras;
    }

    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    // Métodos Propios

    public String detalleUniversidad(){
        String sv = "El nombre de la Universidad es: " + getNombre_universidad() + "\n" +
        "Los alumonos ingresados fueron: " + getAlumnos()+ "\n" +
        "Las carreras de esta Universidad son: " + getCarreras() + "\n";
        return sv;
    }
}
