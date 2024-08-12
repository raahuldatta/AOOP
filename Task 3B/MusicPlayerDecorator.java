public abstract class MusicPlayerDecorator extends MusicPlayer {

    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer player) {
        super(player.musicSource);
        this.decoratedPlayer = player;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }
}
