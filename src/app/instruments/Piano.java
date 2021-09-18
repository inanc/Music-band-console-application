package app.instruments;


public class Piano extends Instrument {
    private final int numberOfKeys;
    private final String isAcoustic;

    public Piano(String type, String manufacturer, int numberOfKeys, boolean isAcoustic) {
        super(type, manufacturer);
        this.numberOfKeys = numberOfKeys;
        this.isAcoustic = isAcoustic ? "Acustic" : "Not Acustic";
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "numberOfKeys=" + numberOfKeys +
                ", " + isAcoustic;
    }
}
