package Exc3;

public class ArrayProcessing {

    /**Search the minimal element`s value of the array
     * @param array [] is the array which we want to search from.
     * @return the smallest element of the array
     */
    public static int getMinElement(int [] array)   {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

    /**Calculates the sum of the array items.
     * @param array [] is the array which we want to get the sum from.
     * @return the sum of the array items.
     */
    public static int getSum(int [] array) {
        int sum = 0;
        int i;
        // Iterate through all elements and add them to sum
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**Displays array elements on the screen.
     * @param array [] is the array which we want to display on the screen.
     */
    public static void printArray(int [] array)  {
        for(int i:array) //for each loop to print array elements
            System.out.print(i + ", ");
    }
}
