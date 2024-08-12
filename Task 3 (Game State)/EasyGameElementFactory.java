public class EasyGameElementFactory extends GameElementFactory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}
