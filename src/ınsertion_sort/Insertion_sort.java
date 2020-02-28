package ınsertion_sort;

public class Insertion_sort {

    public static void main(String[] args) {
        int []numbers={10,5,7,8};
        sort(numbers);
        printArray(numbers);
    }
    public static int[]sort(int []A){
        for (int i = 1; i <A.length; i++) {
            int key=A[i];
            int j=i-1;
            while (j>=0 && A[j]>key) {
                A[j+1]=A[j];
                j--;
            }
        A[j+1]=key;
        }
        return A;
    }
    
    public static void printArray(int []A){
        for (int i = 0; i <A.length; i++) {
            System.out.println(A[i]);
        }
    }
    
}
