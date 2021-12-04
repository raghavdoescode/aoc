import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;

public class Part1 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input"));

    String gamma = "";
    String epsilon = "";

    ArrayList<String> list = new ArrayList<String>();

    while (sc.hasNextLine()) {
      list.add(sc.nextLine());
    }

    for (int i = 0; i < list.get(0).length(); i++) {
      int z = 0, o = 0;
      for (String s : list) {
        char a = s.charAt(i);

        if (a == '0')
          z++;
        if (a == '1')
          o++;
      }

      if (z > o)
        gamma += "0";
      if (o > z)
        gamma += "1";
    }

    for (int i = 0; i < list.get(0).length(); i++) {
      int z = 0, o = 0;
      for (String s : list) {
        char a = s.charAt(i);

        if (a == '0')
          z++;
        if (a == '1')
          o++;
      }

      if (z < o)
        epsilon += "0";
      if (o < z)
        epsilon += "1";
    }

    System.out.println(Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2));
  }
}
