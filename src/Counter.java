import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counter {

    public static List rhymecounter(int noOfChildren, int startIndex) {

        List<Integer> children = new ArrayList<>();

        for (int i = 0; i < noOfChildren; i++) {
            children.add(i + 1);
        }

        int start = startIndex - 1;

        while (children.size() > 1) {
            for (int counter = 1; counter < 8;) {
                if (start >= children.size() - 1) {
                    start = 0; counter++;
                } else {start++; counter++;}
            }

            children.remove(start);
            System.out.println(Arrays.asList(children));
        }

        return children;
    }
}
