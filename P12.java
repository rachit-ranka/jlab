import java.util.*;

public class P12 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        System.out.println("Original ArrayList: " + colorList);

        // i) Add elements of List to ArrayList
        List<String> moreColors = Arrays.asList("Orange", "Pink");
        colorList.addAll(moreColors);
        System.out.println("After adding more colors: " + colorList);

        // ii) Copy ArrayList to Array
        String[] colorArray = new String[colorList.size()];
        colorArray = colorList.toArray(colorArray);
        System.out.println("Copied Array: " + Arrays.toString(colorArray));

        // iii) Reverse ArrayList content
        Collections.reverse(colorList);
        System.out.println("Reversed ArrayList: " + colorList);

        // iv) Get Sub list from an ArrayList (index 1 to 3)
        List<String> subList = colorList.subList(1, 4);
        System.out.println("Sublist (index 1 to 3): " + subList);

        // v) Sort the ArrayList
        Collections.sort(colorList);
        System.out.println("Sorted ArrayList: " + colorList);
    }
} 