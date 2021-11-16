package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        //byte streams
        File file = new File("text.txt");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
            String str = "hello";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully");
            fileOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("text.txt");
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();

            }
            fileInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
