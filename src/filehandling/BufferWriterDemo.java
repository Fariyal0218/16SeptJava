package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {

            try {
                FileWriter fileWriter = new FileWriter(
                        "/home/fari/16SeptJava/src/filehandling/filewriter.txt");
                BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
                String str = "I am in Pune";
                bufferWriter.write(str);
                System.out.println("file write successfully");
                bufferWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

                try {
                    FileReader fileReader = new FileReader(
                            "/home/fari/16SeptJava/src/filehandling/filewriter.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    int i = bufferedReader.read();
                    while(i>0) {
                        System.out.print((char) i);
                        i = bufferedReader.read();
                    }
                bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
        }


