package exercise.register;
import exercise.students.Student;

public class Register {
    
    private Student[] students;

    public Register(){
        this.students = new Student[9];
    };

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                students[i]= student;
                break;
            }
        }
    }

    public Student[] getStudents(){
        return students;
    }
}
