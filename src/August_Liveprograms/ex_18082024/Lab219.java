package August_Liveprograms.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219 {
    public static void main(String[] args) {
        String path="c://a.txt";
        File file= new File(path);
        try {
            FileReader fileReader=new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FNE");
        }
    }
}
