package ifLengthOfFileLowerThan1000bytes;

//if length of file lower than 1000 bytes:
// close streams and throw exception.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String fileName = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            byte[] bytes = new byte[fileInputStream.available()];
            while(fileInputStream.available() > 0){
                fileInputStream.read(bytes);
            }
            if(bytes.length < 1000){
                fileInputStream.close();
                throw  new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}

