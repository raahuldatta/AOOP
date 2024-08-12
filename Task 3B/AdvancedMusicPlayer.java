public class AdvancedMusicPlayer extends MusicPlayer {

    public AdvancedMusicPlayer(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        System.out.println("Using advanced music player with additional features:");
        musicSource.play();
    }
}
