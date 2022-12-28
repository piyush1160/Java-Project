
import java.text.*;
import java.util.*;

public class Account {

    private int customerNumber ;
    private int pinNumber;
    private double checkingBalance=0 ;
    private double savingBalance = 0;



    Scanner cin = new Scanner(System.in);
    DecimalFormat moneyForm = new DecimalFormat("'$'### ,##0.00");

    //set customer num or id ;
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber ;
        return customerNumber;
    }

    // get the customer id  ..
    public int getCustomerNumber() {
        return customerNumber;
    }

    //set the pin no ..

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return  pinNumber;
    }

    // get the pin no
    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    // calculate checking ammount withdraw ..

    public double calcCheckingWithdraw(double ammount) {
        checkingBalance  = (checkingBalance - ammount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double ammount) {
        savingBalance = (savingBalance - ammount);
        return savingBalance;
    }


    // calculate the saving account deposit

    public double calcCheckingDeposit(double ammount) {
        checkingBalance = (checkingBalance + ammount) ;
        return checkingBalance ;
    }

    public double calcSavingDeposit( double ammount ) {
        savingBalance = (savingBalance + ammount );
            return savingBalance ;

    }


    public void  getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance : " + moneyForm.format(checkingBalance));
        System.out.println("Ammount you want to withdaw for chcking account : ");
        double ammount = cin.nextDouble();

        if((checkingBalance - ammount) >= 0) {
            calcCheckingWithdraw(ammount);
            System.out.println("New Checking Account Balance : " + moneyForm.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot go down to negative ..");
        }

    }


    public void getSavingWithdrawInput() {
        System.out.println("Checking Account Balance : " + moneyForm.format(savingBalance));
        System.out.println("Ammount you want to withdaw for chcking account : ");
        double ammount = cin.nextDouble();

        if((savingBalance - ammount) >= 0) {
            calcCheckingWithdraw(ammount);
            System.out.println("New Checking Account Balance : " + savingBalance + "\n");
        }else {
            System.out.println("Balance cannot go down to negative ..");
        }

    }

    public void  getCheckingDepositInput() {
        System.out.println("Checking Account Balance : " + moneyForm.format(checkingBalance));
        System.out.println("Ammount you want to withdaw for chcking account : ");
        double ammount = cin.nextDouble();

        if((checkingBalance + ammount) >= 0) {
            calcCheckingWithdraw(ammount);
            System.out.println("New Checking Account Balance : " + moneyForm.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot go down to negative ..");
        }

    }


    public void  getSavingDepositInput() {
        System.out.println("Checking Account Balance : " + moneyForm.format(checkingBalance));
        System.out.println("Ammount you want to withdaw for chcking account : ");
        double ammount = cin.nextDouble();

        if((checkingBalance + ammount) >= 0) {
            calcCheckingWithdraw(ammount);
            System.out.println("New Checking Account Balance : " + moneyForm.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot go down to negative ..");
        }

    }



}
