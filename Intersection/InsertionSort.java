import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void calculation(int[] A){
        int shiftCount = 0;
        for (int j = 1; j < A.length; j++){
            int key = A[j];
            int i = j - 1;

            //Shift elements to the right if they are smaller than key
            while (i >= 0 && A[i]>key){
                A[i+1] = A[i];
                i = i - 1;
                shiftCount++;
            }
            A[i+1] = key;
            System.out.println("Step " + j + " : "  + Arrays.toString(A));
        }

        //printing sorted array
        System.out.println();
        System.out.print("Sorted List: " + Arrays.toString(A));

        System.out.println();
        System.out.print("Number of Shifts: " + shiftCount);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //getting no of numbers
        System.out.print("Enter No of Numbers: ");
        int noOfNumbers = sc.nextInt();
        int[] A = new int[noOfNumbers];

        //getting user inputs
        for (int i = 0; i < noOfNumbers; i++){
            System.out.print("Enter " + (i+1) + " : ");
            A[i] = sc.nextInt();
        }

        calculation(A);
        sc.close();
    }
}
