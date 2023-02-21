import Radio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/setRadioDate.csv")
    public void setRadioStation(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(radioStation);

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/nextRadioStationDate.csv")
    public void nextRadioStation(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(radioStation);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/previousRadioStationDate.csv")
    public void previousRadioStation(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(radioStation);

        radio.previousRadioStation();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/setVolumeDate.csv")
    public void setVolumeTest(int setVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(setVolume);

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/increaseVolumeDate.csv")
    public void increaseVolumeTest(int setVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(setVolume);
        volume.increaseVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/reduceVolumeDate.csv")
    public void reduceVolumeTest(int setVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(setVolume);
        volume.reduceVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}
