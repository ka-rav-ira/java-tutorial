public class repeatedAndMissing

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                String input = br.readLine();
                String[] inputs = input.split(" ");
                int[] arr = new int[inputs.length];

                for (int i = 0; i < inputs.length; i++) {
                    arr[i] = Integer.parseInt(inputs[i]);
                }

                // Get the result as an ArrayList<Integer>
                ArrayList<Integer> ans = new Solution().findTwoElement(arr);
                System.out.println(ans.get(0) + " " + ans.get(1));
                System.out.println("~");
            }
        }
    }

// } Driver Code Ends

import java.util.*;
// User function Template for Java

// Import required classes

    class Solution {
        // Function to find two elements in the array
        ArrayList<Integer> findTwoElement(int arr[]) {
            // Create a HashMap to store the occurrence of each element
            HashMap<Integer, Integer> map = new HashMap<>();

            // Fill the HashMap with element occurrences
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            // Initialize variables for the missing and repeated numbers
            int repeated = -1;
            int missing = -1;

            // Check for the repeated element
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) {
                    repeated = entry.getKey();
                    break;
                }
            }

            // Calculate the expected sum of numbers from 1 to n
            int n = arr.length;
            int expectedSum = (n * (n + 1)) / 2;

            // Calculate the actual sum of the array elements
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }

            // Missing number = Expected sum - (Actual sum - Repeated number)
            missing = expectedSum - (actualSum - repeated);

            // Return the repeated and missing numbers as a list
            ArrayList<Integer> result = new ArrayList<>();
            result.add(repeated);
            result.add(missing);
            return result;
        }
    }

}
