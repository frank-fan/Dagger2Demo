package learning.coffee.pump;

/**
 * ThermosiphonPump
 * Created by mantou on 15/10/29.
 */
public class ThermosiphonPump implements Pump {

    @Override
    public void exec() {
        System.out.println("ThermosiphonPump.exec: " + toString());
    }
}
