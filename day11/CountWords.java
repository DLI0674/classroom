package classroom.day11;

import java.io.*;

public class CountWords {
    public static void main(String[] args) {
        int ct=0;
        try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\files\\text.txt"))){
            String line;
            while((line= reader.readLine())!=null){
                String[] str=line.split(" ");
                for(int i=0;i<str.length;i++){
                    if(str[i].equals("Mridul")){
                        ct++;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ct);
    }
}
