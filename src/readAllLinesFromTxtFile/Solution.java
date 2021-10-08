package readAllLinesFromTxtFile;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Solution {
    public static void main(String[] args) throws IOException {

        String Namefile = "E:\\something.txt";
        Path paths = Paths.get(Namefile);
        List<String> list = Files.readAllLines(paths);

        for (int i = 0; i < list.size(); i++) {
            if(i % 2 == 0){
                System.out.println(list.get(i));
            }
        }
    }
}
