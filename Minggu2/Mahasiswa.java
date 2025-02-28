/* Nama File    : Mahasiswa.java
    Deskripsi   : Berisi atribut dan method dalam class Mahasiswa
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Februari 2024 */

import java.util.ArrayList;

public class Mahasiswa {
    /**************** ATRIBUT ****************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    // Selektor / getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatKul) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    // Mutator / setter
    public void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul) {
        if (listMatKul.size() < 50) {
            listMatKul.add(newMatKul);
        } else {
            System.out.println("Mata kuliah sudah mencapai batas maksimal!");
        }
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ada"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getNoPlat() + " - " + kendaraan.getJenis() : "Tidak memiliki kendaraan"));
        
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mk : listMatKul) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
    }
}
