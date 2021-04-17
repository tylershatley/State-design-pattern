public class HuluState implements State {
    private TV tv;

    /**
     * Constructor
     * @param tv
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    /**
     * Sends the state back to the home screen
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the home screen...");
        tv.setState(tv.getHomeState());
    }

    /**
     * Pressing the netflix button prints load netflix
     * then switches to netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loding Netflix...\n");
        tv.setState(tv.getNetflixState());
        System.out.println(tv.getState());
    }

    /**
     * Does nothing but print off we are already in the hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("TV is already on the Hulu screen");
    }

    /**
     * Loads Hulu movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies: " +
        "\n- Cars" +
        "\n- Cinderella" +
        "\n- Wall-E" +
        "\n- ET\n");
    }

    /**
     * Loads hulu tv shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows: " +
        "\n- sesame street" +
        "\n- care bears" +
        "\n- loney tunes\n");
    }
}