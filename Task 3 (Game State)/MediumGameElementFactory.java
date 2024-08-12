public class MediumGameElementFactory extends GameElementFactory {
    @Override
    public Weapon createWeapon() {
        return new MediumWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}
