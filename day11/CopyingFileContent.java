package classroom.day11;

import java.io.*;

public class CopyingFileContent {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\text.txt")); BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\problem1.txt"))){
            String line;
            while((line= reader.readLine())!=null){
                writer.write(line);
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
