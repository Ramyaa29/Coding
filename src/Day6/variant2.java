package Day6;

import java.util.Scanner;

public class variant2 {
    public void setMatrix(int[][] matrix) {
        int n = matrix.length;

        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int m= sc.nextInt();
            int n = sc.nextInt();

            int[][] matrix= new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]= sc.nextInt();
                }
            }
            setMatrix sm = new setMatrix();
            int[][] rotated = sm.rotatedMatrix(matrix);
            for(int[] row: rotated){
                for(int val:row){
                    System.out.println(val);

                }
                System.out.println();
            }
        }
}

