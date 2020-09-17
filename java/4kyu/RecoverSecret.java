import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecretDetective {


    public static String recoverSecret(char[][] triplets)
    {
        List<Character> characterList = new ArrayList<>(new HashSet<>(Arrays.stream(triplets)
                .flatMap(chars -> IntStream.range(0, chars.length).mapToObj(i -> chars[i]))
                .collect(Collectors.toList())));

        for(char[] c : triplets)
        {
            checkIndexes(characterList, c[1], c[2]);
            checkIndexes(characterList, c[0], c[1]);
        }
        return characterList.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void checkIndexes(List<Character> characters, Character c, Character k)
    {
        if(characters.indexOf(c) > characters.indexOf(k))
        {
            characters.remove(c);
            characters.add(characters.indexOf(k), c);
        }
    }

}
