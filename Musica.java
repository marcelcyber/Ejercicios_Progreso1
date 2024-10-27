public class Musica {

    // Atributos
    private String genero ;
    private String fecha ;
    private String lugar ;

    // Constructor
    public Musica(){




    }

    // Setters and Getters

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // Métodos Propios

    public String detalle_musica(){
        String dv = "El genero de la cancion es -> " + getGenero() + "\n" +
                "fecha -> " + getFecha() + "\n" +
                "lugar -> " + getLugar() + "\n" ;
        return dv;

    }
}
