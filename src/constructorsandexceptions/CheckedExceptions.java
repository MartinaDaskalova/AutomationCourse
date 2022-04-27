package constructorsandexceptions;

import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:dragons");
        FileReader fr = new FileReader(file);
        throw new IOException();


    }

}
