public class Max {
  public static int sequence(int[] arr) {

    int bestSum = 0;
    int currentSum = 0;
    for(int i = 0 ; i < arr.length ; i++)
    {
      currentSum = Math.max(0, currentSum + arr[i]);
      bestSum = Math.max(currentSum, bestSum);
    }
    return bestSum;
  }
}
