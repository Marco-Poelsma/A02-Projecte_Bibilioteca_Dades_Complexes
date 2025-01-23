package models;
public class Llibre {
    private String isbn;
    private String titol;
    private String autor;
    private String editorial;
    private int any;
    private int edicio;
    private String categoria;
    private boolean llogat;

    public Llibre(String isbn, String titol, String autor, String editorial, int any, int edicio, String categoria) {
        this.isbn = isbn;
        this.titol = titol;
        this.autor = autor;
        this.editorial = editorial;
        this.any = any;
        this.edicio = edicio;
        this.categoria = categoria;
        this.llogat = false;
    }
    public Llibre() {
        this.isbn = null;
        this.titol = null;
        this.autor = null;
        this.editorial = null;
        this.any = 0;
        this.edicio = 0;
        this.categoria = null;
        this.llogat = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitol() {
        return titol;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getAny() {
        return any;
    }
    public int getEdicio() {
        return edicio;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAny(int any) {
        this.any = any;
    }
    public void setEdicio(int edicio) {
        this.edicio = edicio;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getLlogat() {
        return llogat;
    }

    public void llogarLlibre() {
        if (getLlogat()) {
            System.out.println("El llibre ja esta llogat");
        } else {
            this.llogat = true;
            System.out.println("Llibre llogat amb èxit!");
        }
    }

    public String toString() {
        return "Llibre [any=" + any + ", autor=" + autor + ", categoria=" + categoria + ", edicio=" + edicio + ", editorial="
                + editorial + ", isbn=" + isbn + ", titol=" + titol + ", llogat=" + llogat + "]";
    }
}