package clg.filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Kartik/IdeaProjects/Java/src/clg/filehandling/file.txt";
        FileInputStream fis = new FileInputStream(path);
        int data;
        while((data=fis.read())!=-1){
            System.out.print((char) data);
        }

    }
}
