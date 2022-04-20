package methods;

public class MathOperators {

    private int bankAccountBalance = 5;

    public int getBankAccountBalance(){
        return bankAccountBalance;
    }

    public void setBankAccountBalance(int bankAccountBalance){
        if (bankAccountBalance < 0){
            System.out.println("Invalid bank account balance!");
            this.bankAccountBalance = 0;
        } else
        this.bankAccountBalance = bankAccountBalance;
    }


}
