package DSA.Array_2D;

public class Array2D7 {
        public static void main(String[] args) {
            // 2D array declaration with values
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    

            int sum = 0;
    
    
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
    
            // Print the sum
            System.out.println("Sum of all elements: " + sum);
        }
    }
    