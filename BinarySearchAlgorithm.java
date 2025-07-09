class BinarySearchAlgorithm{
    public static void main(String[] args){
        
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = obinarySearchb(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "+ "index " + result);
    }

    public static int obinarySearchb(int arr [], int x){
        int l=0;
        System.out.println("hello");
        int r=arr.length-1;
        int m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(arr[m]==x){
                return m;
            }
            if(arr[m]>x){
                r=m-1;
            }

            if(arr[m]<x){
                l = m+1;
            }
        }
        return -1;
    }
}