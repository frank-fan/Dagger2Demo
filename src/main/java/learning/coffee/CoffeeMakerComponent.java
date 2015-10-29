package learning.coffee;

import javax.inject.Singleton;

import dagger.Component;
import learning.LearningApplication;

/**
 * CoffeeMakerComponent
 * Created by mantou on 15/10/29.
 */
@Singleton
@Component(modules = CofferMakerModule.class)
public interface CoffeeMakerComponent {

    CoffeeMaker getCoffeeMaker();

    void inject(LearningApplication app);
}
