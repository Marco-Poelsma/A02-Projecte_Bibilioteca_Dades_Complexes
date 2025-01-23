import java.util.ArrayList;
import java.util.Scanner;
import models.*;

public class Biblioteca {
    Scanner scan = new Scanner(System.in);
    static ArrayList<Llibre> llibres;
    static ArrayList<Usuari> usuaris;
        
    public Biblioteca() {
        this.llibres = new ArrayList<>();
        this.usuaris = new ArrayList<>();
    }

    public void menu() {
        int opcio = 0;
        do {
            System.out.println("1. Afegir llibre");
            System.out.println("2. Afegir usuari");
            System.out.println("3. Llistar llibres");
            System.out.println("4. Llistar usuaris");
            System.out.println("5. Sortir");
            System.out.print("Opcio: ");
            opcio = scan.nextInt();
            scan.nextLine();
            switch(opcio) {
                case 1 -> afegirLlibre();
                case 2 -> afegirUsuari();
                case 3 -> llistarLlibres();
                case 4 -> llistarUsuaris();
                case 5 -> System.out.println("Adeu!");
                default -> System.out.println("Opcio incorrecta");
            }
        } while(opcio != 5);
    }

    public void afegirLlibre() {
        Llibre l = new Llibre();
        System.out.print("ISBN: ");
        l.setIsbn(scan.nextLine());
        System.out.print("Titol: ");
        l.setTitol(scan.nextLine());
        System.out.print("Autor: ");
        l.setAutor(scan.nextLine());
        System.out.print("Editorial: ");
        l.setEditorial(scan.nextLine());
        System.out.print("Any: ");
        l.setAny(scan.nextInt());
        System.out.print("Edicio: ");
        l.setEdicio(scan.nextInt());
        scan.nextLine();
        System.out.print("Categoria: ");
        l.setCategoria(scan.nextLine());
        llibres.add(l);
    }

    public void afegirUsuari() {
        Usuari u = new Usuari();
        System.out.print("Nom usuari: ");
        u.setNomUsuari(scan.nextLine());
        System.out.print("Contrasenya: ");
        u.setContrasenya(scan.nextLine());
        System.out.print("Nom: ");
        u.setNom(scan.nextLine());
        System.out.print("Cognoms: ");
        u.setCognoms(scan.nextLine());
        System.out.print("Email: ");
        u.setEmail(scan.nextLine());
        System.out.print("Telefon: ");
        u.setTelefon(scan.nextLine());
        System.out.print("Adreca: ");
        u.setAdreca(scan.nextLine());
        System.out.print("Poblacio: ");
        u.setPoblacio(scan.nextLine());
        System.out.print("Provincia: ");
        u.setProvincia(scan.nextLine());
        System.out.print("Codi postal: ");
        u.setCodiPostal(scan.nextLine());
        System.out.print("Pais: ");
        u.setPais(scan.nextLine());
        System.out.print("Idioma: ");
        u.setIdioma(scan.nextLine());
        usuaris.add(u);
    }

    public void llistarLlibres() {
        for(Llibre l : llibres) {
            System.out.println(l);
        }
    }

    public void llistarUsuaris() {
        for(Usuari u : usuaris) {
            System.out.println(u);
        }
    }

    public void llogarLlibre (Llibre l) {
        l.llogarLlibre();
    }
    
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        llibres.add(new Llibre("1234", "El Quijote", "Cervantes", "Anaya", 1605, 1, "Novela"));
        llibres.add(new Llibre("5678", "El Senyor dels Anells", "Tolkien", "Minotauro", 1954, 1, "Fantasia"));
        llibres.add(new Llibre("9101", "El Perfume", "Suskind", "Seix Barral", 1985, 1, "Novela"));
        usuaris.add(new Usuari("pereMar", "1234", "Pere", "Martinez", "pere_martinez_2003@hotmail.com", "666777888", "C/ Major, 1", "Barcelona", "Barcelona", "08001", "Espanya", "Catala"));
        usuaris.add(new Usuari("annaTor", "5678", "Anna", "Torres", "annator123@yandex.com", "666777999", "C/ Major, 2", "Barcelona", "Barcelona", "08002", "Espanya", "Castella"));
        usuaris.add(new Usuari("gonzMarta", "9101", "Marta", "Gonzalez", "cat.lover@yahoo.com", "666777000", "C/ Major, 3", "Barcelona", "Barcelona", "08003", "Espanya", "Catala"));
        b.menu();
    }
}
