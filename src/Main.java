import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        final int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = (int) (Math.random() * arr.length);
        }
        final int[] arrClone = arr.clone();

        QiuckSort.quickSort(arr);
        Arrays.sort(arrClone);
        System.out.println(Arrays.equals(arr, arrClone));
    }
}
