package app;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class Band {
    @Getter
    private final String name;
    private final Random rand = new Random();
    private final Map<String, Musician> musicianMap = new HashMap<>();

    public boolean addMusician(Musician musician) {
        if (!musicianMap.containsKey(musician.getInstrument().getType())) {
            musicianMap.put(musician.getInstrument().getType(), musician);
            return true;
        } else {
            System.out.println("Band " + name + " already have one " + musician.getInstrument().getType() + " instrument " + "musician " + musician.getName() + " not accepted ");
            return false;
        }
    }

    public Musician removeRandomMusician() {
        if (musicianMap.size() == 0)
            return null;

        List<String> keysAsArray = new ArrayList<>(musicianMap.keySet());
        //sets map keys to array to find random
        return musicianMap.remove(keysAsArray.get(rand.nextInt(keysAsArray.size())));
    }

    @Override
    public String toString() {
        return "Band name" +
                "='" + name + '\'' +
                " Members: " + musicianMap.values();

    }
}
