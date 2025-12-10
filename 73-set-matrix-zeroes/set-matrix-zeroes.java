import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                   ArrayList<Integer> a = new ArrayList<>(Arrays.asList(i, j));

                    arr.add(a);
                }
            }
        }
        for (int f = 0; f < arr.size(); f++) {
            ArrayList<Integer> sl = new ArrayList<>(arr.get(f));
            int i = sl.get(0);
            int j = sl.get(1);
            for(int k=i;k<matrix.length;k++){
                matrix[k][j]=0;
            }
            for(int k=i;k>=0;k--){
                matrix[k][j]=0;
            }
            for(int k=j;k<matrix[0].length;k++){
                matrix[i][k]=0;
            }
            for(int k=j;k>=0;k--){
                matrix[i][k]=0;
            }
        }

    }
}