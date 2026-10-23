package problem4.problem4before;

public class Professor implements UniversityMember {
    private final String name;

    public Professor(String name) {
        this.name = name;
    }

    public void enrollInCourse(String code) {
        throw new UnsupportedOperationException();
    }

    public void payTuition(double amount) {
        throw new UnsupportedOperationException();
    }

    public void teach(String code) {
        System.out.println("Prof. " + name + " teaches " + code);
    }

    public void gradeExam(String code) {
        System.out.println("Prof. " + name + " grades " + code);
    }

    public void publishPaper(String title) {
        System.out.println("Prof. " + name + " publishes " + title);
    }
}
