public class Estudiante {

    // Atributos

    public String id;
    public int edad;

    // Constructor

    public Estudiante(){

    }


    // Getters and Setters

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }


    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    // Métodos Propios

     public String detalleEstudiante(){
      String sbbb = "El id del estudiante es: " + getId() + "\n" +
      "La edad del estudiante es: " + getEdad() + "\n";
      return sbbb;
    }
}