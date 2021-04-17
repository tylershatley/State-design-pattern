public class NetflixState implements State {
    private TV tv;

    /**
     * Constructor
     * @param tv
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Loades the homescreen and sets the state to
     * the homescreen
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the home screen...");
        tv.setState(tv.getHomeState());
    }

    /**
     * Does nothing but prints as we are already in the netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("TV is already on the Netflix screen");
    }

    /**
     * Pressing the hulu button prints loading hulu
     * then switches to the hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loding Hulu...\n");
    }

    /**
     * prints off netflix movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:" +
        "\n- The Land Before Time" +
        "\n- Frozen" + 
        "\n- The Little Mermaid" +
        "\n- Ice Age\n");
    }

    /**
     * Prints off  the netflix tv shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Netoflix TV Shows:" +
        "\n- Peppa Pig" +
        "\n- My Little Pony" +
        "\n- Garfield" +
        "\n- Teenage Mutant Ninja Turtles\n");
    }
}