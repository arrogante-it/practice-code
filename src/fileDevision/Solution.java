package fileDevision;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStreamFile2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStreamFile3 = new FileOutputStream(fileName3);
        byte[] buffer = new byte[fileInputStream.available()];
        while(fileInputStream.available() > 0){
            int count = fileInputStream.read(buffer);
            if(count % 2 != 0){
                fileOutputStreamFile2.write(buffer , 0 , count/2 + 1);
                fileOutputStreamFile3.write(buffer, count/2 + 1, (count - count/2) - 1);
            }
            if(count % 2 == 0){
                fileOutputStreamFile2.write(buffer , 0 , count/2);
                fileOutputStreamFile3.write(buffer, count/2, count/2);
            }

        }
        fileInputStream.close();
        fileOutputStreamFile2.close();
        fileOutputStreamFile3.close();
    }
}
