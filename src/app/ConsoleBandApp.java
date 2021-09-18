package app;

import app.instruments.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConsoleBandApp {

    private final List<Band> bands = new ArrayList<>();
    private final List<Musician> musiciansWithoutBands = new ArrayList<>();
    private final Random rand = new Random();

    public ConsoleBandApp() {
        createBands();
    }

    private void createBands() {
        Band spokenHub = new Band("Spoke 'n Hub");

        spokenHub.addMusician(new Musician("Null Beat", new Piano("Piano", "McFaren", 51, true)));

        spokenHub.addMusician(new Musician("Void", new Synthesizer("Synthesizer", "Lorg", 47, true)));

        spokenHub.addMusician(new Musician("Liza Baar", new Guitar("Guitar", "Bender", 5, 0.4)));
        bands.add(spokenHub);

        Band bomrass = new Band("Bomrass");

        bomrass.addMusician(new Musician("Stringsteen", new Banjo("Banjo", "Gibson", 4, 8)));

        bomrass.addMusician(new Musician("Xindea", new Drums("Drum", "Toyota", true)));

        bomrass.addMusician(new Musician("Captor", new Synthesizer("Synthesizer", "Suziki", 72, false)));
        bands.add(bomrass);

        musiciansWithoutBands.add(new Musician("iMine Creekes", new Guitar("Guitar", "Giol", 5, 1.8)));
    }

    public void listBands() {
        bands.forEach(System.out::println);
    }

    public void playOneNight() {
        //removes a random musician from bands
        bands.forEach(band -> {
            Musician musician = band.removeRandomMusician();
            if (musician != null) {
                System.out.println("Musician " + musician.getName() + " left " + band.getName());
                musiciansWithoutBands.add(musician);
            } else {
                System.out.println("Band " + band.getName() + " has no musician couldn't remove any");
            }
        });

        List<Musician> toRemove = new ArrayList<>();

        //adds musicians to a random band
        musiciansWithoutBands.forEach(musician -> {
            int random = rand.nextInt(bands.size());
            Band randomBand = bands.get(random);
            if (randomBand.addMusician(musician)) {
                toRemove.add(musician); //remove the musician from the without band list
                System.out.println("Musician " + musician.getName() + " joined " + randomBand.getName());
            }
        });

        musiciansWithoutBands.removeAll(toRemove);
    }
}
