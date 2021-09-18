package app.instruments;


public class Drums extends Instrument {

    private final String hasHiHat;

    public Drums(String type, String manufacturer, boolean hasHiHat) {
        super(type, manufacturer);
        this.hasHiHat = hasHiHat ? "Has Hi Hat" : "No Hi Hat";
    }

    @Override
    public String toString() {
        return super.toString() + " " + hasHiHat;
    }

}
