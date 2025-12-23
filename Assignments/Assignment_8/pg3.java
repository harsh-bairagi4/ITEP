import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of account holder: ");
        String holderName = sc.nextLine();
        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the balance: ");
        int balance = sc.nextInt();

        BankAccount account1 = new BankAccount();
        account1.setHolderName(holderName);
        account1.setAccountNumber(accountNumber);
        account1.setBalance(balance);

        System.out.println("Name: " + account1.getHolderName());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Balance: " + account1.getAccountBalance());
    }
}

class BankAccount{
    private String holderName;
    private int accountNumber;
    private int balance;

    public void setHolderName(String name){
        this.holderName = name;
    }

    public void setAccountNumber(int number){
        this.accountNumber = number;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getAccountBalance(){
        return this.balance;
    }
}