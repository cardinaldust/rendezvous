class MatrixThread extends Thread {
    MatrixMultiplier matrix;
    int i;
    int j;
    int k;

    MatrixThread(MatrixMultiplier uwu, int owo, int x, int y) {
        matrix = uwu;
        i = owo;
        j = x;
        k = y;
    }

    public void run() {
        try {
            matrix.semaphore.acquire();
            matrix.MatrixC[i][j] += matrix.MatrixA[i][k] * matrix.MatrixB[k][j];
            matrix.semaphore.release();
        } catch (InterruptedException owo) {
        }
    }
}