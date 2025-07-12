package UAS;

import java.util.Scanner;

public class TokoTanaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TanamanHias[] daftarTanaman = new TanamanHias[3];
        int totalTanaman = 0;

        System.out.println("=== Aplikasi Penjualan Tanaman Hias ===");

        // Input data tanaman
        for (int i = 0; i < daftarTanaman.length; i++) {
            try {
                System.out.print("\nMasukkan Nama Tanaman : ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan Harga Tanaman : ");
                int harga = Integer.parseInt(scanner.nextLine());

                System.out.print("Apakah Tanaman Ini Jenis Dekoratif? (YA/TIDAK) : ");
                String opsi = scanner.nextLine();

                if (opsi.equalsIgnoreCase("YA")) {
                    System.out.print("Masukkan Jenis Tanaman : ");
                    String jenis = scanner.nextLine();
                    daftarTanaman[i] = new TanamanDekoratif(nama, harga, jenis);
                } else {
                    daftarTanaman[i] = new TanamanHias(nama, harga);
                }

                totalTanaman++;
            } catch (NumberFormatException e) {
                System.out.println("\nHarga harus berupa angka! Data tidak disimpan.");
            }
        }

        System.out.println("\n=== Daftar Tanaman di Toko ===\n");

        for (int i = 0; i < totalTanaman; i++) {
            System.out.println((i + 1) + ". " + daftarTanaman[i].tampilkanInfo());
        }

        scanner.close();
    }
}
