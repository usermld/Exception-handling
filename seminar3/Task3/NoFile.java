package seminar3.Task3;

import java.io.FileNotFoundException;
import java.nio.file.Path;

public class NoFile extends FileNotFoundException{
    public NoFile(){
        super("Файл не найден.");
    }
    public NoFile (Path path){
        super("Файл небыл найден по пути - " + path);
    }
}
