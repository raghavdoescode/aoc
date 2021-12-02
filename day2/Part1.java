import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
  public static void main(String[] args) throws FileNotFoundException {

    // Regex pattern
    String pattern = "\\d";

    Pattern r = Pattern.compile(pattern);

    // Positions
    int depth = 0;
    int hpos = 0;

    Scanner sc = new Scanner(new File("input"));
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      Matcher m = r.matcher(line);

      int i = 0;

      if (m.find()) {
        i = Integer.parseInt(m.group());
      }

      if (line.indexOf("forward") != -1) {
        // Increase hpos
        hpos += i;
      }

      if (line.indexOf("down") != -1) {
        // Increase depth
        depth += i;
      }

      if (line.indexOf("up") != -1) {
        // Decrease depth
        depth -= i;
      }
    }

    System.out.println(hpos * depth);
  }
}
