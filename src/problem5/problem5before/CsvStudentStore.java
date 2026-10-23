package problem5.problem5before;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvStudentStore {
    private final String fileName;

    public CsvStudentStore(String fileName) {
        this.fileName = fileName;
    }

    public boolean exists(String cne) {
        Path path = Path.of(fileName);
        if (!Files.exists(path)) {
            return false;
        }
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                if (line.split(",")[0].equals(cne)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void append(String cne, String name, String email) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(cne + "," + name + "," + email + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
