package guru.bug.bullsandcows;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class MainWindowController {
    private int turnNr = 1;
    public Spinner<Integer> guessNum1;
    public Spinner<Integer> guessNum2;
    public Spinner<Integer> guessNum3;
    public Spinner<Integer> guessNum4;
    public TableView<Turn> turnsTable;

    public void doTurn() {
        Turn turn = new Turn();
        int n1 = guessNum1.getValue();
        int n2 = guessNum2.getValue();
        int n3 = guessNum3.getValue();
        int n4 = guessNum4.getValue();
        turn.setGuess("" + n1 + n2 + n3 + n4);
        turn.setTurnNumber(turnNr);
        turn.setBulls(0);
        turn.setCows(0);
        turnsTable.getItems().add(0, turn);
        turnNr++;
    }
}
