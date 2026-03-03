public class OOPSBannerApp6 {
    
    // Helper method for letter 'O'
    public static String getLineO(int line) {
        String[] pattern = {"  ***", " * * ", " * * ", " * * ", " * * ", " * * ", "  ***"};
        return pattern[line];
    }

    // Helper method for letter 'P'
    public static String getLineP(int line) {
        String[] pattern = {"**** ", " * * ", " * * ", "**** ", " *  ", " *  ", " *  "};
        return pattern[line];
    }

    // Helper method for letter 'S' - FIXED SYNTAX
    public static String getLineS(int line) {
        String[] pattern = {" ****", "*   ", "*   ", " ****", "   *", "   *", " ****"};
        return pattern[line];
    }

    public static void main(String[] args) {
        // UC6: Building banner using static helper methods
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("  ", getLineO(i), getLineO(i), getLineP(i), getLineS(i));
        }

        // Enhanced for loop display
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
