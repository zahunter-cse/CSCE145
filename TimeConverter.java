
public class TimeConverter {

	// Instance variables
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; // true if AM, false if PM

    // Default constructor
    public TimeConverter() {
        hours = 0;
        minutes = 0;
        seconds = 0;
        notPM = true; // Default is AM
    }

    // Parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) throws TimeException {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Accessors (getters)
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isNotPM() {
        return notPM;
    }

    // Mutators (setters) with validation
    public void setHours(int hours) throws TimeException {
        if (hours < 0 || hours >= 24) {
            throw new TimeException("Invalid hour value");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws TimeException {
        if (minutes < 0 || minutes >= 60) {
            throw new TimeException("Invalid minute value");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws TimeException {
        if (seconds < 0 || seconds >= 60) {
            throw new TimeException("Invalid second value");
        }
        this.seconds = seconds;
    }

    // Method to update time with hours, minutes, and seconds
    public void updateTime(int hours, int minutes, int seconds) throws TimeException {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);

        if (hours >= 12) {
            notPM = false; // PM
            if (hours > 12) {
                this.hours -= 12; // Convert to 12-hour format
            }
        } else {
            notPM = true; // AM
            if (hours == 0) {
                this.hours = 12; // 0 hours in military time means 12 AM
            }
        }
    }

    // Overloaded updateTime with String input (hh:mm:ss)
    public void updateTime(String timeString) throws TimeException {
        try {
            String[] parts = timeString.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            updateTime(hours, minutes, seconds);
        } catch (Exception e) {
            throw new TimeException("EXCEPTION: Invalid time entered!");
        }
    }

    // Method to display the time in 12-hour format
    public void displayTime() {
        String ampm = notPM ? "AM" : "PM";
        System.out.printf("%d:%02d:%02d %s\n", hours, minutes, seconds, ampm);
    }

}
