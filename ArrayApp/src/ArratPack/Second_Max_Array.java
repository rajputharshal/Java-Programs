package ArratPack;

public class Second_Max_Array {
    public static void main(String[] args) {
        int array[] = {33, 22, 77, 12, 9, 19, 23};
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) { // Swap if smaller
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // Printing the sorted array
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nSecond highest number: " + array[1]);
    }
}
