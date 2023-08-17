package MazeAndBacktracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);

        System.out.println(pathRet("",3,3));

//        System.out.println(pathRetDiagonal("",3,3));

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
}
