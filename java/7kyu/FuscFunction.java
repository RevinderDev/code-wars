public class Kata {
  public static int fusc(int n) {
    // Your code here!
    if(n <= 1)
    {
      return n;
    }

    boolean isEven = n % 2 == 0;

    return isEven ? fusc(n/2) : (fusc(n/2) + fusc((n/2)+1));
  }
}
