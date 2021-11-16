package filehandling;

import java.io.*;

public class BufferOutputDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "//home/fari/16SeptJava/src/filehandling/Buffer.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Pune";
            byte[] arr = str.getBytes();

            bufferedOutputStream.write(arr);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

            try {
                FileInputStream fileInputStream = new FileInputStream("//home/fari/16SeptJava/src/filehandling/Buffer.txt");
                BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);
                int i =bufferedInputStream.read();
                while(i>0) {
                    System.out.print((char) i);
                    i = bufferedInputStream.read();
                }
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


