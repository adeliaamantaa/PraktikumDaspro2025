//Adelia Amanta Putri, 01
import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Identifikasi Angka Genap dan Ganjil ---");
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();

        String pesan = (angka % 2 == 0)
                ? "Angka " + angka + " adalah angka genap"
                : "Angka " + angka + " adalah angka ganjil";

        System.out.println(pesan);
    }
}
