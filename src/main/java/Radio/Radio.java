package Radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    protected void nextRadioStation() {
        int target = currentRadioStationNumber + 1;
        if (target > 9) {
            target = 0;
        }
        setCurrentRadioStationNumber(target);
    }

    protected void previousRadioStation() {
        int target = currentRadioStationNumber - 1;
        if (target < 0) {
            target = 9;
        }
        setCurrentRadioStationNumber(target);
    }

    protected void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    protected void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    protected void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    protected void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
