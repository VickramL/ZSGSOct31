public class ChessBoard {
    static double moves=0;
    public static void main(String[] args) {
        int n = 3, k = 2, row = 0, col = 0,steps =1;
//        int[][] array = new int[n][n];
        recursion(row,col,n,k,steps);
        System.out.println(moves);
    }
    public static void recursion(int row, int col,int n,int k,int steps){
        if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
            if (steps == k){
                moves += 1 / Math.pow(8, steps);
            } else {
                recursion(row,col,n,k,steps+1);
            }
        }
        if(row+2>=0 && col+1 >=0 && row+2<n && col+1<n) {
            if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        if(row-2>=0 && col-1>=0 && row-2<n && col-1<n)
        {
            if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        if(row-2>=0 && col+1 >=0 && row-2<n && col+1<n)
        {
            if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        if(col+2>=0 && row-1>=0 && col+2<n && row-1<n)
        {
            if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        if(col+2>=0 && row+1>=0 && col+2<n && row+1<n)
        {
            if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        if(col-2>=0 && row-1>=0 && col-2<n && row-1<n)
        {
            if(row+2>=0 && col-1>=0 && row+2<n && col-1<n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        if(col-2>=0 && row+1>=0 && col-2<n && row+1<n) {
            if (row + 2 >= 0 && col - 1 >= 0 && row + 2 < n && col - 1 < n) {
                if (steps == k) {
                    moves += 1 / Math.pow(8, steps);
                } else {
                    recursion(row, col, n, k, steps + 1);
                }
            }
        }
    }

}}}}}}}
