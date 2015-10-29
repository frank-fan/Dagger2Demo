package learning;

import javax.inject.Inject;

import learning.coffee.CoffeeMaker;
import learning.coffee.CoffeeMakerComponent;
import learning.coffee.DaggerCoffeeMakerComponent;

/**
 * Learning App ...
 * Created by mantou on 15/10/29.
 */
public class LearningApplication {

    @Inject
    CoffeeMaker mCoffeeMaker;

    public void makeCoffee() {
        mCoffeeMaker.make();
    }

    public static void main(String[] args) {
        LearningApplication app = new LearningApplication();
        CoffeeMakerComponent component = DaggerCoffeeMakerComponent.create();


        component.getCoffeeMaker().make();
        component.getCoffeeMaker().make();


        System.out.println("----------------------------------");

        component = DaggerCoffeeMakerComponent.create();


        component.getCoffeeMaker().make();
        component.getCoffeeMaker().make();
    }
}
