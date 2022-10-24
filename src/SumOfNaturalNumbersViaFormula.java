import java.util.Scanner;

public class SumOfNaturalNumbersViaFormula {

static int SumOfNaturalNumbersViaFormula(int n) {
    //We require only formula here.
    return (n * (n + 1)) /2;
}

    public static void main(String[] args) {
        System.out.println("Enter the Number here: ");
         int N;
        Scanner inp = new Scanner(System.in);
        N = inp.nextInt();
        System.out.println("The sum of first " + N + " natural numbers is " + SumOfNaturalNumbersViaFormula(N) +". ");
    }

}
