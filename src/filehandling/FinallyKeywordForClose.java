package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyKeywordForClose {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(
                    "/home/fari/16SeptJava/src/filehandling/sample2.txt");
            String str = "hello";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("Successfully file write");
            fileOutputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
    }
        try {
            fileInputStream = new FileInputStream("/home/fari/16SeptJava/src/filehandling/sample2.txt");
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i=fileInputStream.read();
            }
        fileInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileInputStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}


