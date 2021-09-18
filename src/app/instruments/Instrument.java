package app.instruments;

import lombok.Getter;

public abstract class Instrument {
    @Getter
    private final String type;
    private final String manufacturer;

    protected Instrument(String type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return " Instrument " +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ',';
    }
}
