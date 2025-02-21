/*
    Nama File   : MTitik.java
    Deskripsi   : Program utama untuk mengelola class Titik
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Februari 2024
*/

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek 
        Titik T1 = new Titik(); 
        T1.setAbsis(3);
        T1.setOrdinat(4);

        System.out.println("===Titik T1===");
        T1.printTitik();
        System.out.println("==============");

        // Menggeser T1
        T1.geser(3, 4);
        System.out.println("===Geser T1===");
        T1.printTitik();
        System.out.println("==============");

        // Membuat objek T2
        Titik T2 = new Titik(3, 5);
        System.out.println("===Titik T2===");
        T2.printTitik();
        System.out.println("==============");

        // Menampilkan jumlah objek Titik
        System.out.println("===Jumlah Objek===");
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("==================");

        // Menampilkan kuadran T1 dan T2
        System.out.println("===Kuadran===");
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("=============");

        // Jarak T1 ke pusat
        System.out.println("===Jarak ke Pusat===");
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());
        System.out.println("====================");

        // Jarak antara T1 dan T2
        System.out.println("===Jarak T1 ke T2===");
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));
        System.out.println("=====================");

        // Refleksi terhadap sumbu X
        T1.refleksiX();
        System.out.println("===Refleksi X T1===");
        T1.printTitik();
        System.out.println("===================");

        // Refleksi terhadap sumbu Y
        T2.refleksiY();
        System.out.println("===Refleksi Y T2===");
        T2.printTitik();
        System.out.println("===================");

        // Mendapatkan titik baru hasil refleksi X
        Titik refleksiXT1 = T1.getRefleksiX();
        System.out.println("===Get Refleksi X T1===");
        refleksiXT1.printTitik();
        System.out.println("=======================");

        // Mendapatkan titik baru hasil refleksi Y
        Titik refleksiYT2 = T2.getRefleksiY();
        System.out.println("===Get Refleksi Y T2===");
        refleksiYT2.printTitik();
        System.out.println("=======================");
    }
}
