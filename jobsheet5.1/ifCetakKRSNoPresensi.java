import java.util.Scanner;


public class ifCetakKRSNoPresensi{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) :");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
        else {
            System.out.println("KRS akan diberikan setelah pembayaran UKT dilakukan");
            System.out.println("Silahkan lunasi pembayaran UKT terlebih dahulu");
        }
    }
}