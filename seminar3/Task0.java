package seminar3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Path;

public class Task0 {
    public static void main(String[] args) {
        
    }

    public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = new BufferedReader((Reader) pathRead); 
        BufferedWriter out = new BufferedWriter((Writer) pathWrite)) {
            out.write(in.readLine());

        } catch (IOException e){
            System.out.println("Произошла ошибка при работе с файлом");
        }
    }
}
