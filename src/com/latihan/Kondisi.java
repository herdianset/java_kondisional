package com.latihan;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Kondisi {
    public static void main(String[] args) {
        //deklarasi variabel
        double tugas, kuis, uts, uas, nilai_akhir;
        String nilai_huruf;

        //membuat objek scanner untuk membaca input dari user
        Scanner baca = new Scanner(System.in);
        
        //menerima input dari user
        System.out.println("Input Nilai Mahasiswa");
        System.out.print("Nilai Tugas = ");
        tugas = baca.nextDouble();

        System.out.print("Nilai Kuis = ");
        kuis = baca.nextDouble();

        System.out.print("Nilai UTS = ");
        uts = baca.nextDouble();

        System.out.print("Nilau UAS = ");
        uas = baca.nextDouble();

        //menghitung nilai akhir berdasarkan bersentase
        nilai_akhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        //menentukan nilai huruf berdasarkan nilai akhir angka

        if (nilai_akhir >=85 && nilai_akhir <=100)
            nilai_huruf = "A";
        else if (nilai_akhir >= 65 && nilai_akhir < 85)
            nilai_huruf = "B";
        else if (nilai_akhir >=55 && nilai_akhir < 65)
            nilai_huruf = "C";
        else if (nilai_akhir >= 45 && nilai_akhir < 55)
            nilai_huruf = "D";
        else if (nilai_akhir >=0 && nilai_akhir < 45)
            nilai_huruf = "E";
        else
            nilai_huruf = "Tidak Valid";

        //menampilkan output
        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("Nilai Huruf : " + nilai_huruf);



    }
    
}
