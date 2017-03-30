package adapterPattern;

import static util.FlightSpeedConstants.SPEED_CROW;
import static util.SpeakWordsConstants.*;

/**
 * Created by Anastasiya on 30.03.2017.
 */
public class RavenCrow implements Crow {
    @Override
    public void croak() {
        System.out.println(CROAK_RAVEN_CROW);
    }

    @Override
    public void fly() {
        System.out.println("speed: " + SPEED_CROW);
    }
}
