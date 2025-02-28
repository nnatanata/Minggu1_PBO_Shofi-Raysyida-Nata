/* Nama File    : Kendaraan.java
    Deskripsi   : Berisi atribut dan method dalam class Kendaraan
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Februari 2024 */

public class Kendaraan {
    /**************** ATRIBUT ****************/
    private String noPlat;
    private String jenis; 

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = " ";
        jenis = " ";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor / getter
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // Selektor / setter
    public String setNoPlat() {
        return noPlat;
    }

    public String setJenis() {
        return jenis;
    }
}
