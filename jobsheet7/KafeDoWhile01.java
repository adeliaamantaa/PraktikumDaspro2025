package jobsheet7;
import java.util.Scanner;
// Adelia Amanta Putri, 01
public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.print("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // Jika pelanggan mengetik "batal", keluar dari perulangan
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Terima kasih!");
                break;
            }

            System.out.print("Masukkan jumlah kopi yang dibeli: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh yang dibeli: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti yang dibeli: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            System.out.println("\n===== STRUK PEMBELIAN =====");
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("Total Harga    : Rp " + totalHarga);
            System.out.println("===========================");

            sc.nextLine(); // Membersihkan newline dari buffer

        } while (true); // Perulangan terus berjalan sampai user mengetik "batal"

        sc.close();
    }
}
