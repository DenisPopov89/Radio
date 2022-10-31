public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int maxStation, int minStation, int currentStation, int currentVolume, int maxVolume, int minVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }


    public Radio() {
    }

    public int getNumberOfStation() {
        return currentStation;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        currentStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        currentStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        currentVolume = minVolume;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }


    public void prevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}