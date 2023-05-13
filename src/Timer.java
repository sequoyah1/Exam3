public class Timer {
    private int hour;
    private int minute;

    public Timer(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Timer() {
        this.hour = 0;
        this.minute = 0;
    }

    public String value() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    public void increaseHour() {
        this.hour = (this.hour + 1);
        if (this.hour == 0) this.hour = 12;
    }

    public void increaseMin() {
        this.minute = (this.minute + 1);
        if (this.minute ==60) this.minute = 0;
    }
}