import java.util.ArrayList;
public class findmyoccurrence {

        public static void main(String[] args) {
            int[] arr = {1, 3, 4, 3, 6, 7, 3};
            ArrayList<Integer> indices = findAllIndex(arr, 3, 0, new ArrayList<>());
            System.out.println(indices);
        }

         static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> result) {
            if (index == arr.length) {
                return result;
            }
            if (arr[index] == target) {
                result.add(index); // Use the correct variable name 'result'.
            }
            return findAllIndex(arr, target, index + 1, result);
        }
    }

