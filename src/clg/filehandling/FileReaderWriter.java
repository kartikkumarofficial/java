package clg.filehandling;

import java.io.*;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Kartik/IdeaProjects/Java/src/clg/filehandling/file.txt";
        FileWriter fw = new FileWriter(path);
        String data = "This should be the data inside the file file.txt";
        fw.write(data);
        System.out.println("Data written in file");

        fw.close();


        FileReader fr = new FileReader(path);
        System.out.println("Reading data from file:");
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        System.out.println();



    }
}
