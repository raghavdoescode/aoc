import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Part1 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input"));

    ArrayList<Integer> list = new ArrayList<Integer>();
    while (sc.hasNextInt()) {
      list.add(sc.nextInt());
    }

    int increased = 0;

    int i = 0;
    while (i < list.size() - 1) {
      if (i == 0)
        increased++;
      else if (list.get(i) > list.get(i - 1))
        increased++;

      i++;
    }
    System.out.println(increased);
  }
}
