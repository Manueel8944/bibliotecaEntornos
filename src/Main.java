import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        String pause;
        int menu = -1;
        while (menu != 6) {
            System.out.println("=== GESTION DE LA BIBLIOTECA ===");
            System.out.println("1) Registrar usuario");
            System.out.println("2) Registrar libro");
            System.out.println("3) Pedir libro");
            System.out.println("4) Devolver libro");
            System.out.println("5) Mostrar usuarios");
            System.out.println("6) Salir");
            System.out.println("================================");
            System.out.print("Elije una opción: ");

            menu = sc.nextInt();

            System.out.flush();

            switch (menu) {

                case 1:
                    System.out.println("=== REGISTRAR USUARIO ===");

                    System.out.println("Nombre del usuario: ");
                    sc.nextLine();
                    String nombreUsuario = sc.nextLine();

                    System.out.println("Apellidos del usuario: ");
                    String apellidos = sc.nextLine();

                    System.out.println("DNI del usuario");
                    String dni = sc.nextLine();

                    biblioteca.registrarUsuario(nombreUsuario, apellidos, dni);

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;

                case 2:
                    System.out.println("=== REGISTRAR LIBRO ===");

                    System.out.println("ISBN del libro: ");
                    int isbn = sc.nextInt();

                    System.out.println("Nombre del libro: ");
                    sc.nextLine();
                    String nombreLibro = sc.nextLine();

                    System.out.println("Autor del libro");
                    String autor = sc.nextLine();

                    System.out.println("Año del libro: ");
                    int anho = sc.nextInt();

                    biblioteca.registrarLibro(isbn, nombreLibro, autor, anho);

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 3:
                    System.out.println("=== PEDIR LIBRO ===");

                    System.out.println("DNI del usuario: ");
                    sc.nextLine();
                    String Buscardni = sc.nextLine();

                    System.out.println("ISBN del libro: ");
                    int Buscarisbn = sc.nextInt();

                    biblioteca.pedirLibro(Buscardni, Buscarisbn);

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 4:
                    System.out.println("=== DEVOLVER LIBRO ===");

                    System.out.println("DNI del usuario");
                    sc.nextLine();
                    String Buscardni2 = sc.nextLine();

                    System.out.println("ISBN del libro: ");
                    int Buscarisbn2 = sc.nextInt();

                    biblioteca.devolverLibro(Buscardni2, Buscarisbn2);

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 5:
                    System.out.println("=== MOSTRAR USUARIOS ===");

                    biblioteca.mostrarUsuarios();

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 6:
                    System.out.println("=== SALIR ===");

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;

                default:
                    System.out.println("Error: Opción no válida, intentalo de nuevo.");

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
            }
        }
    }
}