import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int number = num;
    LinkedList<Integer> listOfDigits = new LinkedList<>();
    
    while(number>0)
    {
      listOfDigits.add(number%10);
      number=number/10;  
    }

    int sortedNumber = 0;
    int decimalNumber = 1;
    listOfDigits.sort(Comparator.reverseOrder());
    for(int i = listOfDigits.size() - 1 ; i>= 0 ; --i)
    {
      sortedNumber += listOfDigits.get(i) * decimalNumber;
      decimalNumber *=10;
    }
    
    return sortedNumber;
  }
}