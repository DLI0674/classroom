package classroom.day11;

import java.io.*;

public class ReadAndDisplay {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\text.txt"))){
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
