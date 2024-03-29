public class CeilingArr {
    public static void main(String args[] ) {
        System.out.println("sudsh");
        int arr[] = {2, 6, 9, 12, 15, 20};
        int target = 10;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }

        
        if (start >= arr.length) {
            return -1;
        }
        return start ; 
    }
}
    