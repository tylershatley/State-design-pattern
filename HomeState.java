/**
 * Homestate class, implementes state. Home is the home screen
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Constructor
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Pressing the home button if you are already in home state does nothing
     */
    @Override
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen");
    }

    /**
     * Pressing the netflix button prints load netflix
     * then switches to netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loding Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Pressing the hulu button prints loading hulu
     * then switches to the hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loding Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Prints bad input as there are no movies on the home screen
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Bad input, no moves on the home screen");
    }

    /**
     * Prints bad input as there are no tv shows on the home screen
     */
    @Override
    public void pressTVButton() {      
        System.out.println("Bad input, no shows on the home screen");  
    }
}