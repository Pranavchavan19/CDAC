package searching;

public class BinarySearchTree {

    public int binarysearch(int arr[], int start, int end, int key) {

        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return 1;

            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 70, 90, 100, 111, 123};
        int key = 455;
        int start = 0;
        int end = arr.length - 1;
        BinarySearchTree obj = new BinarySearchTree();
        if (obj.binarysearch(arr, 0, end, key) == 1) {
            System.out.println("search Found");
        } else {
            System.out.println("search  Not Found");
        }
    }

}
