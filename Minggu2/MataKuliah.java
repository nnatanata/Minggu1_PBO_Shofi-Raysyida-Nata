/* Nama File    : MataKuliah.java
    Deskripsi   : Berisi atribut dan method dalam class MataKuliah
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Februari 2024 */

public class MataKuliah {
    /**************** ATRIBUT ****************/
    private String idMatKul;
    private String nama;
    private int sks;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public MataKuliah() {
        idMatKul = " ";
        nama = " ";
        sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor (getter)
    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Mutator (setter)
    public String setIdMatKul() {
        return idMatKul;
    }

    public String setNama() {
        return nama;
    }

    public int setSks() {
        return sks;
    }
}
