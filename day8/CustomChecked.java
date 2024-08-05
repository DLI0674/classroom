package classroom.day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomChecked {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("C:\\Users\\Mridul.Tiwari\\Documents\\Git_codes.txt");
            BufferedReader fileInput = new BufferedReader(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
