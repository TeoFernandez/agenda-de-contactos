import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto c) {
        contactos.add(c);
        System.out.println("Contacto agregado.");
    }

    public void eliminarContacto(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(i);
                eliminado = true;
                System.out.println("Contacto eliminado.");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado:");
                c.mostrarContacto();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto c : contactos) {
                c.mostrarContacto();
            }
        }
    }

    public void mostrarCantidadContactos(){
        int k=0;
        for (int i = 0; i < contactos.size(); i++){
            k++;
        }
        System.out.println("La cantidad de contactos: "+k);

    }

    public ArrayList<Contacto> buscarContactosPorLetra(char letra) {
        ArrayList<Contacto> resultado = new ArrayList<>();

        // Recorre cada contacto de la lista
        for (Contacto c : contactos) {
            // Convertí el nombre a minúsculas para comparar sin importar mayúsculas
            // y usá .charAt(0) para ver la primera letra
            if (c.getNombre().toLowerCase().charAt(0) == Character.toLowerCase(letra)) {
                // Si coincide, agregalo a la lista resultado
                resultado.add(c);
            }
        }
        // Devolvé la lista filtrada
        return resultado;
    }



}
