import java.util.Scanner;

public class TokoTanaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TanamanHias[] tanaman = new TanamanHias[2];

        for (int i = 0; i < tanaman.length; i++) {
            try {
                System.out.println("\nInput Tanaman ke-" + (i + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                System.out.print("Jenis (Indoor/Outdoor): ");
                String jenis = scanner.nextLine();

                System.out.print("Warna: ");
                String warna = scanner.nextLine();

                System.out.print("Harga: ");
                double harga = Double.parseDouble(scanner.nextLine());

                // SELEKSI
                if (!jenis.equalsIgnoreCase("Indoor") && !jenis.equalsIgnoreCase("Outdoor")) {
                    System.out.println("Jenis tidak dikenal. Diset sebagai 'Lainnya'.");
                    jenis = "Lainnya";
                }

                tanaman[i] = new TanamanHias(nama, jenis, warna, harga);

            } catch (NumberFormatException e) {
                System.out.println("Input harga harus berupa angka. Ulangi dari awal!");
                i--; // ulangi input
            }
        }

        // PERULANGAN
        System.out.println("\nDaftar Tanaman:");
        for (TanamanHias t : tanaman) {
            System.out.println("----------------");
            System.out.println(t.displayInfo());
        }

        scanner.close();
    }
}
