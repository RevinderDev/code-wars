public class Solution {

    public static String camelCase(String str) {
       String[] words = str.split(" +");
       StringBuilder camelCaseWord = new StringBuilder();
       for(int i = 0 ; i < words.length ; i++)
       {
           if(words[i].isEmpty())
             continue;
           words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
           camelCaseWord.append(words[i]);
       }
       return camelCaseWord.toString();
    }

}