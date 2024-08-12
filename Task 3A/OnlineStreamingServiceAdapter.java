public class OnlineStreamingServiceAdapter implements MusicSource {
    private OnlineStreamingService onlineService;

    public OnlineStreamingServiceAdapter(OnlineStreamingService onlineService) {
        this.onlineService = onlineService;
    }

    @Override
    public void play() {
        onlineService.playStreamingService();
    }
}
