package RecursionQuestions.RecursionArrays;

/*
Sorted Array means use Binary Search to find an element
 0 1 2 3 4
{3,4,5,1,2} - Sorted array has been rotated

Target = 1

mid = (0+4)/2 = 2
 0 1  [2]  3 4
{3,4, [5],1,2}

Case 1:
if arr[mid] >= arr[start] //then left part of the array is sorted

    //in the left there will 2 cond. coz key might not be present in that sorted part of the array

   if key >= arr[start]  && key <= arr[mid]
        end = m-1
   else
        start = m+1

Case 2:
if key >= arr[mid] && key >= arr[end]
   start = mid +1
else
    end = mid - 1


 */

public class RBS {

    public static void main(String[] args) {
        int a[] = {4,5,1,2,3};

        System.out.println(findRBS(a,5,0,a.length-1));
    }

    static int findRBS(int a[],int t,int s,int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if (a[mid] == t){
            return mid;
        }

        if(a[mid] >= a[s]){
            if(t >= a[s] && t <= a[mid])
                return findRBS(a,t,s, mid-1);
            else
                return findRBS(a,t,mid+1, e);
        }

        if (t >= a[mid] && t<= a[e]){
           return findRBS(a,t,mid+1, e);
        }

            return findRBS(a,t,s, mid-1);

    }

}
