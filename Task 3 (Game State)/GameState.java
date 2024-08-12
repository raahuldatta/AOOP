public class GameState {
    private static GameState instance;
    private int level;
    private String difficulty;

    private GameState() {
        this.level = 1;
        this.difficulty = "Easy";
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public void nextLevel() {
        this.level++;
        System.out.println("Level up! Now at level " + level);
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
        System.out.println("Difficulty set to " + difficulty);
    }
}
