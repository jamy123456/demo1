package demo1;

/**
 * Created by jamy on 2019-08-20
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr ={5, 1, 0 , 3, 4 ,-1 , 8, 6};
        sort(arr, arr.length);
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void sort(int[] array, int n) {
        int i, j, gap;
        int temp;
        for (gap = n / 2; gap > 0; gap /= 2) {// 计算gap大小
            for (i = gap; i < n; i++) {// 将数据进行分组
                for (j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {// 对每组数据进行插入排序
                    temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
               /* // 打印每趟排序结果
                for (int m = 0; m <= array.length - 1; m++) {
                    System.out.print(array[m] + "\t");
                }
                System.out.println();*/
            }
        }
    }
}
