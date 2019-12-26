import java.util.TreeMap;
import java.util.Map;

public class Order {
  public static String order(String words) {
   if(words.isEmpty())
      return "";
   String[] arrayOfWords = words.split("\\s+");
   Map<Integer,String> orderedWords = new TreeMap<>();
   for(int i=0; i<arrayOfWords.length ; ++i)
    {    
      for(char symbol : arrayOfWords[i].toCharArray())
      {  
        if(Character.isDigit(symbol))
        {  
          orderedWords.put(Character.getNumericValue(symbol)-1,arrayOfWords[i]);
          break;
        }
      } 
    }

    StringBuilder stringBuilder = new StringBuilder();
    for(int i = 0 ; i<arrayOfWords.length-1;++i)
      stringBuilder.append(orderedWords.get(i) + " ");
    stringBuilder.append(orderedWords.get(arrayOfWords.length-1));
    return stringBuilder.toString();
  }
}