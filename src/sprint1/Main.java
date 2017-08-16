package sprint1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("#######Sprint1#######");

        int[] int1 = new int[]{1, 2, 5, 4, 10, 40};
        int[] int2 = new int[]{21, 112, 115, 123, 55510, 145, 199, 112, 4444, 10, 0};
        int[] int3 = new int[]{-1, -9, 0, 1, -12, -100, 40};

        System.out.println("---- Quick sorting ----");
        System.out.println("test1:sources" + Arrays.toString(int1));
        System.out.println("test1:result");
        System.out.println("test2:sources" + Arrays.toString(int2));
        System.out.println("test2:result");
        System.out.println("test3:sources" + Arrays.toString(int3));
        System.out.println("test3:result");

        System.out.println("---- Bubble sorting ----");
        System.out.println("test1:sources" + Arrays.toString(int1));
        System.out.println("test1:result");
        System.out.println("test2:sources" + Arrays.toString(int2));
        System.out.println("test2:result");
        System.out.println("test3:sources" + Arrays.toString(int3));
        System.out.println("test3:result");

        System.out.println("---- Simple sorting ----");
        System.out.println("test1:sources" + Arrays.toString(int1));
        System.out.println("test1:result");
        System.out.println("test2:sources" + Arrays.toString(int2));
        System.out.println("test2:result");
        System.out.println("test3:sources" + Arrays.toString(int3));
        System.out.println("test3:result");

        System.out.println("---- Merge sorting ----");
        System.out.println("test1:sources" + Arrays.toString(int1));
        System.out.println("test1:result");
        System.out.println("test2:sources" + Arrays.toString(int2));
        System.out.println("test2:result");
        System.out.println("test3:sources" + Arrays.toString(int3));
        System.out.println("test3:result");
    }
}
