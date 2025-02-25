import exercise.bankaccount.BankAccount;
import exercise.students.Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student fra = new Student("Riccardo","Fiacco", 24);
        System.out.println(fra.toString());

        BankAccount ba1 = new BankAccount(32146, 2345);
        boolean op1 = ba1.addCash(2000);
        boolean op2 = ba1.takeCash(4000);

        if(op1){
            System.out.println("tutt ok op1");
        }else{
            System.out.println("op1 fallita");
        }
        if(op2){
            System.out.println("tutt ok op2");
        }else{
            System.out.println("op2 fallita");
        }

        System.out.println(ba1.getBalance());
    }
}
