import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

For example:

MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
*/

public class DecodeTheMorseCode {
    private static final Map<String, String> morseCodeMap = new HashMap<>();

    private static void MorseCode() {
        morseCodeMap.put(".-", "a");
        morseCodeMap.put("---.", "b");
        morseCodeMap.put("-.-.", "c");
        morseCodeMap.put("-..", "d");
        morseCodeMap.put(".", "e");
        morseCodeMap.put("..-.", "f");
        morseCodeMap.put("--.", "g");
        morseCodeMap.put("....", "h");
        morseCodeMap.put("..", "i");
        morseCodeMap.put(".---", "j");
        morseCodeMap.put("-.-", "k");
        morseCodeMap.put(".-..", "l");
        morseCodeMap.put("--", "m");
        morseCodeMap.put("-.", "n");
        morseCodeMap.put("---", "o");
        morseCodeMap.put(".--.", "p");
        morseCodeMap.put("--.-", "q");
        morseCodeMap.put(".-.", "r");
        morseCodeMap.put("...", "s");
        morseCodeMap.put("-", "t");
        morseCodeMap.put("..-", "u");
        morseCodeMap.put("...-", "v");
        morseCodeMap.put(".--", "w");
        morseCodeMap.put("-..-", "x");
        morseCodeMap.put("-.--", "y");
        morseCodeMap.put("--..", "z");
        morseCodeMap.put(".----", "1");
        morseCodeMap.put("..---", "2");
        morseCodeMap.put("...--", "3");
        morseCodeMap.put("....-", "4");
        morseCodeMap.put(".....", "5");
        morseCodeMap.put("-....", "6");
        morseCodeMap.put("--...", "7");
        morseCodeMap.put("---..", "8");
        morseCodeMap.put("----.", "9");
        morseCodeMap.put("-----", "0");
    }

    private static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String[] words = morseCode.trim().split("\\s{3,}");

        DecodeTheMorseCode.MorseCode();

        StringBuilder morseDecoded = new StringBuilder();
        /*for (String word : words) {
            for (String c_str : word.split("\\s+")) {
                String character = morseCodeMap.get(c_str);
                morseDecoded.append(character);
            }
            morseDecoded.append(" ");
        }*/
        Arrays.stream(words).forEach(str -> {
            Arrays.stream(str.split("\\s+")).forEach(c_str -> {
                String md = morseCodeMap.get(c_str);
                morseDecoded.append(md);
            });
            morseDecoded.append(" ");
        });
        return morseDecoded.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(DecodeTheMorseCode.decode(".... . -.--   .--- ..- -.. ."));
        System.out.println(DecodeTheMorseCode.decode("   .      ."));
    }
}
