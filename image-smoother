class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        int n = img.length;
        int m = img[0].length;
        int mat[][] = new int[n][m];

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {

                int sum = 0;
                int count = 0;

                for(int delRow = -1;delRow <= 1;delRow++) {
                    for(int delCol = -1;delCol <= 1;delCol++) {
                        int nRow = i + delRow;
                        int nCol = j + delCol;

                        if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m) {
                            sum += img[nRow][nCol];
                            count++;
                        }
                    }
                }
                mat[i][j] = sum / count;
            }
        }
        return mat;
    }
}
