package exercise.register;
import exercise.students.Student;

public class Register {
    
    private Student[] students;

    public Register(){
        // this.students = new Student[9];
        this.students = new Student[0];
    };

    // public void addStudent(Student student){
    //     for (int i = 0; i < students.length; i++) {
    //         if(students[i] == null){
    //             students[i]= student;
    //             break;
    //         }
    //     }
    // }

    //seconda soluzione
    public void addStudent(Student student){
       Student[] newRegister = new Student[this.students.length +1];
       
       for (int i = 0; i < this.students.length; i++) {
            students[i] = newRegister[i];
       }

       newRegister[newRegister.length-1] = student;

       this.students = newRegister;
    }

    
    public Student[] getStudents(){
        return students;
    }
}
