import java.util.Scanner;

public class SumOfNNumbers {

    public static  void main (String [] args){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int Sum = Sum_Of_Numbers(num);
        System.out.println("The total sum is" + Sum);
    }
    public static int Sum_Of_Numbers(int num){
        if(num == 1){
            return 1;
        }
        return num + Sum_Of_Numbers(num-1);
    }
}
