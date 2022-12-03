package SearchingAndSorting;
public class BinarySearchRecursive {

    public static int binarySearchRecursive(int search, int[] array, int start, int end){

        int middle = (start + end)/2;

        if(end < start){
            return -1;
        }

        if (search < array[middle]){
            return binarySearchRecursive(search, array, start, middle - 1);
        }

        if (search > array[middle]){
            return binarySearchRecursive(search, array, middle + 1, end);
        }

        if (search == array[middle]){
            return middle;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {-4,-1,3,7,11};
        System.out.println(binarySearchRecursive(7,arr,0, arr.length - 1));

    }
}
