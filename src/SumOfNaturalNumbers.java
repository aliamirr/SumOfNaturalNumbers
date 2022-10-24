import java.util.Scanner;
//Using for loop.(Most efficient)
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter th number: ");
        int n = inp.nextInt();

        for(int i=1; i <= n; i++){
             sum += i;
        }
        System.out.println("The sum of first " +n+ "Natural number is: " + sum);
    }
}