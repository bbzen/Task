package Drafts;

public class MergeSort {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 4, 6, 8};
        int[] array2 = new int[]{2, 6, 8, 10, 13, 15, 18};
        int[] resultArray = merge(array1, array2);

        for (int e : resultArray) {
            System.out.print(e + ", ");
        }
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLenght = rightArray.length;
        int resultArrayLength = leftArrayLength + rightArrayLenght;

        int[] resultArray = new int[resultArrayLength];

        int leftCount = 0;
        int rightCount = 0;
        int resultCount = 0;

        while (resultCount < resultArrayLength) {
            if (leftArrayLength <= leftCount) {
                resultArray[resultCount] = rightArray[rightCount];
                rightCount++;
            } else if (rightArrayLenght <= rightCount) {
                resultArray[resultCount] = leftArray[leftCount];
                leftCount++;
            } else if (leftArray[leftCount] <= rightArray[rightCount]) {
                resultArray[resultCount] = leftArray[leftCount];
                leftCount++;
            } else {
                resultArray[resultCount] = rightArray[rightCount];
                rightCount++;
            }
            resultCount++;
        }
        return resultArray;
    }
}
