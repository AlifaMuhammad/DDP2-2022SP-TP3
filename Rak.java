public class Rak {
    private int size;
    private String kategori;
    private Obat[] daftarObat;

    public Rak(int size, String kategori){
        this.kategori = kategori;
        this.daftarObat = new Obat[size];
        this.size = size;
    }

    /**
     * method getter getKategoriRak yang digunakan untuk mendapatkan kategori rak.
     * Method ini mengembalikan nilai dari variabel kategori.
     */
    public String getKategoriRak() {
        return kategori;
    }

    /**
     * method tambahObat yang digunakan untuk menambahkan objek Obat ke dalam rak pada posisi yang ditentukan. 
     * Method ini menerima objek Obat, serta indeks belakang, 
     * dan menempatkan obat ke dalam array daftarObat pada posisi yang sesuai.
     */
    public void tambahObat(Obat obat, int belakang) {
        if (daftarObat[belakang] == null) {
            daftarObat[belakang] = obat;
            System.out.println("Obat berhasil ditambahkan");
        } else {
            System.out.println("Rak sudah terisi obat");
        }
    }

    /**
     * method getter getSize yang digunakan untuk mendapatkan ukuran rak.
     * Method ini mengembalikan nilai dari variabel size.
     */
    public int getSize() {
        return size;
    }
  

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

    /**
     * method cariObat yang digunakan untuk memeriksa apakah obat tertentu ada dalam rak. 
     * Method ini akan mencari obat dengan nama yang sesuai dalam array daftarObat 
     * dan mengembalikan nilai true jika ditemukan, dan false jika tidak.
     */
    public boolean cariObat(Obat obat) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (daftarObat[j] != null && daftarObat[j].getNama().equals(obat.getNama())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * method beliObat yang memungkinkan pengguna untuk membeli obat dari rak berdasarkan nama obat 
     * dan jumlah yang diinginkan. Method ini akan mencari obat dengan nama yang sesuai dalam array daftarObat, 
     * mengurangi stok obat sesuai dengan jumlah yang dibeli, dan mengembalikan nilai true jika pembelian berhasil
     * atau false jika stok obat tidak mencukupi.
     * @param namaObat
     * @return
     */
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

    /**
     * metohd searchObat yang digunakan untuk mencari obat dalam rak berdasarkan nama obat. 
     * Method ini akan mencari obat dengan nama yang sesuai dalam array daftarObat 
     * dan mengembalikan objek Obat yang ditemukan, atau null jika tidak ditemukan.
     */
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

    public Obat[] getListObat() {
        return null;
    }
}
