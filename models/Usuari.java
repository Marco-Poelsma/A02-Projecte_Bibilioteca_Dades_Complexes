package models;

public class Usuari {
	private String nomUsuari;
    private String contrasenya;
    private String nom;
    private String cognoms;
    private String email;
    private String telefon;
    private String adreca;
    private String poblacio;
    private String provincia;
    private String codiPostal;
    private String pais;
    private String idioma;
    
    public Usuari(String nomUsuari, String contrasenya, String nom, String cognoms, String email, String telefon, String adreca, String poblacio, String provincia, String codiPostal, String pais, String idioma) {
        this.nomUsuari = nomUsuari;
        this.contrasenya = contrasenya;
        this.nom = nom;
        this.cognoms = cognoms;
        this.email = email;
        this.telefon = telefon;
        this.adreca = adreca;
        this.poblacio = poblacio;
        this.provincia = provincia;
        this.codiPostal = codiPostal;
        this.pais = pais;
        this.idioma = idioma;
    }

    public Usuari() {
        this.nomUsuari = null;
        this.contrasenya = null;
        this.nom = null;
        this.cognoms = null;
        this.email = null;
        this.telefon = null;
        this.adreca = null;
        this.poblacio = null;
        this.provincia = null;
        this.codiPostal = null;
        this.pais = null;
        this.idioma = null;
    }

    public String getNomUsuari() {
        return nomUsuari;
    }
    public String getContrasenya() {
        return contrasenya;
    }
    public String getNom() {
        return nom;
    }
    public String getCognoms() {
        return cognoms;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getAdreca() {
        return adreca;
    }
    public String getPoblacio() {
        return poblacio;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getCodiPostal() {
        return codiPostal;
    }
    public String getPais() {
        return pais;
    }
    public String getIdioma() {
        return idioma;
    }

    public void setNomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String toString() {
        return "Usuari{" +
                "nomUsuari='" + nomUsuari + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adreca='" + adreca + '\'' +
                ", poblacio='" + poblacio + '\'' +
                ", provincia='" + provincia + '\'' +
                ", codiPostal='" + codiPostal + '\'' +
                ", pais='" + pais + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
