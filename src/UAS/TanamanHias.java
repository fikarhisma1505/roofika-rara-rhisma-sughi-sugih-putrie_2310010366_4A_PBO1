package UAS;

// Superclass
public class TanamanHias {
    // Atribut dengan enkapsulasi
    private String namaTanaman;
    private int hargaTanaman;

    // Konstruktor
    public TanamanHias(String namaTanaman, int hargaTanaman) {
        this.namaTanaman = namaTanaman;
        this.hargaTanaman = hargaTanaman;
    }

    // Mutator (setter)
    public void setNamaTanaman(String namaTanaman) {
        this.namaTanaman = namaTanaman;
    }

    public void setHargaTanaman(int hargaTanaman) {
        this.hargaTanaman = hargaTanaman;
    }

    // Accessor (getter)
    public String getNamaTanaman() {
        return namaTanaman;
    }

    public int getHargaTanaman() {
        return hargaTanaman;
    }

    // Polymorphism (method bisa di-override)
    public String tampilkanInfo() {
        return "Nama Tanaman : " + namaTanaman + 
               "\nHarga : " + hargaTanaman;
    }
}

