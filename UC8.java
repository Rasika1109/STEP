import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        
        patternMap.put('S', new String[]{
        " ****",
        "*    ",
        " *** ",
        "    *",
        "**** "
         });

        String word = "OOPS";

        int height = 5;

        for (int i = 0; i < height; i++) {
            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }
}
