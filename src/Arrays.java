public class Arrays
{
    /**
     * Swaps the leftmost 1 with the rightmost 9 in the array
     * @param a the array to make the swap
     */
    public static void swapLargestAndSmallest(int[] a)
    {
        int firstOne = 0;
        int lastNine = 0;
        boolean foundOne = false;
        boolean foundNine = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 1 && !foundOne)
            {
                firstOne = i;
                foundOne = true;
            }
            else if(a[i] == 9)
            {
                lastNine = i;
                foundNine = true;
            }
        }
        if(foundNine && foundOne)
        {
            int temp = a[firstOne];
            a[firstOne] = a[lastNine];
            a[lastNine] = temp;
        }
    }
}