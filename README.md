# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengelolaan data tanaman hias menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini mensimulasikan pengelolaan informasi tanaman hias seperti nama, jenis, warna, dan harga. Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti:

- Class  
- Object  
- Atribut  
- Method Constructor  
- Method Mutator  
- Method Accessor  
- Encapsulation  
- Inheritance  
- Overriding  
- IO sederhana  

## Penjelasan Kode

1. **Class**  
   Digunakan untuk membuat struktur dasar objek. Class yang digunakan adalah `TanamanDekoratif`, `TanamanHias`, dan `TokoTanaman`.

   ```java
   public class TanamanDekoratif { ... }

   public class TanamanHias extends TanamanDekoratif { ... }

   public class TokoTanaman { ... }
   ```

2. **Object**  
   Dibuat untuk mewakili data tanaman secara individual.

   ```java
   TanamanHias[] tanaman = new TanamanHias[2];
   tanaman[0] = new TanamanHias("Aglonema", "Indoor", "Hijau", 50000);
   ```

3. **Atribut**  
   Merupakan variabel dalam class yang menyimpan data.

   ```java
   private String nama;
   private String jenis;
   private String warna;
   private double harga;
   ```

4. **Constructor**  
   Digunakan untuk inisialisasi data saat objek dibuat.

   ```java
   public TanamanDekoratif(String nama, String jenis, String warna, double harga) {
       this.nama = nama;
       this.jenis = jenis;
       this.warna = warna;
       this.harga = harga;
   }
   ```

5. **Mutator (Setter)**  
   Digunakan untuk mengubah nilai atribut.

   ```java
   public void setNama(String nama) {
       this.nama = nama;
   }
   ```

6. **Accessor (Getter)**  
   Digunakan untuk mengambil nilai atribut.

   ```java
   public String getNama() {
       return nama;
   }
   ```

7. **Encapsulation**  
   Dicapai dengan membuat atribut bersifat `private` dan akses melalui getter/setter.

   ```java
   private String nama; // tidak bisa diakses langsung dari luar
   ```

8. **Inheritance**  
   Ditunjukkan oleh class `TanamanHias` yang mewarisi class `TanamanDekoratif`.

   ```java
   public class TanamanHias extends TanamanDekoratif
   ```

9. **Overriding**  
   Digunakan untuk mengganti method dari superclass di subclass.

   ```java
   @Override
   public String displayInfo() {
       return super.displayInfo() + "\nJenis Tanaman: " + getJenis();
   }
   ```

10. **IO Sederhana**  
    Digunakan untuk mencetak data tanaman ke layar.

    ```java
    System.out.println(tanaman[i].displayInfo());
    ```

## Usulan Nilai

| No  | Materi         | Nilai |
| :-: | -------------- | :---: |
|  1  | Class          |  5    |
|  2  | Object         |  5    |
|  3  | Atribut        |  5    |
|  4  | Constructor    |  5    |
|  5  | Mutator        |  5    |
|  6  | Accessor       |  5    |
|  7  | Encapsulation  |  5    |
|  8  | Inheritance    |  5    |
|  9  | Polymorphism   |  5    |
| 10  | Seleksi        |  0    |
| 11  | Perulangan     |  0    |
| 12  | IO Sederhana   | 10    |
| 13  | Array          | 15    |
| 14  | Error Handling |  0    |
|     | **TOTAL**      | **75** |

## Pembuat

**Nama**: Roofika Rara Rhisma Sughi Sugih Putrie  
**NPM**: 2310010203
