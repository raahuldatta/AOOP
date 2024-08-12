public class VolumeControlDecorator extends MusicSourceDecorator {

    public VolumeControlDecorator(MusicSource musicSource) {
        super(musicSource);
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
