package Radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStationNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 10;

    public Radio(int amountRadioStation) {
        maxRadioStation = amountRadioStation - 1;
        if (maxRadioStation < 0) {
            maxRadioStation = 0;
        }
    }

    protected void nextRadioStation() {
        int target = currentRadioStationNumber + 1;
        if (target > maxRadioStation) {
            target = minRadioStation;
        }
        setCurrentRadioStationNumber(target);
    }

    protected void previousRadioStation() {
        int target = currentRadioStationNumber - 1;
        if (target < minRadioStation) {
            target = maxRadioStation;
        }
        setCurrentRadioStationNumber(target);
    }

    protected void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    protected void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStation) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

}
