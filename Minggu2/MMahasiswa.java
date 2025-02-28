/*
    Nama File   : MMahasiswa.java
    Deskripsi   : Program utama untuk mengelola class Mahasiswa
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Februari 2024
*/

public class MMahasiswa {
    public static void main(String[] args) {
        // Dosen
        Dosen dosen1 = new Dosen("21456", "Drs. Eko Adi Sarwoko, M.Komp.", "Informatika");
        Dosen dosen2 = new Dosen("67809", "Dr. Ani Wijaya", "Sistem Informasi");
        Dosen dosen3 = new Dosen("32875", "Dr. The Weekday", "Informatika");

        // Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("N 4 TA", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan("D 5678 EF", "Mobil");
        Kendaraan kendaraan3 = new Kendaraan("P 50 IF", "Motor");

        // MataKuliah
        MataKuliah matkul1 = new MataKuliah("IF101", "Analisis dan Strategi Algoritma", 3);
        MataKuliah matkul2 = new MataKuliah("IF102", "Pemograman Berorientasi Objek", 3);
        MataKuliah matkul3 = new MataKuliah("SI201", "Basis Data", 3);
        MataKuliah matkul4 = new MataKuliah("SI202", "Manajemen TI", 2);

        // Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("24060123120007", "Shofi Rasyida Nata", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("25060123130008", "Fairuzy Dafa Meidha", "Sistem Informasi");
        Mahasiswa mahasiswa3 = new Mahasiswa("24060123140122", "Lana Del Rey", "Informatika");

        mahasiswa1.setDosenWali(dosen1);
        mahasiswa1.setKendaraan(kendaraan1);

        mahasiswa2.setDosenWali(dosen2);
        mahasiswa2.setKendaraan(kendaraan2);

        mahasiswa3.setDosenWali(dosen3);
        mahasiswa3.setKendaraan(kendaraan3);

        mahasiswa1.addMatKul(matkul1);
        mahasiswa1.addMatKul(matkul2);

        mahasiswa2.addMatKul(matkul3);
        mahasiswa2.addMatKul(matkul4);

        mahasiswa3.addMatKul(matkul1);
        mahasiswa3.addMatKul(matkul2);

        System.out.println("===== DETAIL MAHASISWA 1 =====");
        mahasiswa1.printDetailMhs();
        System.out.println();
        
        System.out.println("===== DETAIL MAHASISWA 2 =====");
        mahasiswa2.printDetailMhs();
        System.out.println();

        System.out.println("===== DETAIL MAHASISWA 3 =====");
        mahasiswa3.printDetailMhs();
    }
}
