public class BasicMusicPlayer extends MusicPlayer {

    public BasicMusicPlayer(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        System.out.println("Using basic music player:");
        musicSource.play();
    }
}
