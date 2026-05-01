/*1️. Move all zeros to the end of the array
Problem:
You are given an integer array arr of size N. Move all the zeros in the array to the end while maintaining the relative order of the non-zero elements.
Example:
Input: arr = [4, 5, 0, 1, 9, 0, 5, 0]
Output: [4, 5, 1, 9, 5, 0, 0, 0] */

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros(int[] arr) {
        int j = 0; // pointer for next non-zero position
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
}
