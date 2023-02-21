import Radio.RadioStation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioStationTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/setRadioDate.csv")
    public void setRadioStation(int radioStation, int expected) {
        RadioStation radio = new RadioStation();
        radio.setCurrentRadioStationNumber(radioStation);

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/nextRadioStationDate.csv")
    public void nextRadioStation(int radioStation, int expected) {
        RadioStation radio = new RadioStation();
        radio.setCurrentRadioStationNumber(radioStation);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RadioStationDate/previousRadioStationDate.csv")
    public void previousRadioStation(int radioStation, int expected) {
        RadioStation radio = new RadioStation();
        radio.setCurrentRadioStationNumber(radioStation);

        radio.previousRadioStation();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
