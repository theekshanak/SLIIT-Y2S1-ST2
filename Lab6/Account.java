
 class Account {

     String accHolder;
     String accNum;
     double balance;

     Account (String holder, String number, double balc){

         this.accHolder=holder;
         this.accNum=number;
         this.balance=balc;
     }


     void showBalance(){
         System.out.println("Account Holder "+this.accHolder);
         System.out.println("Account Number "+this.accNum);
         System.out.println("Account Balance "+this.balance);
     }
     double deposit(double amt){
         balance=balance+amt;
         return balance;
     }
     double withdraw(double amt){
         balance=balance-amt;
         return amt;
     }

}
