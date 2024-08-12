public class Main {
    public static void main(String[] args) {
        // Local File Playback
        MusicSource localFile = new LocalFileAdapter(new LocalFile());
        MusicPlayer basicLocalPlayer = new BasicMusicPlayer(localFile);
        MusicPlayer decoratedLocalPlayer = new VolumeControlDecorator(new EqualizerDecorator(basicLocalPlayer));
        decoratedLocalPlayer.play();
        System.out.println();

        // Online Streaming Service Playback
        MusicSource streamingService = new OnlineStreamingServiceAdapter(new OnlineStreamingService());
        MusicPlayer advancedStreamingPlayer = new AdvancedMusicPlayer(streamingService);
        MusicPlayer decoratedStreamingPlayer = new EqualizerDecorator(new VolumeControlDecorator(advancedStreamingPlayer));
        decoratedStreamingPlayer.play();
        System.out.println();

        // Radio Station Playback
        MusicSource radioStation = new RadioStationAdapter(new RadioStation());
        MusicPlayer basicRadioPlayer = new BasicMusicPlayer(radioStation);
        MusicPlayer decoratedRadioPlayer = new EqualizerDecorator(basicRadioPlayer);
        decoratedRadioPlayer.play();
    }
}