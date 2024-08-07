package classroom.day11;

import java.io.*;
import java.util.Scanner;

public class WriteUserInput {
    public static void main(String[] args) {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\problem3.txt"))){
            String line;
            Scanner sc=new Scanner(System.in);
            line=sc.nextLine();
            writer.write(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
