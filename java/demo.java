class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }

}






====================================================================================


public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend = 25, divisor = 4;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}

public class PositiveNegative {
    public static void main(String[] args) {
        double number = 12.3;
        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");
        // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");
        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }
}
