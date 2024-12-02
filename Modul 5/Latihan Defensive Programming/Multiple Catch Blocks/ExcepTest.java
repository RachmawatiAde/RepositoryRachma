import java.io.*;

public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
        FileInputStream file = null;
        String fileName = "example.txt"; 
        try {
            file = new FileInputStream(fileName);
            int x = file.read(); 
            System.out.println("First byte of the file: " + x);
        } catch (FileNotFoundException f) { 
            System.out.println("File not found: " + f);
        } catch (IOException i) { 
            System.out.println("I/O Exception: " + i);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException i) {
                    System.out.println("Failed to close the file: " + i);
                }
            }
        }
    }
}
