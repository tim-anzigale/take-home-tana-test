import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question7_RotateList {
    public static void main(String[] args) {
        List<String> stuff = new ArrayList<>(Arrays.asList(
            "ID_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"
        ));

        int rotateBy = 2;
        int n = stuff.size();
        
        // handle big numbers
        rotateBy = rotateBy % n;
        
        if (rotateBy == 0) {
            System.out.println(stuff);
            return;
        }

        List<String> rotated = new ArrayList<>();
        
        // put the ones that should be at the front
        for (int i = n - rotateBy; i < n; i++) {
            rotated.add(stuff.get(i));
        }
        
        // add the rest
        for (int i = 0; i < n - rotateBy; i++) {
            rotated.add(stuff.get(i));
        }

        System.out.println(rotated);
    }
}
