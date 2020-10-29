package by.issoft.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) throws IOException {


        String text = new String(Files.readAllBytes(Paths.get("src/main/resources/text")));
        String word[] = text.split(" ");


        HashMap<String, Integer > map = new HashMap<>();
        for(String s: word){
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        Set<String> words = map.keySet();
        for(String k: words){
            System.out.println(k);
            System.out.println(map.get(k));
        }


    }
}




