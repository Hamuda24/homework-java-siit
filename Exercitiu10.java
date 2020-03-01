package tema;

public class Exercitiu10 {
    public static void main(String... args) {
        int[][] m = {
                {4, 4, 8},
                {5},
                {7, 8, 9}

        };
        checkSquareMatrix(m);

        public static void checkSquareMatrix( int[][] m) {
            var matrixLength = m.length;
            if (matrixLength == 0) {
                System.out.println("The matrix is not square");
            }
            boolean isSquare = true;
            for (int i = 0; i <= matrixLength - 1; i++) {
                if (m[i].length != matrixLength) {
                    isSquare = false;
                    break; //return;
                }
            }
            if (isSquare) {
                System.out.println("The matrix is square");
            } else {
                System.out.println("The matrix is not square");
            }
        }
    }

}
