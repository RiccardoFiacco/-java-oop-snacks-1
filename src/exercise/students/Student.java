package exercise.students;

public class Student {
    
    private String name;
    private String surname;
    private int age;

    public Student(){};
    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString(){
        return this.name+" "+this.surname+", "+this.age+" anni";
    }
}
