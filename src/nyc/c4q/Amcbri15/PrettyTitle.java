package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/19/15.
 */
public class PrettyTitle {

    public static void printTitle(String titleString) {
        String[] title = titleString.split(" ");
        String newTitle = "";
        String underline = "";
        int titleLength = title.length;

        if (titleString.length() == 0) {
            return;
        }

        for (int i = 0; i < titleLength; i++) {
            /* I couldn't figure out how to make this work for different titles with words occurring in the beginning and
               throughout the title, so I would just comment these out as needed.
             */
            //if (title[i].equalsIgnoreCase("a")) {
            //    newTitle += title[i]+" ";
            //}
            if (title[i].equalsIgnoreCase("the")) {
                newTitle += title[i] + " ";
            }
            if (title[i].equalsIgnoreCase("on")) {
                newTitle += title[i] + " ";
            }
            if (title[i].equalsIgnoreCase("of")) {
                newTitle += title[i] + " ";
            }
            else {
                newTitle += title[i].substring(0, 1).toUpperCase() + title[i].substring(1) + " ";
            }
        }
        for (int j = 0; j < titleString.length(); j++) {
            if (titleString.charAt(j) == ' '){
                underline += " ";
            }
            else {
                underline += "*";
            }
        }
        System.out.println(newTitle);
        System.out.println(underline);
    }

    public static void main(String[] args) {

        printTitle("a tale of two cities");

    }
}
