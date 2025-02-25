package exercise.bankaccount;

public class BankAccount {
    private int countName;
    private int balance;

    public BankAccount(){};

    public BankAccount(int countName, int balance){
        this.balance = balance;
        this.countName = countName;
    };

    public boolean addCash(int money){
        boolean operationResult;
        if(money>0){
            this.balance += money;
            operationResult = true;
        }else{
            operationResult = false;
        }
        return operationResult;
    }

    public boolean takeCash(int money){
        boolean operationResult;
        if(money>0 && this.balance>0 && money<= this.balance){
            this.balance -= money;
            operationResult = true;
        }else{
            operationResult = false;
        }
        return operationResult;
    }

    public int getBalance(){
        return this.balance;
    }

    public int getCountName(){
        return this.countName;
    }

    
}
