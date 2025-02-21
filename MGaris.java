/*
    Nama File   : MGaris.java
    Deskripsi   : Program utama untuk mengelola class Garis
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Februari 2024
*/

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Titik C = new Titik(0, 0);
        Titik D = new Titik(4, 0);
        Titik E = new Titik(2, 2);
        Titik F = new Titik(2, 6);

        // Membuat objek garis
        Garis g1 = new Garis(A, B);
        Garis g2 = new Garis(C, D);
        Garis g3 = new Garis(E, F);

        // Garis 1
        System.out.println("\n========== Garis 1 ==========");
        g1.printGaris();
        System.out.println("Gradien: " + g1.getGradien());
        System.out.println("Panjang: " + g1.getPanjang());
        System.out.println("Titik Tengah: (" + g1.getTitikTengah().getAbsis() + ", " + g1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + g1.getPersamaanGaris());

        // Garis 2
        System.out.println("\n========== Garis 2 ==========");
        g2.printGaris();
        System.out.println("Gradien: " + g2.getGradien());
        System.out.println("Panjang: " + g2.getPanjang());
        System.out.println("Titik Tengah: (" + g2.getTitikTengah().getAbsis() + ", " + g2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + g2.getPersamaanGaris());

        // Garis 3
        System.out.println("\n========== Garis 3 ==========");
        g3.printGaris();
        System.out.println("Gradien: " + g3.getGradien());
        System.out.println("Panjang: " + g3.getPanjang());
        System.out.println("Titik Tengah: (" + g3.getTitikTengah().getAbsis() + ", " + g3.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + g3.getPersamaanGaris());

        // Cek apakah garis sejajar
        System.out.println("\n========== Pengecekan Garis Sejajar ==========");
        System.out.println("Apakah Garis 1 sejajar dengan Garis 2? " + g1.isSejajar(g2));
        System.out.println("Apakah Garis 1 sejajar dengan Garis 3? " + g1.isSejajar(g3));
        System.out.println("Apakah Garis 2 sejajar dengan Garis 3? " + g2.isSejajar(g3));

        // Cek apakah garis tegak lurus
        System.out.println("\n========== Pengecekan Garis Tegak Lurus ==========");
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2? " + g1.isTegakLurus(g2));
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 3? " + g1.isTegakLurus(g3));
        System.out.println("Apakah Garis 2 tegak lurus dengan Garis 3? " + g2.isTegakLurus(g3));

        // Menampilkan jumlah garis yang telah dibuat
        System.out.println("\n========== Total Garis ==========");
        System.out.println("Total garis yang dibuat: " + Garis.getCounterGaris());
    }
}
