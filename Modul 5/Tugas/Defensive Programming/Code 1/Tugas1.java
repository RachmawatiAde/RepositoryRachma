/*public class Tugas1 {
    /**
    * @param args the command line arguments
    
    public static void main(String[] args) {
    System.out.println(3/0);
    }
    }*/


    public class Tugas1 {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            try {
                // Mencoba untuk membagi 3 dengan 0
                System.out.println(3 / 0);
            } catch (ArithmeticException e) {
                // Menangkap dan menangani exception jika terjadi pembagian dengan 0
                System.out.println("Error: Tidak dapat membagi dengan 0.");
            }
        }
    }
    