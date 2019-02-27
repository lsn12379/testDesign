package arithmetic;

import java.util.Arrays;

public class ArithMeticTest {


    //冒泡排序
    private static int[] selectMaoPao(int[] arr){
        int num = 0;

        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
                num ++;
            }
        }
        System.out.println("maopap:---"+num);
        return arr;
    }

    //二分查找
    private static int erfen(int[] arr, int want) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while (arr[mid] != want) {
            if (arr[mid] < want) {
                min = mid + 1;
            } else if (arr[mid] > want) {
                max = mid - 1;
            }
            if (min > max) {
                return -1;
            }
            mid = (min + max) / 2;
        }
        return mid;
    }

    //选择排序
    private static void xuanze(int[] arr) {
        int num = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                num++;
            }
        }

        System.out.println("xuanze:---"+num);
    }

    public static void main(String[] args) {



        int[] arr = {2,1,3,6,4,5,7};
//        arr = selectMaoPao(arr);
//        xuanze(arr);
        Arrays.sort(arr);
        for(int i :arr){
            System.out.println(i);
        }

        int erfen = erfen(arr, 3);
        System.out.println(erfen);
    }

}
