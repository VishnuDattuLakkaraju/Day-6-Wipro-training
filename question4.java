import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        // Taking 4 string inputs
        for (int i = 1; i <= 4; i++) {
            map.put(i, s.next());
        }

        // Display map before removal
        System.out.println("Mappings of HashMap are : " + map);

        // Taking key to remove
        int keyToRemove = s.nextInt();

        // Removing the key
        map.remove(keyToRemove);

        // Display map after removal
        System.out.println("Mappings after removal are : " + map);
        }
}
