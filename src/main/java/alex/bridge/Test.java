package alex.bridge;

public class Test {

    public static void main(String[] args) {

        String string = "My cat";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character _char = chars[i];
            System.out.println(Character.getNumericValue(_char));
        }
    }
}