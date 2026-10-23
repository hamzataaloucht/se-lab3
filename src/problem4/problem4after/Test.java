package problem4.problem4after;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("SAFI Amal");
        Professor professor = new Professor("KALLOUBI");
        TeachingAssistant assistant = new TeachingAssistant("ALAMI Samir");

        Registrar registrar = new Registrar();
        ExamBoard examBoard = new ExamBoard();

        // the same assistant is given to both clients
        registrar.enrollAll(List.of(student, assistant), "SE101");
        examBoard.collectGrades(List.of(professor, assistant), "SE101");
    }
}
