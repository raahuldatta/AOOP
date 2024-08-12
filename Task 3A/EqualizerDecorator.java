public class EqualizerDecorator extends MusicSourceDecorator {

    public EqualizerDecorator(MusicSource musicSource) {
        super(musicSource);
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
