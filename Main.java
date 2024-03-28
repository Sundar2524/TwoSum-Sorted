import java.util.HashMap;

public class Main{

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] result = findTwoSum(arr, 11);
        if(result != null) {
            for (int i : result) {
                System.out.printf(i + " ");
            }
        }
    }

    private static int[] findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> twoSum = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            int sum = target - arr[i];
            if(twoSum.containsKey(arr[i])) {
                return new int[]{twoSum.get(arr[i]), i};
            }
            twoSum.put(sum, i);
        }
        return null;
    }
}