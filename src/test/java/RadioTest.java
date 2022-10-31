import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radio radio = new Radio();


    @Test
    void shouldSetStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    void shouldSetStation20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationUnderMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.previousStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation3() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    void shouldChangeVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}