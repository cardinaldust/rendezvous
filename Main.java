public class Main {
    public static void main(String[] args) {
        int n = 3;
        MatrixMultiplier multiplication = new MatrixMultiplier(n);
        multiplication.fillRandom();

        System.out.println("Matrix A:");
        multiplication.printMatrix(multiplication.MatrixA);
        System.out.println("Matrix B:");
        multiplication.printMatrix(multiplication.MatrixB);

        multiplication.multiply();

        try {
            Thread.sleep(100);
        } catch (InterruptedException owo) {
        }

        System.out.println("Matrix C:");
        multiplication.printMatrix(multiplication.MatrixC);
    }
}