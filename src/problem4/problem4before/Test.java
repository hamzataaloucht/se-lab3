package problem4.problem4before;

public class Test {
    public static void main(String[] args) {
        UniversityMember student = new Student("SAFI Amal");
        UniversityMember professor = new Professor("KALLOUBI");

        student.enrollInCourse("SE101");
        student.payTuition(5000);

        professor.teach("SE101");
        professor.gradeExam("SE101");
        professor.publishPaper("SOLID in practice");
    }
}
