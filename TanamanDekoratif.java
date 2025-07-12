package UAS;

// Inheritance dari TanamanHias
public class TanamanDekoratif extends TanamanHias {
    private String jenisTanaman;

    public TanamanDekoratif(String namaTanaman, int hargaTanaman, String jenisTanaman) {
        super(namaTanaman, hargaTanaman); // memanggil konstruktor superclass
        this.jenisTanaman = jenisTanaman;
    }

    // Override method tampilkanInfo
    @Override
    public String tampilkanInfo() {
        return "Nama Tanaman Dekoratif : " + getNamaTanaman() + 
               "\nHarga : " + getHargaTanaman() + 
               "\nJenis : " + jenisTanaman;
    }
}

