package problem5.problem5after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) throws IOException {
        // start from an empty file so the first enroll always works
        Files.deleteIfExists(Path.of("students.csv"));

        StudentRepository repository = new CsvStudentRepository("students.csv");
        Notifier notifier = new SmsNotifier();
        EnrollmentService service = new EnrollmentService(repository, notifier);

        try {
            service.enroll("22885676", "SAFI Amal", "0612345678");
            service.enroll("22885676", "SAFI Amal", "0612345678");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
