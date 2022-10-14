public class Swap {
    public static void swap(final int[] arr, final int index1, final int index2){
        if (arr == null) return;
        final int buf = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buf;
    }
}
