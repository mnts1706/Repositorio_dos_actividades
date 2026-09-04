import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


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
        for (int estudiantex = 1; estudiantex <= 5; estudiantex++) {
            System.out.println("Asignando estudiante " + estudiantex);
        }

        int eleccion=-1;
                while (eleccion!=0){
                    System.out.println("=== SISTEMA DUOC ===");
                    System.out.println("1. Mostrar estado");
                    System.out.println("2. Procesar operación");
                    System.out.println("0. Salir");

                    System.out.print("Seleccione una opción: ");
                    eleccion = scanner.nextInt();
                    if (eleccion == 1) {
                        System.out.println("Sistema operativo.");
                    } else if (eleccion == 2) {
                        System.out.println("Procesando operación...");
                    } else if (eleccion == 0) {
                        System.out.println("Cerrando sistema...");
                    }
                }
    }
}









