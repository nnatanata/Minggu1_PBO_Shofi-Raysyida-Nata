/*
    Nama File   : Titik.java
    Deskripsi   : Berisi atribut dan method dalam class Titik
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Februari 2024
*/

public class Titik {
    /***********ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***********METHOD***************/
    //Konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0, 0);
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    // Menggeser titik sejauh (x, y)
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Menentukan kuadran titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }

    // Menghitung jarak titik ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Menghitung jarak antara titik dengan titik lain
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    // Refleksi terhadap sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat; 
    }

    // Refleksi terhadap sumbu Y
    void refleksiY() {
        this.absis = -this.absis; 
    }

    // Menghasilkan titik baru hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Menghasilkan titik baru hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    // Mencetak titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
