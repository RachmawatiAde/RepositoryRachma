public class Main {
    public static void main(String[] args) {
        // Inisiasi data
        Model model = new Model("GeForce GTX 1060Ti", 3000, 10);
        View view = new View();
        Controller controller = new Controller(model, view);

        // Jalankan aplikasi
        controller.prosesTransaksi();
    }
}
