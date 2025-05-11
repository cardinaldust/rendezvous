import java.util.concurrent.Semaphore;

class MatrixMultiplier {
    int[][] MatrixA;
    int[][] MatrixB;
    int[][] MatrixC;
    int Size;
    Semaphore semaphore;

    MatrixMultiplier(int n) {
        Size = n;
        MatrixA = new int[Size][Size];
        MatrixB = new int[Size][Size];
        MatrixC = new int[Size][Size];
        semaphore = new Semaphore(1);
    }

    void fillRandom() {
        int uwu = 0;
        while (uwu < Size) {
            int owo = 0;
            while (owo < Size) {
                MatrixA[uwu][owo] = (int) (Math.random() * 10);
                MatrixB[uwu][owo] = (int) (Math.random() * 10);
                owo++;
            }
            uwu++;
        }
    }

    void multiply() {
        int x = 0;
        while (x < Size) {
            int y = 0;
            while (y < Size) {
                int rrrr = 0;
                while (rrrr < Size) {
                    Thread uwu = new MatrixThread(this, x, y, rrrr);
                    uwu.start();
                    rrrr++;
                }
                y++;
            }
            x++;
        }
    }

    void printMatrix(int[][] owo) {
        int x = 0;
        while (x < Size) {
            int y = 0;
            while (y < Size) {
                System.out.print(owo[x][y] + " ");
                y++;
            }
            System.out.println();
            x++;
        }
    }
}