package ArrayTest;

public class SubsetSum {

	static boolean isPossible(int elements[], int sum)
    {
        int dp[] = new int[sum + 1];
        // initializing with 1 as sum 0 is always possible
        dp[0] = 1;
        // loop to go through every element of the elements
        // array
        for (int i = 0; i < elements.length; i++) {
            // to change the values of all possible sum
            // values to 1
            for (int j = sum; j >= elements[i]; j--) {
                if (dp[j - elements[i]] == 1)
                    dp[j] = 1;
            }
        }
        // if sum is possible then return 1
        if (dp[sum] == 1)
            return true;
        return false;
    }
    public static void main(String[] args) throws Exception
    {
        int elements[] = { 2,8, 4,9,6 };
        int sum = 15;
        if (isPossible(elements, sum))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
