import java.util.*;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        /*System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Set<String> in = new LinkedHashSet<>();
        for (String str :
                array1) {
            for (String i :
                    array2) {
                if (i.contains(str)) {
                    in.add(str);
                }
            }
        }
        return in.toArray(new String[]{});*/
        return Arrays.stream(array1).filter(str -> Arrays.stream(array2).anyMatch(i -> i.contains(str))).distinct().sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
        System.out.println(Arrays.toString(inArray(new String[]{"tarp", "mice", "bull"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
        System.out.println(Arrays.toString(inArray(new String[]{"arp", "ali", "bull"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
        System.out.println(Arrays.toString(inArray(new String[]{"cod", "code", "wars", "ewar","pillow","armstrong"}, new String[]{"lively", "alive", "sharp", "armstrong", "codewars"})));
    }
}
