import java.util.ArrayList;
import java.util.List;

public class Counter {

    public static int rhymecounter(int noOfChildren, int startIndex) {

        List<Integer> children = new ArrayList<>();

        for(int i=0; i<noOfChildren;i++) {
            children.add(i+1);
        }

        int start = startIndex;

        for(int counter = 0; counter<8; counter++) {
            if(start == children.size()) {
                start = 0;
            } else {
                start++;
            }
        }

        System.out.println(start);

        return 5;
    }
}
