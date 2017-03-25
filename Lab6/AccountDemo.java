import java.util.Scanner;

public class AccountDemo {
    public static void main(String args[]){
        float intRate;
        System.out.print("Enter interest Rate ");
        Scanner sc = new Scanner(System.in);

        intRate=sc.nextFloat();

        CurrentAccount a1=new CurrentAccount();
        a1.accHolder="Theekshana";
        a1.accNum="12345678912345";
        a1.balance=0.0;

        a1.deposit(5000.56);
        a1.withdraw(1000);
        a1.showBalance();

        SavingAccount s1=new SavingAccount();
        s1.accHolder="Obama";
        s1.accNum="4568431213";
        s1.balance=56240.0;

        s1.showAnualInt(intRate);

    }
}
