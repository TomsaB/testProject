package FirstGame;

public class Hangman {

    public static void main(String[] args) {

        Game game = new Game("usource");
        Prompter prompter = new Prompter(game);

        while(game.getRemainingTimes() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayOutcome();
    }
}
