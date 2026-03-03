import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {
    
    public static void main(String[] args) {
        // UC8: HashMap<Character, String[]> for pattern lookup
        Map<Character, String[]> patternMap = new HashMap<>();
        
        // Populate HashMap with character patterns
        patternMap.put('O', new String[]{
            " **** ", "*    *", "*    *", "*    *", 
            "*    *", "*    *", " **** "
        });
        patternMap.put('P', new String[]{
            "***** ", "*   * ", "*   * ", "***** ", 
            "*     ", "*     ", "*     "
        });
        patternMap.put('S', new String[]{
            " *****", "*     ", "*     ", " *****", 
            "     * ", "     * ", " *****"
        });
        
        // Build OOPS banner using HashMap lookup
        String[] bannerLines = new String[7];
        char[] word = {'O', 'O', 'P', 'S'};
        
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word) {
                line.append(patternMap.get(c)[i]);
                if (c != 'S') line.append(" "); // Space between letters
            }
            bannerLines[i] = line.toString();
        }
        
        // Enhanced for loop display
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
