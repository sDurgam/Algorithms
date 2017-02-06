public class SetMatrixZeroes {
  
     public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        int nonzerorow = -1;
        int count = 0;
        for(int i =0; i < m; i++){
            count = 0;
            for(int j =0; j < n; j++) {
                if(matrix[i][j] != 0){
                    count ++;
                }
            }
            if(count == n){
                nonzerorow = i;
                break;
            }
        }
        if(nonzerorow == -1){
            for(int i =0; i < m; i++){
                for(int j =0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
            return;
        }

        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++) {
                if (matrix[i][j] == 0 && i != nonzerorow){
                    matrix[i][0] = 0;
                    matrix[nonzerorow][j] = 0;
                }
            }
        }
        for(int i =0; i < m; i++){
            if(i == nonzerorow) continue;;
            if(matrix[i][0] == 0){
                for(int j =0; j <n; j++){
                    matrix[i][j] =0;
                }
            }
        }
        for(int j =0; j < n; j++){
            if(matrix[nonzerorow][j] == 0){
                for(int i =0; i <m; i++){
                        matrix[i][j] = 0;
                }
            }
        }
    }
}
