import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void calculating (String text , Map <Character, Integer> map) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                map.put(text.charAt(i), map.containsKey(text.charAt(i)) ? map.get(text.charAt(i)) + 1 : 1);
            }
        }
    }

    public static Integer resultMax (Map <Character, Integer> map) {
        int max = -1;
        char letter = '.';
        for (int i = 0; i < map.size(); i++) {
            if (map.get(text.charAt(i)) == null) {
                continue;
            }
            int letters = map.get(text.charAt(i));
            if (letters > max) {
                max = letters;
                letter = text.charAt(i);
            }
        }
        System.out.println("Буква , использующаяся в тексте макс. кол-во раз : " + letter + " " + map.get(letter) + " раз(а)" );
        return map.get(letter);
    }

    public static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        calculating(text, map);

        System.out.println(resultMax(map));



    }
}