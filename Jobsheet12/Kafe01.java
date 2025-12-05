package pertemuan14;

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

    public static void main(String[] args) {
        Menu("Adel","DISKON50", true);
    }
}
