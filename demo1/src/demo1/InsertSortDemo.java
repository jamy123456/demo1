package demo1;

/**
 * Created by jamy on 2019-08-19
 */
public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 0 , 3, 4 ,-1 , 8, 6};
        sort(arr);
        for (int m =0; m<arr.length; m++) {
            System.out.print(arr[m]+"\t");
        }
    }

    // 插入排序
    public static void sort(int[] arr) {
        int temp,i,j;
        for (i = 1; i<arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
