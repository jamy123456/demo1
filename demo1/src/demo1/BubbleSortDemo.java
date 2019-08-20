package demo1;

/**
 * Created by jamy on 2019-08-19
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 0 , 3, 4 ,-1 , 8, 6};
        sort(arr);
        for (int m =0; m<arr.length; m++) {
            System.out.print(arr[m]+"\t");
        }
    }

    // 冒泡排序
    public static void sort(int[] arr) {
        int temp;
        boolean flag = true;// 加入这个flag开关,当无需排序时,走完第一局就直接跳出循环,提高效率
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag == true) {
                break;
            }
        }
    }
}
