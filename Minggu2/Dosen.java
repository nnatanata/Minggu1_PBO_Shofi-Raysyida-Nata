/* Nama File    : Dosen.java
    Deskripsi   : Berisi atribut dan method dalam class Dosen
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Februari 2024 */

public class Dosen {
    /**************** ATRIBUT ****************/
    private String nip;
    private String nama;
    private String prodi;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public Dosen() {
        nip = " ";
        nama = " ";
        prodi = " ";
    }
   
    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor / getter
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    // Mutator / setter
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
