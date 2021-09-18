package app.instruments;

public class Guitar extends Instrument {
    private final int stringSize;
    private final double numberOfString;

    public Guitar(String type, String manufacturer, int stringSize, double numberOfString) {
        super(type, manufacturer);
        this.stringSize = stringSize;
        this.numberOfString = numberOfString;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "string Size=" + stringSize +
                ", number Of String=" + numberOfString;
    }
}
