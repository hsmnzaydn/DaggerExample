package net.ozaydin.serkan.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CiftlikModule.class})
public interface CiftlikComponent {
    void inject(MainActivity activity);

}
