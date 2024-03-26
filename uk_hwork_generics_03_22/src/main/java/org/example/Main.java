package org.example;

import java.util.Arrays;
import java.util.List;

/*1 Напишите параметризированный метод для обмена позициями двух разных элементов в
массиве. Метод принимает параметризированный массив и индексы элементов, которые
нужно обменять.
2 Напишите параметризированный метод для нахождения максимального элемента в
диапазоне [begin, end) среди элементов List. Какую границу должен иметь параметр такого
метода?
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"One","Two","Five","Four","Three"};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
        Double[] numbers = new Double[]{Math.E,2.456,5.1236,0.258,11.25,Math.PI};
        swap(numbers,0,5);
        System.out.println(Arrays.toString(numbers));

        List<String> stringList = List.of("One","Two","Five","Four","Three");
        List<Double> doubleList = List.of(Math.E,2.456,5.12,0.258,11.25,Math.PI);
        List<Integer> integerList = List.of(10, 12,123,-1,5,7);


        System.out.println(findMax(stringList, 0, 3)); // TODO "Two" = max ?
        System.out.println(findMax(doubleList, 0, 5)); // TODO  Double не работает
        System.out.println(findMax(integerList, 0, 5));


    }

    public  static <T> void swap(T[] arr, int num1, int num2){
        T temp = null;
        temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static <K> K findMax(List<? extends Comparable<K> > list, int begin, int end){
         K max = (K) list.get(begin);

        for (int i = begin; i <= end; i++) {
            if(list.get(i).compareTo((K) list.get(begin)) > 0) max = (K) list.get(i);
        }
         return  max;

    }

}