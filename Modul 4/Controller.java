import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void prosesTransaksi() {
        Scanner in = new Scanner(System.in);
        view.tampilkanInfo(model.getNamaBarang(), model.getHargaBarang(), model.getStokBarang());
        
        view.tampilkanPesan("Transaksi Pembelian");
        view.tampilkanPesan("Jumlah barang: ");
        int qty = in.nextInt();

        if (qty > model.getStokBarang()) {
            view.tampilkanPesan("Stok tidak mencukupi!");
        } else {
            int totalBayar = qty * model.getHargaBarang();
            model.kurangiStok(qty);
            view.tampilkanTotalBayar(totalBayar);
        }

        view.tampilkanInfo(model.getNamaBarang(), model.getHargaBarang(), model.getStokBarang());
    }
}
