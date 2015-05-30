package by.bsu.task4;
/**
 * Created by dom on 22.02.2015.
 */
public class Matrix {
       private int[][] matrix;

    public Matrix(int[][] array) throws MatrixException {
        if (array.length < 1) {
            throw new MatrixException();
        }
        matrix = new int[array.length][array.length];
        this.InitializationWithValue(array);
    }

    public Matrix(int nn) throws MatrixException {
        if (nn < 1) {
            throw new MatrixException();
        }
        matrix = new int[nn][nn];
        this.Initialization();
    }

    public Matrix(){
        int n=(int)(Math.random() * 5);
        matrix = new int[n][n];
        this.Initialization();
    }


    public void Initialization() {
        for (int i=0; i<matrix.length ; i++)
            for(int j=0; j<matrix.length; j++){
                matrix[i][j] = -matrix.length + (int)(Math.random() * (2*matrix.length + 1));
            }
    }

    public void InitializationWithValue(int[][] array) throws MatrixException {
        if (array.length != matrix.length) {
            throw new MatrixException();
        }
        else {
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = array[i][j];
                }
        }
    }

    public int getSize() {
        return matrix.length;
    }

    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) {
            return matrix[i][j];
        }
        throw new MatrixException();
    }

    public void setElement(int i, int j, int value) throws MatrixException {
        if ( checkRange(i, j)) {
            matrix[i][j] = value;
        }
        throw new MatrixException();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void show() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 0) System.out.print(matrix[i][j] + "   ");
                else System.out.print(matrix[i][j] + "    "); //"%4"

            }
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nMatrix : " + matrix.length + "x" + matrix[0].length + "\n");
        for (int [ ] row : matrix) {
            for (int value : row) {
                s.append(value + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        Matrix o = (Matrix)obj;
        if ( matrix.length != o.getSize()) return false;
        else {
            for(int i=0; i < o.getSize() ; i++) {
                for (int j = 0; i < o.getSize(); j++) {
                    if (matrix[i][j] != o.getMatrix()[i][j]) return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        for(int i=0; i < matrix.length ; i++){
            for(int j=0; i < matrix.length; j++){
                result = prime * result + matrix[i][j] * (matrix[i][j] - 1);
            }
        }
        return result;
    }

    // проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        if ( i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length ) {
            return true;
        } else {
            return false;
        }
    }

}
