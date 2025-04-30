public class Libro {
    public int isbn;
    public String nombre;
    public String autor;
    public int anho;
    public boolean prestado;


    public Libro(int isbn, String nombre, String autor, int anho) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.anho = anho;
        this.prestado = false;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", anho=" + anho +
                ", prestado=" + prestado +
                '}';
    }
}
