package hdfc_creditcard;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Card {

    public static void main(String[] args) throws IOException {
        // Create a File object for the Notepad file you want to read.
        File file = new File("C:\\Users\\Manoj L\\Desktop\\card.csv");

        // Create a FileReader object for the File object you created.
        FileReader fileReader = new FileReader(file);

        // Create a BufferedReader object for the FileReader object you created.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read the contents of the Notepad file line by line.
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // Close the BufferedReader object.
        bufferedReader.close();
    }
}
  
  
    

