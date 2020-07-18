import java.util.stream.*;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Greed{
  public static int greedy(int[] dice){
    //code here

    int totalSum = 0;
    Map<Integer, Long> countedMap = Arrays.stream(dice)
      .boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

    for(Map.Entry<Integer, Long> entry : countedMap.entrySet())
    {
      long tmp = entry.getValue();
      int val = entry.getKey();
      while(tmp >= 3)
      {
          int multiplier = 100;

          if(val == 1)
            multiplier *= 10;
          totalSum += val * multiplier;
          tmp -= 3;
      }
      if(tmp > 0)
      {
        if(val == 1)
          totalSum += val * 100 * tmp;
        else if(val == 5)
          totalSum += val * 10 * tmp;
      }
    }
    return totalSum;
  }
}
