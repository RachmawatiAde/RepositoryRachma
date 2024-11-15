public class Model {
    private String namaBarang;
    private int hargaBarang;
    private int stokBarang;

    public Model(String namaBarang, int hargaBarang, int stokBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang = stokBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void kurangiStok(int jumlah) {
        this.stokBarang -= jumlah;
    }
}
