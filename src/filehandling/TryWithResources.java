package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream
                =new FileOutputStream("/home/fari/16SeptJava/src/filehandling/sample2.txt")){
            String str = "hello";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("Successfully file write");
        }catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream
                =new FileInputStream("/home/fari/16SeptJava/src/filehandling/sample2.txt")){
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i=fileInputStream.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
                 }
        }





