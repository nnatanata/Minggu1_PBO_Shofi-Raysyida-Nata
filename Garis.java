/*
    Nama File   : Garis.java
    Deskripsi   : Kelas yang merepresentasikan garis dengan titik awal dan titik akhir.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Februari 2024
*/

public class Garis {
    /***********ATRIBUT***************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /***********METHOD***************/
    // Konstruktor tanpa parameter
    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Getter dan Setter untuk Titik Awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Getter dan Setter untuk Titik Akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Getter untuk counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Menghitung gradien garis
    double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        
        if (dx == 0) {
            return 0; 
        }
        return dy / dx;
    }

    // Mengembalikan titik tengah garis
    Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Cek apakah garis sejajar dengan garis lain
    boolean isSejajar(Garis g) {
        double dx1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double dx2 = g.titikAkhir.getAbsis() - g.titikAwal.getAbsis();

        return (dx1 == 0 && dx2 == 0) || (this.getGradien() == g.getGradien()); 
    }

    // Cek apakah garis tegak lurus dengan garis lain
    boolean isTegakLurus(Garis g) {
        double dx1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double dy1 = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
        double dx2 = g.titikAkhir.getAbsis() - g.titikAwal.getAbsis();
        double dy2 = g.titikAkhir.getOrdinat() - g.titikAwal.getOrdinat();

        return (dx1 == 0 && dy2 == 0) || (dx2 == 0 && dy1 == 0) || (this.getGradien() * g.getGradien() == -1);
    }

    // Menampilkan informasi titik awal dan titik akhir
    void printGaris() {
        System.out.println("Garis dari (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() +
                        ") ke (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk y = mx + c
    String getPersamaanGaris() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();

        if (dx == 0) {
            return "Garis vertikal dengan persamaan x = " + titikAwal.getAbsis();
        }

        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());

        String hasil = "y = " + m + "x ";
        if (c >= 0) {
            hasil = hasil + "+ " + c;
        } else {
            hasil = hasil + "- " + Math.abs(c);
        }
        return hasil;
    }

}
