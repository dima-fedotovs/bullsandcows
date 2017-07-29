package guru.bug.bullsandcows;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Turn {
    private final IntegerProperty turnNumber = new SimpleIntegerProperty();
    private final StringProperty guess = new SimpleStringProperty();
    private final IntegerProperty cows = new SimpleIntegerProperty();
    private final IntegerProperty bulls = new SimpleIntegerProperty();

    public int getTurnNumber() {
        return turnNumber.get();
    }

    public void setTurnNumber(int turnNum) {
        this.turnNumber.set(turnNum);
    }

    public IntegerProperty turnNumberProperty() {
        return turnNumber;
    }

    public String getGuess() {
        return guess.get();
    }

    public void setGuess(String guess) {
        this.guess.set(guess);
    }

    public StringProperty guessProperty() {
        return guess;
    }

    public int getCows() {
        return cows.get();
    }

    public void setCows(int cows) {
        this.cows.set(cows);
    }

    public IntegerProperty cowsProperty() {
        return cows;
    }

    public int getBulls() {
        return bulls.get();
    }

    public void setBulls(int bulls) {
        this.bulls.set(bulls);
    }

    public IntegerProperty bullsProperty() {
        return bulls;
    }
}
