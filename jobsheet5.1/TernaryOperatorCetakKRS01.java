//Adelia Amanta Putri, 01
import java.util.Scanner;

public class TernaryOperatorCetakKRS01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) :");
        boolean uktLunas = sc.nextBoolean();

        String pesan = (uktLunas)
                ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
                : "KRS akan diberikan setelah pembayaran UKT dilakukan\nSilahkan lunasi pembayaran UKT terlebih dahulu";

        System.out.println("\n--- Versi Ternary Operator ---");
        System.out.println(pesan);
    }
}