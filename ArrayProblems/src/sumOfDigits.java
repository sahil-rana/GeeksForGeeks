public class sumOfDigits {
    public static void main ( String [] args){
        int num= 14535;
        int sum = sumRecursion(num);
        System.out.println("Sum of digits of number is " + sum);
    }

    public static int sumRecursion(int num) {
        if(num == 0){
            return 0;
        }
        return num%10 + sumRecursion(num/10) ;
    }
}
