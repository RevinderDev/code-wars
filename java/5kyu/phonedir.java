import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.lang.StringBuilder;

class PhoneDir {
    
public static  String phone(String strng, String num) 
    {
        // your code
        System.out.println(strng);
        System.out.println(num);
        // Don't look at this, i've got challenged to do it asap without much thinking..

    	String phoneDirEntries[] = strng.split("\n");
    	List<String> filteredNumbers = Arrays.stream(phoneDirEntries)
    			.filter(entry -> entry.contains("+"+num))
    			.collect(Collectors.toList());

    	if(filteredNumbers.size() > 1)
    		return "Error => Too many people: " + num;
    	if(filteredNumbers.size() == 0)
    		return "Error => Not found: "+num;

        return parseEntry(filteredNumbers.get(0));
    }

    public static String parseEntry(String entry)
    {
    	StringBuilder sbNumber = new StringBuilder();
    	StringBuilder sbName = new StringBuilder();
    	StringBuilder wholeThing = new StringBuilder();
    	for(int i = 0; i < entry.length() ;i++)
    	{
    		char c = entry.charAt(i);
    		if(c == '+')
    		{ 
    			while(true)
    			{
            if( i + 1 >= entry.length())
              break;
              
            if(!(Character.isDigit(entry.charAt(i+1)) || entry.charAt(i+1) == '-'))
              break;
    				i++;
    				sbNumber.append(entry.charAt(i));
    			}
    		}	
    		if(c == '<')
    		{
    			while(entry.charAt(i+1) != '>')
    			{
    				i++;
    				sbName.append(entry.charAt(i));
    			}
    		}
    	}
    	String number = sbNumber.toString().replace(";","").trim();
    	String name = sbName.toString();
    	entry = entry.replaceAll("[<>$+;/*?:,!]|"+name+"|"+number+"|","");
    	entry = entry.replaceAll("\\s\\s+", " ");
      entry = entry.replaceAll("_", " ");
    	return wholeThing.append("Phone => " + number + ", Name => " + name + ", Address => " + entry.trim()).toString();
    }

}