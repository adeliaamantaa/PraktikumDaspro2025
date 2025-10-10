//Adelia Amanta Putri, 01
import java.util.Scanner;

public class AksesMasukPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- AKSES MASUK PERPUSTAKAAN ---");
        System.out.println("Untuk mendapatkan akses masuk, Anda harus membawa KTM atau sudah registrasi online.");
        System.out.print("Apakah Anda memenuhi salah satu syarat tersebut? (Ya/Tidak): ");
        String jawaban = sc.nextLine().trim();

        boolean aksesMasuk = jawaban.equalsIgnoreCase("Ya");

        String pesan = (aksesMasuk)
                ? "\n Akses Diizinkan\nSelamat datang di Perpustakaan Kampus!"
                : "\n Akses Ditolak\nMohon maaf, Anda belum memenuhi syarat masuk.";

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println(pesan);

        sc.close();
    }
}
