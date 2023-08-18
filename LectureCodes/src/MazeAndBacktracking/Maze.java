package MazeAndBacktracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);

//        System.out.println(pathRet("",3,3));

//        System.out.println(pathRetDiagonal("",3,3));

        boolean board[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}

        };

        pathBacktracking("",board,0,0);

    }

    //Prints number of possible paths
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }

    //Print the path details
    static void path(String p,int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p+'D',r-1,c);
        }

        if (c > 1){
            path(p+'R',r,c-1);
        }

    }


    //Returning Path Arraylist
    static ArrayList<String> pathRet(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
           list.addAll(pathRet(p+'D',r-1,c));
        }

        if (c > 1){
           list.addAll(pathRet(p+'R',r,c-1));
        }
        return list;
    }


    //Diagonal Path also included
    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c >1) {
            list.addAll(pathRetDiagonal(p+"Di",r-1,c-1));
        }


        if (r > 1) {
            list.addAll(pathRetDiagonal(p+'D',r-1,c));
        }

        if (c > 1){
            list.addAll(pathRetDiagonal(p+'R',r,c-1));
        }
        return list;
    }


    //Maze with Restriction
    static void pathRestriction(String p,boolean maze[][],int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }


        //(r < maze.length-1) - (3x3 Matrix taken)is used coz if
        // r is 2 it is the last row it can move further on row side.
        // If we had used (r < maze.length) when 2 comes in it will be 2+1 which can't happen

        if (r < maze.length-1) {
            pathRestriction(p+'D',maze,r+1,c);
        }

        if (c < maze[0].length-1){
            pathRestriction(p+'R',maze,r,c+1);
        }

    }


    //Backtracking
    static void pathBacktracking(String p,boolean maze[][],int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }



        if(!maze[r][c]){
            return;
        }

        //I have visited this path so I mark it
        maze[r][c] = false;


        if (r < maze.length-1) {
            pathBacktracking(p+'D',maze,r+1,c);
        }

        if (c < maze[0].length-1){
            pathBacktracking(p+'R',maze,r,c+1);
        }

        if (r > 0) {
            pathBacktracking(p+'U',maze,r-1,c);
        }

        if (c >0){
            pathBacktracking(p+'L',maze,r,c-1);
        }

        //Yes i visted this path for this func call
        //But this func call is exiting, so im deleting the path history
        maze[r][c] = true;
    }


}
