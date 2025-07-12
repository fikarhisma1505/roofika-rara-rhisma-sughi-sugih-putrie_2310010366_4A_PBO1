# Proyek Sistem Penjualan Tanaman Hias

Proyek ini adalah aplikasi konsol sederhana yang dibuat menggunakan Java untuk mendemonstrasikan konsep dasar Pemrograman Berorientasi Objek (PBO) seperti **inheritance (pewarisan)**, **polymorphism (polimorfisme)**, dan **encapsulation (enkapsulasi)** dalam konteks sistem penjualan tanaman hias.

## Deskripsi Aplikasi

Aplikasi ini memungkinkan pengguna untuk:
* Memasukkan data tanaman hias, termasuk nama dan harga.
* Memasukkan data tanaman hias yang spesifik sebagai **tanaman dekoratif** yang memiliki atribut tambahan berupa "jenis tanaman".
* Menampilkan daftar tanaman yang telah dimasukkan beserta informasinya.
* Menangani kesalahan input (misalnya, jika harga bukan angka).

## Konsep PBO yang Diterapkan

* **Enkapsulasi**: Atribut `namaTanaman` dan `hargaTanaman` pada kelas `TanamanHias` bersifat `private` dan diakses melalui metode getter (`getNamaTanaman()`, `getHargaTanaman()`) serta dimodifikasi melalui metode setter (`setNamaTanaman()`, `setHargaTanaman()`).
* **Inheritance (Pewarisan)**: Kelas `TanamanDekoratif` mewarisi properti dan metode dari kelas `TanamanHias`. Ini ditunjukkan oleh `public class TanamanDekoratif extends TanamanHias`.
* **Polimorfisme**: Metode `tampilkanInfo()` di kelas `TanamanHias` dapat di-override di kelas `TanamanDekoratif` untuk menyediakan informasi yang lebih spesifik untuk tanaman dekoratif. Dalam kelas `TokoTanaman`, objek `TanamanHias` atau `TanamanDekoratif` dapat disimpan dalam array `TanamanHias[]` dan memanggil `tampilkanInfo()` yang sesuai pada saat runtime.

## Struktur File

* `TokoTanaman.java`:
    * Kelas utama yang berisi metode `main()`.
    * Bertanggung jawab untuk menerima input pengguna, membuat objek `TanamanHias` atau `TanamanDekoratif`, dan menampilkannya.
    * Menerapkan penanganan `NumberFormatException` untuk input harga.
* `TanamanHias.java`:
    * Merupakan `superclass` untuk semua jenis tanaman.
    * Memiliki atribut `namaTanaman` dan `hargaTanaman`.
    * Menyediakan konstruktor, getter, dan setter.
    * Memiliki metode `tampilkanInfo()` dasar.
* `TanamanDekoratif.java`:
    * Merupakan `subclass` dari `TanamanHias` (`extends TanamanHias`).
    * Memiliki atribut tambahan `jenisTanaman`.
    * Meng-override metode `tampilkanInfo()` untuk menyertakan `jenisTanaman`.

## Cara Menggunakan

**Prasyarat:**
Pastikan Anda telah menginstal [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) di sistem Anda (disarankan JDK 8 atau versi yang lebih baru).

**Kompilasi:**
1.  Unduh atau klon repositori ini ke komputer lokal Anda.
2.  Buka terminal atau command prompt.
3.  Navigasikan ke direktori `UAS` di mana file `.java` berada.
    ```bash
    cd <lokasi_folder_project_anda>/UAS
    ```
4.  Kompilasi semua file Java:
    ```bash
    javac TokoTanaman.java TanamanHias.java TanamanDekoratif.java
    ```
    Atau Anda bisa menggunakan:
    ```bash
    javac *.java
    ```

**Eksekusi:**
Setelah kompilasi berhasil, Anda dapat menjalankan aplikasi dari direktori `UAS`:

```bash
java TokoTanaman
