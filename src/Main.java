//Programa principal
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Cantidad de contactos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, telefono, email));
                    break;
                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    agenda.buscarContacto(buscar);
                    break;
                case 3:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    agenda.eliminarContacto(eliminar);
                    break;
                case 4:
                    agenda.mostrarContactos();
                    break;
                case 5:
                    agenda.mostrarCantidadContactos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();

        } while (opcion != 6);

        sc.close();
    }
}
