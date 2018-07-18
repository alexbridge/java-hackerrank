package main.java.alex.bridge.OSP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EffectiveFinal {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Hi");
    list.add("Toast");
    list.add("Beer");

    // Assume effectively final
    int count = 2;

    List<String> newListlist = list.stream()
        // Filter out strings with less then 2 chars
        .filter(s -> s.length() > count)
        .collect(Collectors.toList());

    // Changing variable count to 3 throws error
    // Variable used in lambda expression should be final or effectively final
    // count = 3;

    System.out.println("Done");
  }
}