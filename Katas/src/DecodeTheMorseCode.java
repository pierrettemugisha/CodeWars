import java.util.HashMap;
import java.util.Map;

public class DecodeTheMorseCode {
    private static Map<String, Character> morseCodeMap = new HashMap<>();

    private DecodeTheMorseCode() {
        morseCodeMap.put(".-", 'a');
        morseCodeMap.put("---.", 'b');
        morseCodeMap.put("-.-.", 'c');
        morseCodeMap.put("-..", 'd');
        morseCodeMap.put(".", 'e');
        morseCodeMap.put("..-.", 'f');
        morseCodeMap.put("--.", 'g');
        morseCodeMap.put("....", 'h');
        morseCodeMap.put("..", 'i');
        morseCodeMap.put(".---", 'j');
        morseCodeMap.put("-.-", 'k');
        morseCodeMap.put(".-..", 'l');
        morseCodeMap.put("--", 'm');
        morseCodeMap.put("-.", 'n');
        morseCodeMap.put("---", 'o');
        morseCodeMap.put(".--.", 'p');
        morseCodeMap.put("--.-", 'q');
        morseCodeMap.put(".-.", 'r');
        morseCodeMap.put("...", 's');
        morseCodeMap.put("-", 't');
        morseCodeMap.put("..-", 'u');
        morseCodeMap.put("...-", 'v');
        morseCodeMap.put(".-.", 'w');
        morseCodeMap.put("-..-", 'x');
        morseCodeMap.put("-.--", 'y');
        morseCodeMap.put("--..", 'z');
        morseCodeMap.put(".----", '1');
        morseCodeMap.put("..---", '2');
        morseCodeMap.put("...--", '3');
        morseCodeMap.put("....-", '4');
        morseCodeMap.put(".....", '5');
        morseCodeMap.put("-....", '6');
        morseCodeMap.put("--...", '7');
        morseCodeMap.put("---..", '8');
        morseCodeMap.put("----.", '9');
        morseCodeMap.put("-----", '0');
    }

    private static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String[] words = morseCode.trim().split("\\s{3,}");

        StringBuilder morseDecoded = new StringBuilder();
        for (String word : words) {
            for (String c_str : word.split(" ")) {
                char md = morseCodeMap.get(c_str);
                morseDecoded.append(md);
            }
            morseDecoded.append(" ");
        }
        return morseDecoded.toString().trim();
    }

    public static void main(String[] args) {
        new DecodeTheMorseCode();
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
        System.out.println(decode("   .      ."));
    }
}
