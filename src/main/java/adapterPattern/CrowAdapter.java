package adapterPattern;

import static util.FlightSpeedConstants.*;

/**
 * Created by Anastasiya on 30.03.2017.
 */
public class CrowAdapter implements Parrot {
    Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    @Override
    public void speak() {
        crow.croak();
    }

    @Override
    public void fly() {
        for (int i = 0; i < (SPEED_PARROT/SPEED_CROW); i++) {
            crow.fly();
        }
    }
}
