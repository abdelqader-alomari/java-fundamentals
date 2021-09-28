package linter;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("../linter/app/src/main/resources/gates.js");
        jsLinter(path);
    }

    public static String jsLinter(Path path) {
        String errMessage = "";

        try {
            List<String> lines = Files.readAllLines(path);
            int increment = 0;
            for (String line : lines) {
                increment++;
                if (!(line.isEmpty())) {
                    if (line.contains(";") || line.contains("}") || line.contains("{") || line.contains("if")
                            || line.contains("else")) {
                    } else {
                        System.out.println("Line " + increment + ": Missing semicolon.");
                        errMessage += "Line " + increment + ": Missing semicolon.\n";
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("An error occurred while reading from file");
        }
        return errMessage;
    }
}
