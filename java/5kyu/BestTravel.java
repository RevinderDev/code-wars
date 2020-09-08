import java.util.*;

public class SumOfK {

    public static void combination(List<List<Integer>> combinations, Integer[] data, List<Integer> originalList,
                                   int start, int end, int index) {
        if (index == data.length) {
            Integer[] tmp = data.clone();
            combinations.add(Arrays.asList(tmp));
        } else if (start <= end) {
            var x = originalList.get(start);
            data[index] = x;
            combination( combinations, data, originalList, start + 1, end , index + 1);
            combination( combinations, data, originalList, start + 1, end , index);
        }
    }

    public static List<List<Integer>> generate(List<Integer> originalList, int r)
    {
        List<List<Integer>> combinations = new ArrayList<>();
        combination(combinations, new Integer[r], originalList, 0, originalList.size() - 1, 0);
        return combinations;
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
      List<List<Integer>> combinations = generate(ls, k);

      return combinations.stream().map(s ->
                                       s.stream().reduce(0, Integer::sum)).filter(i -> i <= t)
                        .min(Comparator.comparingInt(i -> Math.abs(i - t))).orElse(null);
    }
}
