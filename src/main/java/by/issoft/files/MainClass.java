package by.issoft.files;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/Office.json");
        String fileContent = new String(Files.readAllBytes(path));

        ObjectMapper mapper = new ObjectMapper();
        Office office = mapper.readValue(fileContent, Office.class);
        System.out.println(office.worker);
        for (User w:office.worker){
            if (w.colleagues != null){
                for(User x: w.colleagues){
                    System.out.println(w.username + " has colleague " + x.username);
                }

            }

        }

    }
}
