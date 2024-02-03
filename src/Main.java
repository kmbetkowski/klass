public class Main {
    public static void main(String[] args) {
        int[][] initialRectangle = {
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1}
        };
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(initialRectangle);

        subrectangleQueries.updateSubrectangle(0,0,1,1,5);
        int value = subrectangleQueries.getValue(1, 1);

        for(int[] row : initialRectangle) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("\nValue at (1, 1): " + value);
    }
    }