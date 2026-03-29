public class OOPSBannerApp5 {

    public static void main(String[] args) {
        // UC5: Streamlined Array Initialization
        // We declare and fill the array in one single, compact statement
        String[] bannerLines = new String[] {
            String.join(" ", "  ***", "  *** ", " ****", "  ****"),
            String.join(" ", " *   *", "*   *", "*     *", "* "),
            String.join(" ", " *   *", "*   *", "*     *", "* "),
            String.join(" ", " *   *", "*   *", "* ***", "  ****"),
            String.join(" ", " *   *", "*   *", "* ", "        *"),
            String.join(" ", " *   *", "*   *", "* ", "        *"),
            String.join(" ", "  ***", "  *** ", "* ", "     ****")
        };

        // Efficient traversal using the enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}