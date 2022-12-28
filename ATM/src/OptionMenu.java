        import java.io.*;
        import java.text.DecimalFormat;
        import java.util.*;

public class OptionMenu extends Account {

    Scanner menuIn = new Scanner(System.in);
    DecimalFormat moneyForm = new DecimalFormat("'$'### ,##0.00");

    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

    //validate login information customer number and pin ..

    public void getLogin() throws IOException {
        int x =1;

        do {
            try {
                data.put(99999, 9898);
                data.put(90000, 9090);

                System.out.println(" WELCOME TO THE ATM !! ");

                System.out.println("Enter your id : ");
                setCustomerNumber(menuIn.nextInt());

                System.out.println("Enter your pin : ");
                setPinNumber(menuIn.nextInt());

                //we handle exception here bcz in case of any char entered so exception will raise ..
                //bcz we take data only of integer type ...


            }catch(Exception e) {
                System.out.println("Invalid entry . Only no is allowed ");
                x=2;
            }

            for( Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if(entry.getKey()== getCustomerNumber() && entry.getValue()==getPinNumber())
                {
                    getAccountType();
                }

            }
            System.out.println("Wrong customer id or pin .");

        }while(x==1);

    }

    // display account type jo customer se poochenge ..

    public void getAccountType() {
        System.out.println("Please Select the Account type : ");
        System.out.println("1 : Checking Account");
        System.out.println("2 : Saving Account  ");
        System.out.println("3 : Exit");
        System.out.print("choice :");

        int	selection = menuIn.nextInt();

        switch(selection) {

            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thanks for using this ATM ");
                break;

            default:
                System.out.println("Invalid Choice ");
                getAccountType();


        }
    }


    public void getChecking() {
        System.out.println("Checking Account");
        System.out.println("1 : View Balance");
        System.out.println("2 : Withdraw Funds");
        System.out.println("3 : Deposite Funds");
        System.out.println("4 : Exit");
        System.out.print("Choice : ");

        int	selection = menuIn.nextInt();

        switch(selection) {
            case 1:
                System.out.println("Checking Account Balance :  " + moneyForm.format(getCheckingBalance()));
                getAccountType();
                break;


            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thanks for using this ATM .. ");

            default :
                System.out.println("Invalid Choice ");
                getChecking();
        }
    }


    public void 	getSaving() {
        System.out.println("Checking Account");
        System.out.println("1 : View Balance");
        System.out.println("2 : Withdraw Funds");
        System.out.println("3 : Deposite Funds");
        System.out.println("4 : Exit");
        System.out.print("Choice : ");


        int	selection = menuIn.nextInt();
        switch(selection) {
            case 1:
                System.out.println("Checking Account Balance :  " + moneyForm.format(getSavingBalance(), null, null));
                getAccountType();
                break;


            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thanks for using this ATM .. ");

            default :
                System.out.println("Invalid Choice ");
                getChecking();
        }


    }








}

