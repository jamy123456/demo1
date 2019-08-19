package demo1;

/**
 * Created by jamy on 2019-08-19
 */
public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr ={5, 1, 0 , 3, 4 ,-1 , 8, 6};
        sort(arr);
        for (int m =0; m<arr.length; m++) {
            System.out.print(arr[m]+"\t");
        }
    }

    // 选择排序
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
