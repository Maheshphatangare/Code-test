//Q1: Merge two arrays by satisfying given constraints
import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int j = 0;
        
        // Move all non-zero elements of X[] to the front
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[j++] = X[i];
            }
        }
        
        // Merge Y[] into X[]
        int i = j = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[i++] = X[i] != 0 ? X[i] : Y[j++];
            } else {
                X[i++] = Y[j++];
            }
        }
        
        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[i++] = Y[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
