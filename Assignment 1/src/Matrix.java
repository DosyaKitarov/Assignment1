public class Matrix {
    private int rows;

    private int cols;

    private double[][] Mat;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public double[][] getMat() {
        return Mat;
    }

    public void setMat(double[][] mat) {
        Mat = mat;
    }

    Matrix(){}
    Matrix(double[][] Mat, int rows, int cols) {
        this.Mat = Mat;
        this.cols = cols;
        this.rows = rows;
    }

    Matrix addMatrix(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.print("Size is not same");
            return null;
        }
        double[][] newMat = new double[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                newMat[i][j] = this.Mat[i][j] + other.Mat[i][j];
            }
        }
        return new Matrix(newMat, this.rows, this.cols);
    }

    Matrix Multiply(double number) {

        double[][] newMat = new double[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                newMat[i][j] = this.Mat[i][j] * number;
            }
        }
        return new Matrix(newMat, this.rows, this.cols);
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}