import java.util.Scanner;
//Using while loop
public class SumOfNaturalNumbers2 {
    public static void main(String[] args){
        int i = 1, sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number up to which sum is required: ");
        int n = inp.nextInt();
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("The sum of first " +n+ "Natural number is: " + sum);
    }
}
