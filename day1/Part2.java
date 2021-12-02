import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Part2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input"));

    int increased = 0;

    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> sums = new ArrayList<Integer>();

    while (sc.hasNextInt()) {
      list.add(sc.nextInt());
    }

    for (int i = 0; i < list.size() - 2; i++) {
      int sum = list.get(i) + list.get(i + 1) + list.get(i + 2);
      sums.add(sum);
    }

    for (int index = 1; index < sums.size(); index++) {
      if (sums.get(index) > sums.get(index - 1)) {
        increased++;
      }
    }

    System.out.println(increased);

  }
}
