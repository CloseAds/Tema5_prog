package ejercicios_string_buffer;
import java.util.*;
public class Barquito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("FIN")) {
                break;
            }
            lines.add(line);
        }

        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        String[] words = longestLine.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = words[i].toUpperCase();
            } else {
                words[i] = words[i].toLowerCase();
            }
        }

        Arrays.sort(words);

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }

        System.out.println(result.toString().trim());

        scanner.close();

    }

}
