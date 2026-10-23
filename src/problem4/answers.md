## Problem 4: Interface Segregation Principle

### Q1. Methods that throw
Professor: 2 methods throw (enrollInCourse, payTuition).
Student: 3 methods throw (teach, gradeExam, publishPaper).

### Q2. Adding int examId to gradeExam
UniversityMember, Professor and Student must all be edited and recompiled,
and Student has to change even though it never grades anything.

### Q7. Five interfaces with one method each?
No. enrollInCourse and payTuition are always used together by the same clients (a learner),
same for teach and gradeExam (a teacher). Splitting them more would just add interfaces
that nobody uses alone. Interfaces should follow the clients (roles), not one per method.
