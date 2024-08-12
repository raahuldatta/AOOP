public class EqualizerDecorator extends MusicPlayerDecorator {

    public EqualizerDecorator(MusicPlayer player) {
        super(player);
    }

    @Override
    public void play() {
        super.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Equalizer set to 'Rock' mode.");
    }
}
