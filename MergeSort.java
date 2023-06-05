public class MergeSort {

    public static void main(String[] args) {

        int[] array = { 8, 6, 9, 7, 2, 1, 3, 4, 5 };

        mergeSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1)
            return; // base case

        int middel = length / 2;
        int[] leftArray = new int[middel];
        int[] rightArray = new int[length - middel];

        int i = 0; // left Array
        int j = 0; // Rigth Array

        for (; i < length; i++) {
            if (i < middel) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rigthSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rigthSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rigthSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
