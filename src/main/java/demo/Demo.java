package demo;

import adapterPattern.AraParrot;
import adapterPattern.CrowAdapter;
import adapterPattern.Parrot;
import adapterPattern.RavenCrow;

/**
 * Created by Anastasiya on 30.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        AraParrot ara = new AraParrot();

        RavenCrow raven = new RavenCrow();
        Parrot crowAdapter = new CrowAdapter(raven);

        System.out.println("Ara: ");
        ara.speak();
        ara.fly();

        System.out.println("Raven: ");
        raven.croak();
        raven.fly();

        System.out.println("CrowAdapter: ");
        crowAdapter.speak();
        crowAdapter.fly();
    }
}
