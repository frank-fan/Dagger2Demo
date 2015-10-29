package learning.coffee.heat;

/**
 * ElectricalHeater
 * Created by mantou on 15/10/29.
 */
public class ElectricalHeater implements Heater {
    @Override
    public void heat() {
        System.out.println("ElectricalHeater.heat.: " + toString());
    }
}
