package alex.bridge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Booking6 {

    private static String placeOfStart = "Bevagna";
    private static int totalHours = 24;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        Map cities = new HashMap<String, Integer>();
        for(int b = 0; b <= lines; b++) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            cities.put(parts[0], Integer.parseInt(parts[1]));
        }

        lines = scanner.nextInt();
        HashMap<String, HashMap<String, Integer>> directions = new HashMap<>();
        for(int b = 0; b <= lines; b++) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if(directions.get(parts[0]) == null) {
                directions.put(parts[0], new HashMap<>());
            }
            if(directions.get(parts[1]) == null) {
                directions.put(parts[1], new HashMap<>());
            }
            directions.get(parts[0]).put(parts[1], Integer.parseInt(parts[2]));
            directions.get(parts[1]).put(parts[0], Integer.parseInt(parts[2]));

            //  sort by time
            directions.put(parts[0], sortHashMap(directions.get(parts[0])));
            directions.put(parts[1], sortHashMap(directions.get(parts[1])));
        }
        scanner.close();

        // Exit immidiately when no directions provided
        if(directions.get(placeOfStart) == null) {
            System.out.println("NON");
            System.exit(0);
        }

        int hoursVisit = 0;
        String visitPlace = placeOfStart;
        while (hoursVisit < totalHours) {

            HashMap posibilities = directions.get(visitPlace);

        }
    }

    private static HashMap<String, Integer> sortHashMap (HashMap<String, Integer> unsorted) {
        return unsorted.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));
    }
}