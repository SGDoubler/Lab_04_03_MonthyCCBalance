public class Main
{
    public static void main(String[] args)
    {
        double ccBalance = 5000.00;
        double intRate = .17;

        double initialInterest = ccBalance * intRate;
        double noPayments = ccBalance + initialInterest;
        double nextMonth = (ccBalance + noPayments) * intRate;


        System.out.println("The initial interest due is " + initialInterest);
        System.out.println("The total amount due is " + noPayments);
        System.out.println("If no payment is made the total interest due is " + nextMonth);


    }
}
