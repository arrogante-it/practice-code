package FoundingDirOrFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        while(true){
            String strings = scanner.nextLine();
            Path path = Paths.get(strings);
            if(Files.isRegularFile(path)){
                System.out.println(strings + THIS_IS_FILE);
            }else if (Files.isDirectory(path)){
                System.out.println(strings + THIS_IS_DIR);
            }else {
                break;
            }
        }
    }
}
