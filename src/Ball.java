public class Ball {
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    public Ball() {};

    // ball : "\uD83E\uDD4E"
    // runner : "\uD83C\uDFC3"
    public void ballRoll() throws InterruptedException
    {
        System.out.println(WHITE + "Look!" + PURPLE + "A ball is rolling away!");
        System.out.println(CYAN + "Catch it! \uD83D\uDE32");
        System.out.println(RED + "\uD83E\uDD4E               " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E              " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E             " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E            " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E           " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E          " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E         " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E      " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E     " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E   " + WHITE + "\uD83C\uDFC3");
        Thread.sleep(500);
        System.out.println(RED + "\uD83E\uDD4E" + WHITE + "\uD83C\uDFC3");
        System.out.println(BLUE_BRIGHT + "You caught it!");
    }
}
