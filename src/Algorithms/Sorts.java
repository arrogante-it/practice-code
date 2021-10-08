package Algorithms;

public class Sorts {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 7, 9, 9, 5};
        bubleSortWithFor(array);
        bubleSortWithWhile(array);
        insertionSort(array);
        selectionSort(array);
    }

    // from more to less
    public static void bubleSortWithFor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temporaryValue = array[j];
                    array[j] = array[i];
                    array[i] = temporaryValue;
                }
            }
        }
        System.out.print("bubleSort with for: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // from less to more
    public static void bubleSortWithWhile(int[] array) {
        int i = 0;
        while (i < array.length) {
            int j = i;
            while (j < array.length) {

                if (array[j] > array[i]) {
                    int temporaryValue = array[j];
                    array[j] = array[i];
                    array[i] = temporaryValue;
                }
                j++;
            }
            i++;
        }
        System.out.print("bubleSort with while: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
    }

    // from less to more
    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > current){
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = current;
        }
        System.out.print("insertionSort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // from more to less
    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minElementIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[minElementIndex] < array[j]){
                    minElementIndex = j;
                }
            }
            if(minElementIndex != i){
                int temporaryValue = array[i];
                array[i] = array[minElementIndex];
                array[minElementIndex] = temporaryValue;
            }
        }
        System.out.print("selectionSort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}










































