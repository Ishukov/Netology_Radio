import Radio.Volume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VolumeTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/setVolumeDate.csv")
    public void setVolumeTest(int setVolume, int expected){
        Volume volume = new Volume();
        volume.setCurrentVolume(setVolume);

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/increaseVolumeDate.csv")
    public void increaseVolumeTest(int setVolume, int expected){
        Volume volume = new Volume();
        volume.setCurrentVolume(setVolume);
        volume.increaseVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/VolumeTestDate/reduceVolumeDate.csv")
    public void reduceVolumeTest(int setVolume, int expected){
        Volume volume = new Volume();
        volume.setCurrentVolume(setVolume);
        volume.reduceVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }



}
