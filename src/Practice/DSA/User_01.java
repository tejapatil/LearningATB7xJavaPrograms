package Practice.DSA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User_01 {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Reading data using readline
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);

    }
}
