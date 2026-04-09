package Day6;

import java.util.Scanner;

public class setMatrix {
    public int[][] rotatedMatrix(int[][] matrix){
        int n = matrix.length;  //no.of rows=3
        int[][] rotated = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1]= matrix[i][j];
            }
        }
        return rotated;
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
