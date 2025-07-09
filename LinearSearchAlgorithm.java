public class LinearSearchAlgorithm{

    public static void main (String[] args){

        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int length = arr.length;

        for(int i=0;i<length;i++){
            if(arr[i]==x){
                System.out.println("mill gya index "+ i);
            }
        }


    }

}