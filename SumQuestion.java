import java.util.HashSet;

public class TwoSumCheck {
    public static String twoSumExists(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int required = target - num;
            if (set.contains(required)) {
                return "YES";
            }
            set.add(num);
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(twoSumExists(arr, target));
    }
}
