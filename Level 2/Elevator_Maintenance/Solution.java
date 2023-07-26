import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String[] solution(String[] s) {
        Arrays.sort(s);
        Arrays.sort(s, new VersionComparator());
        return s;
    }
}

class VersionComparator implements Comparator<String> {
    @Override

    // creating a custom comparator
    public int compare(String version1, String version2) {

        // splitting the input strings and removing . from in between numbers
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        // comparing major version
        int major1 = major(v1);
        int major2 = major(v2);
        if (major1 == major2) {

            // comparing second number
            int middle1 = middle(v1);
            int middle2 = middle(v2);
            if (middle1 == middle2) {

                // comparing minor version number
                return minor(v1).compareTo(minor(v2));
            }
            return middle1 > middle2 ? 1 : -1;
        }
        return major1 > major2 ? 1 : -1;
    }

    // functions for comparing versions

    private Integer major(String[] version) {
        return Integer.parseInt(version[0]);
    }

    private Integer minor(String[] version) {
        return version.length > 2 ? Integer.parseInt(version[2]) : 0;
    }

    private Integer middle(String[] version) {
        return version.length > 1 ? Integer.parseInt(version[1]) : 0;
    }
}