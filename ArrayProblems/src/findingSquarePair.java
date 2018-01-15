public class findingSquarePair {
    public static void main (String [] args ){
        int [] arr = {1,2,3,4,5};
        int k = 25;
        int size = arr.length;
        int result = findingpair(arr, size , k);
        if(result == 1){
            System.out.println("pair found");
        }
        else{
            System.out.println("nothing found");
        }
    }

    public static int  findingpair(int [] arr , int size, int k){
        int[] sqrArr = new int[size];
        for(int i = 0; i<size ; i++){
            sqrArr[i] = arr[i]*arr[i];
            System.out.println(sqrArr[i]);
        }
        int result = findpair(sqrArr , k);
        return result;
    }
    public static int findpair(int[] arr1, int k) {
        int max = arr1.length - 1;
        int min = 0;
        while (min < max) {
            if (arr1[min] + arr1[max] == k) {
                System.out.println("found");
                return 1;
            }
            if (arr1[min] + arr1[max] < k) {
                min++;
            } else {
                max--;
            }
        }
        return 0;
    }
}
