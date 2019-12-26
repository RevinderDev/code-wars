import java.util.ArrayList;

public class DRoot {

  private final static int THRESHOLD = 10;
  public static int digital_root(int n) {
    ArrayList<Integer> listOfReminders = new ArrayList();
    
    while( n>=10 )
    {
       int reminder = n % 10;
       listOfReminders.add(reminder);
       n=n/10;
    }

    listOfReminders.add(n);
    int sumOfReminders = listOfReminders
                          .stream()
                          .mapToInt( a -> a)
                          .sum();
    if(sumOfReminders >= THRESHOLD)
      return digital_root(sumOfReminders);
    return sumOfReminders;
  }
}