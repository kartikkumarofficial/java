package clg.filehandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Kartik/IdeaProjects/Java/src/clg/filehandling/file.txt";
        FileOutputStream fos = new FileOutputStream(path);
        String data = "Note->This is the new data that should be written in the file";
        byte[] bytes =data.getBytes();
        fos.write(bytes);
        System.out.println("data written in file");


    }
}
