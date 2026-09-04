import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Ana",
                "Ingeniería en Informática",
                20
        );

        estudiante.mostrarInformacion();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        Estudiante estudiante2 = new Estudiante(nombre, carrera, edad);
        estudiante2.mostrarInformacion();

        if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven.");
        } else {
            System.out.println("Estudiante adulto.");
        }


    }
}