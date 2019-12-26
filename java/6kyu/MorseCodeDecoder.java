public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
      String morseWords[] = morseCode.split(" ");
      StringBuilder decodedMessage = new StringBuilder();
      for(String character : morseWords)
        decodedMessage.append(MorseCode.get(character));
      return decodedMessage.toString().replaceAll("null+"," ").replaceAll("  "," ").trim();
    }
}