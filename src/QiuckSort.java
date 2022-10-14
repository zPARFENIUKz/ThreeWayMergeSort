public class QiuckSort {
    public static void quickSort(final int[] arr){
        if (arr == null) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(final int[] arr, final int lowIndex, final int highIndex){
        if (lowIndex < highIndex){
            final int[] rangeIndexes = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, rangeIndexes[0] - 1);
            quickSort(arr, rangeIndexes[1] + 1, highIndex);
        }
    }

    private static int[] partition(final int[] arr, final int lowIndex, final int highIndex){
        final int pivot = arr[lowIndex];
        int leftPtr = lowIndex, rightPtr = highIndex;
        for (int i = leftPtr + 1; i <= rightPtr; ++i){
            if (arr[i] < pivot){
                Swap.swap(arr, i, leftPtr);
                ++leftPtr;
            } else if (arr[i] > pivot){
                Swap.swap(arr, i, rightPtr);
                --rightPtr;
                --i;
            }
        }
        return new int[] {leftPtr, rightPtr};
    }
}
