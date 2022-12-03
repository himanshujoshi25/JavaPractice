package SearchingAndSorting;
public class BinarySearchIterative {

    public static int binarySearch(int search, int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (search < array[middle]) {
                end = middle - 1;
            }

            if (search > array[middle]) {
                start = middle + 1;
            }

            if (search == array[middle]) {
                return middle;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        System.out.println(binarySearch(20,new int[]{-4,-1,3,7,11}));

    }
}
