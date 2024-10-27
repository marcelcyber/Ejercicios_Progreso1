public class Automovilezz {

    // Atibutos

    private String marca;
    private String modelo;
    private String color;
    private float cilindraje;

    // Constructores

    public Automovilezz(){



    }

    // Getters an Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }


    // Métodos Propios del Programador

    public String detalleVeh(){
        String dv = "La marca es: " + getMarca() + "\n" +
        "El modelo es: " + getModelo() + "\n" +
        "El color es: " + getColor() + "\n" +
        "El cilindraje es: " + getCilindraje() + "\n";

        return dv;
    }

    public double consumoCombustible(){

        double pcc;
        pcc = (1200*0.7);
        return pcc;

    }

}
