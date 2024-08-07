package classroom.day11;

import java.io.*;

public class LargeDataFiles {
    public static void main(String[] args) {
        String inputFile = "transactions.txt";
        String outputFile = "filtered_transactions.txt";
        double threshold = 1000.00; // Example threshold
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    double amount = Double.parseDouble(data[2].trim());
                    if (amount > threshold) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
