import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> listaLibros;
    public ArrayList<Usuario> listaUsuarios;

    public Biblioteca() {
        this.listaLibros = new ArrayList<Libro>();
        this.listaUsuarios = new ArrayList<Usuario>();
    }

    public void registrarLibro(int isbn, String nombre, String autor, int anho) {
        listaLibros.add(new Libro(isbn, nombre, autor, anho));
    }

    public void registrarUsuario(String nombre, String apellidos, String dni) {
        listaUsuarios.add(new Usuario(nombre, apellidos, dni));
    }

    public void pedirLibro(String dni, int isbn){
        int indexUsuario=-1;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getDni().equals(dni)) {
                indexUsuario = i;
            }
        }

        if (indexUsuario==-1){
            System.out.println("El usuario no existe");
        }

        else{
            int indexLibro=-1;
            for (int k = 0; k < listaLibros.size(); k++) {
                if (listaLibros.get(k).getIsbn() == isbn) {
                    indexLibro = k;
                }
            }

            if (indexLibro==-1 || listaLibros.get(indexLibro).isPrestado()){
                System.out.println("El libro no existe o ya esta cogido");
            }
            else{
                listaUsuarios.get(indexUsuario).addLibro(listaLibros.get(indexLibro));
                listaLibros.get(indexLibro).setPrestado(true);
            }
        }
    }

    public void devolverLibro (String dni, int isbn) {

        int indexUsuario=-1;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getDni().equals(dni)) {
                indexUsuario = i;
            }
        }

        if (indexUsuario==-1){
            System.out.println("El usuario no existe");
        }

        else{
            int indexLibro=-1;
            for (int k = 0; k < listaUsuarios.get(indexUsuario).librosPrestados.size(); k++) {
                if (listaUsuarios.get(indexUsuario).librosPrestados.get(k).getIsbn() == isbn) {
                    indexLibro = k;
                }
            }

            if (indexLibro==-1){
                System.out.println("El libro no existe o no lo tienes");
            }
            else{
                listaUsuarios.get(indexUsuario).librosPrestados.get(indexLibro).setPrestado(false);
                listaUsuarios.get(indexUsuario).librosPrestados.remove(indexLibro);
            }
        }
    }

    public void mostrarUsuarios() {
        for (Usuario a: listaUsuarios) {
            System.out.println(a.toString());
        }
    }
}
