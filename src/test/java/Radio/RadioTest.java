package Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();

    Radio volume = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/amountRadioDate.csv")
    public void shouldAmountRadioStation(int amountRadioStation, int expected) {
        Radio radio = new Radio(amountRadioStation);

        int actual = radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/setRadioDate.csv")
    public void shouldSetRadioStation(int radioStation, int expected) {
        radio.setCurrentRadioStationNumber(radioStation);

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/nextRadioStationDate.csv")
    public void shouldNextRadioStation(int radioStation, int expected) {
        radio.setCurrentRadioStationNumber(radioStation);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/previousRadioStationDate.csv")
    public void shouldPreviousRadioStation(int radioStation, int expected) {
        radio.setCurrentRadioStationNumber(radioStation);

        radio.previousRadioStation();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/setVolumeDate.csv")
    public void shouldSetVolumeTest(int setVolume, int expected) {
        volume.setCurrentVolume(setVolume);

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/increaseVolumeDate.csv")
    public void shouldIncreaseVolumeTest(int setVolume, int expected) {
        volume.setCurrentVolume(setVolume);
        volume.increaseVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/reduceVolumeDate.csv")
    public void shouldReduceVolumeTest(int setVolume, int expected) {
        volume.setCurrentVolume(setVolume);
        volume.reduceVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
