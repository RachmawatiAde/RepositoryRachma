public class View {
    public void tampilkanInfo(String nama, int harga, int stok) {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang : " + stok);
    }

    public void tampilkanTotalBayar(int totalBayar) {
        System.out.println("Jumlah Bayar : " + totalBayar);
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }
}
