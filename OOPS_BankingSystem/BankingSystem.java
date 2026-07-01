import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {

        // Store accounts using ArrayList
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Object Creation
        accounts.add(new SavingAccount(101,"Hritik",3000,5));
        accounts.add(new CurrentAccount(102,"Sandeep",12000,900));

        accounts.add(new SavingAccount(103,"Amal",15000,7));
        accounts.add(new CurrentAccount(104,"Ajay",112000,5000));

        // Banking Account
        accounts.get(0).deposit(3000);
        accounts.get(1).withdraw(4000);

        accounts.get(2).deposit(5000);
        accounts.get(3).withdraw(15000);

        // RunTime Polymorphism
        // Parent reference accessing Child objects
        for(BankAccount account:accounts){
            account.displayInfo();
            System.out.println("------------------------");
        }

    }
}
