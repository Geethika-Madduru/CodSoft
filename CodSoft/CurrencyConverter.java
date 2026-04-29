import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int base,target;
        double amount;
        double rate=0;
        double converted;

        System.out.println("===== CURRENCY CONVERTER =====");

        System.out.println("\nSelect Base Currency");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");
        System.out.println("5. JPY");
        System.out.println("6. AUD");

        System.out.print("Enter Choice: ");
        base=sc.nextInt();


        System.out.println("\nSelect Target Currency");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");
        System.out.println("5. JPY");
        System.out.println("6. AUD");

        System.out.print("Enter Choice: ");
        target=sc.nextInt();


        System.out.print("\nEnter Amount: ");
        amount=sc.nextDouble();


        // Exchange Rates (basic fixed values)

        if(base==1 && target==2) rate=0.012;
        else if(base==1 && target==3) rate=0.011;
        else if(base==1 && target==4) rate=0.0095;
        else if(base==1 && target==5) rate=1.79;
        else if(base==1 && target==6) rate=0.018;

        else if(base==2 && target==1) rate=83;
        else if(base==2 && target==3) rate=0.92;
        else if(base==2 && target==4) rate=0.79;
        else if(base==2 && target==5) rate=149;
        else if(base==2 && target==6) rate=1.52;

        else if(base==3 && target==1) rate=90;
        else if(base==3 && target==2) rate=1.08;
        else if(base==3 && target==4) rate=0.86;
        else if(base==3 && target==5) rate=161;
        else if(base==3 && target==6) rate=1.65;

        else if(base==4 && target==1) rate=105;
        else if(base==4 && target==2) rate=1.27;
        else if(base==4 && target==3) rate=1.16;
        else if(base==4 && target==5) rate=187;
        else if(base==4 && target==6) rate=1.91;

        else if(base==5 && target==1) rate=0.56;
        else if(base==5 && target==2) rate=0.0067;
        else if(base==5 && target==3) rate=0.0062;
        else if(base==5 && target==4) rate=0.0053;
        else if(base==5 && target==6) rate=0.010;

        else if(base==6 && target==1) rate=55;
        else if(base==6 && target==2) rate=0.66;
        else if(base==6 && target==3) rate=0.61;
        else if(base==6 && target==4) rate=0.52;
        else if(base==6 && target==5) rate=98;

        else if(base==target) rate=1;


        converted = amount * rate;


        // Display Result
        if(target==1)
            System.out.println("Converted Amount = "
                                + converted + " INR");

        else if(target==2)
            System.out.println("Converted Amount = "
                                + converted + " USD");

        else if(target==3)
            System.out.println("Converted Amount = "
                                + converted + " EUR");

        else if(target==4)
            System.out.println("Converted Amount = "
                                + converted + " GBP");

        else if(target==5)
            System.out.println("Converted Amount = "
                                + converted + " JPY");

        else if(target==6)
            System.out.println("Converted Amount = "
                                + converted + " AUD");


        sc.close();

    }

}