public class OOPSBannerApp4 {

    public static void main(String[] args) {

        // Each element represents one ROW of the banner
        String[] banner = {

            " *****    *****    ******    ***** ",
            "*     *  *     *   *     *  *     *",
            "*     *  *     *   *     *  *      ",
            "*     *  *     *   ******    ***** ",
            "*     *  *     *   *              *",
            "*     *  *     *   *        *     *",
            " *****    *****    *         ***** "

        };

        // Loop to print banner
        for(String line : banner)
        {
            System.out.println(line);
        }
    }
}