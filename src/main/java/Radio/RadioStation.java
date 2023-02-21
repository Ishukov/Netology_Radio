package Radio;

public class RadioStation {
    public int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void nextRadioStation() {
        int target = currentRadioStationNumber + 1;
        if (target > 9) {
            target = 0;
        }
        setCurrentRadioStationNumber(target);
    }

    public void previousRadioStation() {
        int target = currentRadioStationNumber - 1;
        if (target < 0) {
            target = 9;
        }
        setCurrentRadioStationNumber(target);
    }

}
