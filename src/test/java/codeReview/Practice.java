package codeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove Ahmed.
 * Given a list of peoples names. Remove Ahmed
 * Ahmed John Eric Ahmed
 * Arraylist.
 */
public class Practice {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        List<String> names2 = (ArrayList<String>) names.clone();


        for (String each : names) {
            if (each.equals("Ahmed")) {
                names2.remove("Ahmed");
            }
//           names2.add(each);
        }

        for (String each2 : names2) {
            System.out.println(each2);
        }

    }
}
