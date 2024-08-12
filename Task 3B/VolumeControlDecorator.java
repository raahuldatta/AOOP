public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer player) {
        super(player);
    }

    @Override
    public void play() {
        super.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume set to 70%.");
    }
}
