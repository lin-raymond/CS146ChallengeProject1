import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest
{

    @Test
    void swapLargestAndSmallest()
    {
        int[] a = new int[] { 5, 4, 1, 9, 2, 6 };
        Arrays.swapLargestAndSmallest(a);
        int[] aExpected = new int[] {5, 4, 9, 1, 2, 6};
        assertArrayEquals(aExpected , a);
        //System.out.println(java.util.Arrays.toString(a));
        //System.out.println("Expected: [5, 4, 9, 1, 2, 6]");
        a = new int[] {1, 4, 1, 9, 2, 6};
        aExpected = new int[] {9, 4, 1, 1, 2, 6};
        Arrays.swapLargestAndSmallest(a);
        assertArrayEquals(aExpected , a);
        //System.out.println(java.util.Arrays.toString(a));
        //System.out.println("Expected: [9, 4, 1, 1, 2, 6]");
        a = new int[] {1, 4, 2, 9, 9, 6};
        aExpected = new int[] {9, 4, 2, 9, 1, 6};
        Arrays.swapLargestAndSmallest(a);
        assertArrayEquals(aExpected , a);
        //System.out.println(java.util.Arrays.toString(a));
        //System.out.println("Expected: [9, 4, 2, 9, 1, 6]");
        a = new int[] {3, 2, 9, 9};
        aExpected = new int[] {3, 2, 9, 9};
        Arrays.swapLargestAndSmallest(a);
        assertArrayEquals(aExpected , a);
        //System.out.println(java.util.Arrays.toString(a));
        //System.out.println("Expected: [1]");
    }
}