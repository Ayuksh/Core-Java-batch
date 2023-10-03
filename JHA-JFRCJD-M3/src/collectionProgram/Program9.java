package collectionProgram;

import java.util.ArrayList;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        list1.add("core java");
        list1.add("SQL");
        list1.add("web tech");
        list1.add("automation");
        list1.add("python");
        list1.add("a");

        String minStr = list1.get(0);
        for (String s : list1)
        {
            if ( s.length() <minStr.length())
                minStr = s;
        }

        System.out.println(minStr);

    }
}
