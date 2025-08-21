public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
        for (int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
        }
        }

        int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers1) {
        for (int i : row) {
            System.out.println(i);
        }
        }
    }
}
