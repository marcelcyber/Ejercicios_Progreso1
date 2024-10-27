import java.io.IOException;
import java.util.Scanner;

public class Practica_Potente {

    public static void main(String[] args) throws IOException{

        Univesidad u = new Univesidad();
        Estudiante e = new Estudiante();

        Scanner sc = new Scanner(System.in);

        // Clase Universidad

        System.out.println("Ingrese el nombre de la Universidad: ");
        String universidad = sc.nextLine();
        u.setNombre_universidad(universidad);

        System.out.println("Ingrese el nombre del alumno ingresado a la Universidad: ");
        String hey = sc.nextLine();
        u.setAlumnos(hey);

        System.out.println("Ingrese las carrera del estudiante : ");
        String i = sc.nextLine();
        u.setCarreras(i);


        // Clase Estudiante

        System.out.println("Ingrese el Id del Estudiante: ");
        String ide = sc.nextLine();
        e.setId(ide);

        //ERROR

        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        e.setEdad(edad);

        // Llamamiento de métodos

        System.out.println(u.detalleUniversidad());
        System.out.println(e.detalleEstudiante());

        sc.close();
    }
}
