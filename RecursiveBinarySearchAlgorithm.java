
class RecursiveBinarySearchAlgorithm {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println(
                    "Element is not present in array");
        } else {
            System.out.println(
                    "Element is present at index " + result);
        }
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x) {
                return m;
            }
            if (arr[m] > x) {
                return binarySearch(arr, l, m - 1, x);
            }
            if (arr[m] < x) {
                return binarySearch(arr, m + 1, r, x);
            }
        }
        return -1;
    }

}
