import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input"));

    int hpos = 0;
    int depth = 0;
    int aim = 0;

    String pattern = "\\d";

    Pattern r = Pattern.compile(pattern);
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      Matcher m = r.matcher(line);

      int i = 0;

      if (m.find()) {
        i = Integer.parseInt(m.group());
      }

      if (line.indexOf("forward") != -1) {
        hpos += i;
        depth += aim * i;
      }

      if (line.indexOf("down") != -1) {
        aim += i;
      }

      if (line.indexOf("up") != -1) {
        aim -= i;
      }
    }

    System.out.println(hpos * depth);

  }
}
