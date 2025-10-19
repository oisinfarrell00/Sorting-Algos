public class MergeSort {

    public static void sort(int[] array){
        int n = array.length;

        if(n < 2) return;

        int midIndex = n / 2;
        int[] left = new int[midIndex];
        int[] right = new int[n-midIndex];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, midIndex, right, 0, right.length);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right){

        int leftIndex=0; int rightIndex=0; int mainIndex=0;

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                array[mainIndex] = left[leftIndex++];
            }else{
                array[mainIndex] = right[rightIndex++];
            }
            mainIndex++;
        }

        while(leftIndex < left.length){
            array[mainIndex++] = left[leftIndex++];
        }

        while(rightIndex < right.length){
            array[mainIndex++] = right[rightIndex++];
        }
    }
}
