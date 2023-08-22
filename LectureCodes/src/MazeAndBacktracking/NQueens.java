package MazeAndBacktracking;

public class NQueens {
    public static void main(String[] args) {

    }
    static int queens(boolean board[][], int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }



        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        //Check Vertical Row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }


    }


    static void display(boolean board[][]){
        for (boolean[] row : board) {
            for (boolean ele: row){
                if(ele){
                    System.out.println("Q ");
                }
                else{
                    System.out.println("X ");
                }
            }

            System.out.println();
        }
    }
}


