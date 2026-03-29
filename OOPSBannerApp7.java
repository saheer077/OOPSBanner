public class OOPSBannerApp {
    
    // UC7: Static inner class for character patterns
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        
        public CharacterPatternMap(char c, String[] pattern) {
            this.character = c;
            this.pattern = pattern;
        }
        
        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
        public String getLine(int line) { return pattern[line]; }
    }
    
    public static void main(String[] args) {
        // OOPS character patterns matching your output
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', new String[]{
                " **** ", 
                "*    *", 
                "*    *", 
                "*    *", 
                "*    *", 
                "*    *", 
                " **** "
            }),
            new CharacterPatternMap('P', new String[]{
                "  *****",
                " *   *",
                " *   *",
                " *****",
                " *    ",
                " *    ",
                "  *    "
            }),
            new CharacterPatternMap('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "     *",
                "     *",
                " *****"
            })
        };
        
        // Build OOPS banner: O, O, P, S
        String[] bannerLines = new String[7];
        int[] charOrder = {0, 0, 1, 2}; // Two O's, then P, then S
        
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (int idx : charOrder) {
                line.append(patterns[idx].getLine(i)).append("  ");
            }
            bannerLines[i] = line.toString().trim();
        }
        
        // Display banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
