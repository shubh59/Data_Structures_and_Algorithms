
class BinarySearchM {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 39;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println("Element is not found");
        } else
            System.out.println(target + " Found at index : " + index);
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middel = low + (high - low) / 2;
            int value = array[middel];

            if (value < target)
                low = middel + 1;
            else if (value > target)
                high = middel - 1;
            else
                return middel; // value found
        }
        return -1;
    }
}
