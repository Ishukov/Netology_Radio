package Radio;

public class Radio {
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

    public int currentVolume;
    public int getCurrentVolume(){
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
