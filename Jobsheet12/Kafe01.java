package pertemuan14;

import java.util.Scanner;

public class Kafe01 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember){
        System.out.println("=============================");
        System.out.println("\tRESTO KAFE");
        System.out.println("=============================");
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode Promo : " + kodePromo + "\nPromo berhasil diterapkan. Anda mendapat potongan sebesar 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Promo berhasil diterapkan. Anda mendapat potongan sebesar 50%!");  
        } else {
            System.out.println("Kode invalid.");
        }

        System.out.println("\n----- MENU RESTO CAFE -----");
        System.out.println("1. Kopi Hitam - Rp 15.ooo");
        System.out.println("2. Cappucino - Rp 20.ooo");
        System.out.println("3. Latte - Rp 22.ooo");
        System.out.println("4. Teh Tarik - Rp 12.ooo");
        System.out.println("5. Roti Bakar - Rp 10.ooo");
        System.out.println("6. Mie Goreng - Rp 18.ooo");
        System.out.println("\n============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan...");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000,20000,22000,12000,10000,18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Adel","DISKON50", true);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan nomor menu yang ingin anda pesan");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan");
        int banyakItem = sc.nextInt();
    
        int totalHarga = hitungTotalHarga01(pilihanMenu,banyakItem);
        
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
        System.out.println("\n----------------------------");

        sc.close(); 
    }
}
