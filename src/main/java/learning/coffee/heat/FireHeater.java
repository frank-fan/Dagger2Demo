package learning.coffee.heat;

/**
 * FireHeater
 * Created by mantou on 15/10/29.
 */
public class FireHeater implements Heater {
    @Override
    public void heat() {
        System.out.println("FireHeater.heat.: " + toString());
    }
}
