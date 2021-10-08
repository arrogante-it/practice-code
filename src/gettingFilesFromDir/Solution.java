package gettingFilesFromDir;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path path1 : files){
                System.out.println(path1);
            }
        }
    }
}

//import java.io.IOException;
//        import java.nio.file.DirectoryStream;
//        import java.nio.file.Files;
//        import java.nio.file.Path;
//        import java.nio.file.Paths;
//        import java.util.Scanner;
//
//public class Solution {
//
//    private static final String THIS_IS_FILE = " - это файл";
//    private static final String THIS_IS_DIR = " - это директория";
//
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path directory = Paths.get(scanner.nextLine());
//        try(DirectoryStream<Path> files = Files.newDirectoryStream(directory)){
//            for (Path file : files){
//                if(Files.isDirectory(file)){
//                    System.out.println(file + THIS_IS_DIR);
//                }
//                if(Files.isRegularFile(file)){
//                    System.out.println(file + THIS_IS_FILE);
//                }
//            }
//        }
//    }
//}

