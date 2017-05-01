package bowling;

/**
 * Created by ignasiargemipuig on 24/4/17.
 */
public class Game {

    private int score = 0;

    public Game() {}

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
