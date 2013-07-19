package ex3_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vanting
 */
public class TestFileReaderWriter {

    public static void main(String[] args) throws IOException {
        // Create an output stream to the file
        FileWriter output = new FileWriter("temp.txt");

        // Output some texts to the file
        output.write("Hello World!\n");
        output.write("Hello Java!\n");
        output.write("0123456789");
        
        // Close the output stream
        output.close();

        // Create an input stream for the file
        FileReader input = new FileReader("temp.txt");

        // Read values from the file
        int value;
        while ((value = input.read()) != -1) {
            System.out.print((char)value);
        }

        // Close the output stream
        input.close();
    }

}
