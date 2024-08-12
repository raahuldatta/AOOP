public class ConcreteEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyEnemy();
            case "Medium":
                return new MediumEnemy();
            case "Hard":
                return new HardEnemy();
            default:
                throw new IllegalArgumentException("Unknown difficulty: " + difficulty);
        }
    }
}