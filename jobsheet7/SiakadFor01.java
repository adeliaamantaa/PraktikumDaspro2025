package jobsheet7;
import java.util.Scanner;
//Adelia Amanta Putri,01
public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        System.out.println("===== PROGRAM PENILAIAN MAHASISWA =====");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("\n==============================");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("------------------------------");
        System.out.println("Jumlah mahasiswa lulus        : " + lulus);
        System.out.println("(mahasiswa dengan nilai >= 60)");
        System.out.println("Jumlah mahasiswa tidak lulus  : " + tidakLulus);
        System.out.println("(mahasiswa dengan nilai < 60)");
        System.out.println("==============================");

        sc.close();
    }
}
