import java.util.*;
import java.util.stream.Collectors;

public class CarMileage {

    private static String INCREMENTAL = "1234567890";
    private static String DECREMENTAL = "9876543210";
    private static Palindrome PALINDROME = (str) -> new StringBuilder(str).reverse().toString().equals(str);
    private static Round ROUNDED = (str -> str.chars().mapToObj((i) -> (char) i).collect(Collectors.toSet()).equals(Set.of('0')));


    public static int isInteresting(int number, int[] awesomePhrases) {
        Map<Integer, Integer> rewardMap = Map.of(number, 2, number + 1, 1, number + 2, 1);
        List<Integer> nums =  Arrays.stream(awesomePhrases).boxed().collect(Collectors.toList());
        for(Map.Entry<Integer, Integer> entry : rewardMap.entrySet())
        {
            int val = entry.getKey();
            String strVal = Integer.toString(val);
            if((INCREMENTAL.contains(strVal) || DECREMENTAL.contains(strVal) ||
               PALINDROME.isPal(strVal) || ROUNDED.isRound(strVal.substring(1)) || nums.contains(val)) && val >= 100)
                return entry.getValue();

        }
        return 0;
    }

    interface Palindrome {
        boolean isPal(String str);
    }

    interface Round {
        boolean isRound(String str);
    }

}
