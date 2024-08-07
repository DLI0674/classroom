package classroom.day11;

import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\text.txt")); BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\reversed.txt"))){
            String line;
            StringBuilder sb=new StringBuilder();
            while((line= reader.readLine())!=null){
                sb.append(line);
                sb.append("\n");
            }
            StringBuilder s=sb.reverse();
            writer.write(String.valueOf(sb));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
