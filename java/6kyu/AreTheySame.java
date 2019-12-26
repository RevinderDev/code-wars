import java.util.*;
import java.util.stream.Collectors;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
      if( a == null || b == null )
        return false;
      return Arrays.equals(
             Arrays.stream(a).map(n -> n * n).sorted().toArray(),
             Arrays.stream(b).sorted().toArray());
  }
}

/* =================================== */

import java.util.*;
import java.util.stream.Collectors;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
      if( a == null || b == null )
        return false;
      if( a.length == 0 || b.length == 0)
        { 
          if ( a.length == b.length )
            return true;
          else 
            return false;
        }
      Arrays.sort(b);
      List<Integer> sortedArray = Arrays.stream(a)
        .map(n -> n * n)
        .sorted()
        .boxed()
        .collect(Collectors.toList());
        
      for(int i = 0; i< sortedArray.size() ; ++i)
      {  
        if(sortedArray.get(i) != b[i])
          return false;
      }
      return true;
  }
}