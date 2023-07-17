public class Rak {
    private int size;
    private String kategori;
    private Obat[] daftarObat;

    public Rak(int size, String kategori){
        this.kategori = kategori;
        this.daftarObat = new Obat[size];
        this.size = size;
    }

    // TODO : Implementasi method getKategoriRak
    public String getKategoriRak() {
        return kategori;
    }

    // TODO : Implementasi method tambahObat
    public void tambahObat(Obat obat, int belakang) {
        if (daftarObat[belakang] == null) {
            daftarObat[belakang] = obat;
            System.out.println("Obat berhasil ditambahkan");
        } else {
            System.out.println("Rak sudah terisi obat");
        }
    }

    public int getSize() {
        return size;
    }
  
    // TODO : Implementasi method printRak
    public void printRak(){
        for (int j = 0; j < size; j++) {
            if (daftarObat[j] == null) {
                System.out.print("| kosong ");
            } else {
                System.out.print("| " + daftarObat[j].getNama() + " (stock: " + daftarObat[j].getStok() + ")");
            }
        }
        System.out.println();
    }


    public boolean containsObat(Obat obat) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (daftarObat[j] != null && daftarObat[j].getNama().equals(obat.getNama())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean beliObat(Obat obat, int jumlah) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (daftarObat[j] != null && daftarObat[j].getNama().equals(obat.getNama())) {
                    if (daftarObat[j].getStok() >= jumlah) {
                        daftarObat[j].setStok(daftarObat[j].getStok() - jumlah);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Obat searchObat(String namaObat) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (daftarObat[j] != null && daftarObat[j].getNama().equals(namaObat)) {
                    return daftarObat[j];
                }
            }
        }
        return null;
    }

    // TODO : Implementasi method getListObat
    public Obat[] getListObat() {
        return null;
    }
    
}
