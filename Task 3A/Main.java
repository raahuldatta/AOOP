public class Main {
    public static void main(String[] args) {
        // Local File Playback
        LocalFile localFile = new LocalFile();
        MusicSource localFileMusic = new LocalFileAdapter(localFile);
        MusicSource localFileWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localFileMusic));
        localFileWithFeatures.play();
        System.out.println();

        // Online Streaming Service Playback
        OnlineStreamingService streamingService = new OnlineStreamingService();
        MusicSource streamingMusic = new OnlineStreamingServiceAdapter(streamingService);
        MusicSource streamingMusicWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(streamingMusic));
        streamingMusicWithFeatures.play();
        System.out.println();

        // Radio Station Playback
        RadioStation radioStation = new RadioStation();
        MusicSource radioMusic = new RadioStationAdapter(radioStation);
        MusicSource radioMusicWithFeatures = new EqualizerDecorator(radioMusic);
        radioMusicWithFeatures.play();
    }
}
