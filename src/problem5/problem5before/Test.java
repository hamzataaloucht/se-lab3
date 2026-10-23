package problem5.problem5before;

public class Test {
    public static void main(String[] args) {
        EnrollmentService service = new EnrollmentService();

        try {
            service.enroll("22885676", "SAFI Amal", "amal.safi@example.com");
            service.enroll("22885676", "SAFI Amal", "amal.safi@example.com");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
