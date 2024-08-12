public class RadioStationAdapter implements MusicSource {
    private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public void play() {
        radioStation.playRadioStation();
    }
}
