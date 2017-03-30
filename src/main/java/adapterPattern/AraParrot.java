package adapterPattern;

import static util.FlightSpeedConstants.SPEED_PARROT;
import static util.SpeakWordsConstants.WORDS_ARA_PARROT;

/**
 * Created by Anastasiya on 30.03.2017.
 */
public class AraParrot implements Parrot{

    @Override
    public void speak() {
        System.out.println(WORDS_ARA_PARROT);
    }

    @Override
    public void fly() {
        System.out.println("speed: " + SPEED_PARROT);
    }
}
