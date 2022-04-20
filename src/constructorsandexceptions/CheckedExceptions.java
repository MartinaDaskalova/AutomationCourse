package constructorsandexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:dragons");
        FileReader fr = new FileReader(file);
        throw new IOException();


    }
}
