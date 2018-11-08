import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) {
                s = "Fizz";
            }

            if (i % 5 == 0) {
                s += "Buzz";
            }

            if (s.length() == 0) {
                s = Integer.toString(i);
            }

            r.add(s);
        }

        return r;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> list = s.fizzBuzz(15);
        System.out.println(Arrays.toString(list.toArray()));
        //[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
    }
}
