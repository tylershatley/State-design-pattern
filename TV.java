public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        setState(homeState);
    }

    public void pressHomeButton() {
        state.pressHomeButton();
    }

    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    public void pressHuluButton() {
        state.pressHuluButton();
    }

    public void pressMovieButton() {
        state.pressMovieButton();
    }

    public void pressTVButton() {
        state.pressTVButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public State getHomeState() {
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }
}
