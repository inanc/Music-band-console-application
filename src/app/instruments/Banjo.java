package app.instruments;


public class Banjo extends Instrument {

    private final int numberOfString;
    private final double stringSize;

    public Banjo(String type, String manufacturer, int numberOfString, double stringSize) {
        super(type, manufacturer);
        this.numberOfString = numberOfString;
        this.stringSize = stringSize;
    }

    @Override
    public String toString() {
        return super.toString() + "" +
                " number Of String=" + numberOfString +
                ", string Size=" + stringSize +
                ' ';
    }
}
