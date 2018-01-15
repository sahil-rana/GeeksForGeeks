public class PositiveNegativeArrangements {
    public static void main(String [] args){
        int [] arr = {1,2,3,3,4,4,4,5,6,7};
        int max = maximum(arr);
        int maxwitharray = maximumWithArray(arr, max);
        System.out.println("maximun number Element" + maxwitharray);
    }
    public static int maximum(int [] arr ){
        int temp = arr[0];
        for( int i = 0 ; i<arr.length; i++ ){
           if(arr[i] > temp)
               temp=arr[i];
        }
        return temp;
    }
    public static int maximumpos(int [] arr ){
        int temp = 0;
        for( int i = 0 ; i<arr.length; i++ ){
            if(arr[i] > temp)
                temp=i;
        }
        return temp+1;
    }
    public static int maximumWithArray(int[] arr, int max){
        System.out.println(max);
        int [] maxarray = new int[max];
        for(int i=0; i<=arr.length-1; i++){
         int a = arr[i];
         maxarray[a-1] = maxarray[a-1]+1;
        }
       int  maxelement12 = maximumpos(maxarray);
        return maxelement12;
    }
}
