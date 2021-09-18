package app.instruments;

public class Synthesizer extends Instrument {
    private final int numberOfKeys;
    private final String hasLED;

    public Synthesizer(String type, String manufacturer, int numberOfKeys, boolean hasLED) {
        super(type, manufacturer);
        this.numberOfKeys = numberOfKeys;
        this.hasLED = hasLED ? "Has Led" : "No Led";
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "numberOfKeys=" + numberOfKeys +
                "," + hasLED;
    }
}
