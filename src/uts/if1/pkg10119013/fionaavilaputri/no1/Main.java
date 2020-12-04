/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package uts.if1.pkg10119013.fionaavilaputri.no1;

/**
 *
 * @author Fiona Avila
 */



import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        No1 n = new No1();
        System.out.print("Masukkan tahun lahir anda : ");
        Scanner scanAge = new Scanner(System.in);
        n.setYearBirth(scanAge.nextInt());
        System.out.println();
        System.out.println("=====HASIL PERHITUNGAN UMUR=====");
        System.out.println("Tahun lahir anda\t: " + n.getYearBirth());
        System.out.println("Hari ini tahun\t\t: " + n.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + n.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + n.tandanyaKamu(n.hitungUmur()));
    }
}
