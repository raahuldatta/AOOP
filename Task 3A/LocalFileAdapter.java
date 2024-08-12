public class LocalFileAdapter implements MusicSource {
    private LocalFile localFile;

    public LocalFileAdapter(LocalFile localFile) {
        this.localFile = localFile;
    }

    @Override
    public void play() {
        localFile.playLocalFile();
    }
}
