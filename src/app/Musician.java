package app;

import app.instruments.Instrument;
import lombok.Getter;

@Getter
public class Musician {
    private final String name;
    private final Instrument instrument;

    public Musician(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "\nMusician " +
                "name='" + name + '\'' +
                "" + instrument +
                ' ';
    }
}
