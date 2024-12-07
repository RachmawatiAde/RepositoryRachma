import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers2 {
    private List<Integer> numbersList;  // Menggunakan List daripada Vector
    private static final int SIZE = 10;  // Konvensi penamaan constant

    public ListOfNumbers2() {
        numbersList = new ArrayList<>(SIZE);  // Menggunakan ArrayList daripada Vector
        for (int i = 0; i < SIZE; i++) {
            numbersList.add(i);
        }
        this.readList("infile.txt");
        this.writeList();
    }

    public void readList(String fileName) {
        String line;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            while ((line = raf.readLine()) != null) {
                try {
                    Integer i = Integer.parseInt(line);
                    System.out.println(i);
                    numbersList.add(i);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + fileName + " was not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }

    public void writeList() {
        try (PrintWriter out = new PrintWriter(new FileWriter("outfile.txt"))) {
            for (int i = 0; i < numbersList.size(); i++) {
                try {
                    out.println("Value at: " + i + " = " + numbersList.get(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: Index " + i + " is out of bounds.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while writing to the file.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Closing the PrintWriter.");
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
