package youtubeJavaPractice;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        // Non-Primitive Types
        int[] marks = new int[3];
        System.out.println(marks);
        System.out.println(marks[0]);

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks);
        System.out.println(marks[0]);

        //length
        System.out.println(marks.length);

        //Sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);


        // 2nd Ways to store values in Array
        int[] marks1 = {27, 28, 25};
        System.out.println(marks1[0]);
        Arrays.sort(marks1);
        System.out.println(marks1[0]);

        //2D Arrays
        int[][] finalMarks = {{95, 67, 98}, {94, 95, 93}};
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][2]);
    }
}
