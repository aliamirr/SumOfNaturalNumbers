import java.util.Scanner;

public class SumOfNaturalNumbersViaFunctions {
    static int NaturalNumbersSum(int n)

    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        sum += i;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        int N;
        Scanner inp = new Scanner(System.in);
        N = inp.nextInt();

       System.out.println("The sum of first " + N + "natural numbers is " +NaturalNumbersSum(N));
    }
}
