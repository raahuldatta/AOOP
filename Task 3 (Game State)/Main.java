import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        EnemyFactory enemyFactory = new ConcreteEnemyFactory();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Choose difficulty (Easy/Medium/Hard): ");
        String difficulty = scanner.nextLine();
        gameState.setDifficulty(difficulty);

        GameElementFactory gameElementFactory;
        switch (difficulty) {
            case "Easy":
                gameElementFactory = new EasyGameElementFactory();
                break;
            case "Medium":
                gameElementFactory = new MediumGameElementFactory();
                break;
            case "Hard":
                gameElementFactory = new HardGameElementFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown difficulty: " + difficulty);
        }

        // Create enemy based on difficulty
        Enemy enemy = enemyFactory.createEnemy(difficulty);
        enemy.attack();

        // Create weapon and power-up
        Weapon weapon = gameElementFactory.createWeapon();
        PowerUp powerUp = gameElementFactory.createPowerUp();

        // Use weapon and activate power-up
        weapon.use();
        powerUp.activate();

        // Proceed to the next level
        gameState.nextLevel();

        scanner.close();
    }
}
