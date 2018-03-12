package aula02.exercicio04;

import java.util.Scanner;

public class LibMatrix {

    static void read(Matrix m, Scanner in) {

        for (int i=0; i<m.rows; i++)

            for (int j=0; j<m.cols; j++)

                m.data[i][j] = in.nextInt();

    }

    static String toString(Matrix m) {

        String ans = "";

        for (int i=0; i<m.rows; i++) {

            for (int j=0; j<m.cols; j++)

                ans += m.data[i][j] + " ";
                ans += "\n";
        }

        return ans;
    }

    static Matrix identity(int n) {

        Matrix im = new Matrix(n , n);

        for (int i=0; i<im.rows; i++) {

            for (int j = 0; j < im.cols; j++)

                if (i == j)
                    im.data[i][j] = 1;
                else
                    im.data[i][j] = 0;

        }

        return im;
    }
}
