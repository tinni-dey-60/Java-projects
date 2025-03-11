
package search2darray;
public class Search2DArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                if (array[i][j] == target) {
                    System.out.println("Element " + target + " found at position (" + i + ", " + j + ")");
                    return;
                }
                
        System.out.println("Element " + target + " not found in the array.");
    }
}
