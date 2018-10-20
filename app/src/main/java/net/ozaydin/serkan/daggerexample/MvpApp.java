package net.ozaydin.serkan.daggerexample;

import android.app.Application;


public class MvpApp extends Application {

    private CiftlikComponent ciftlikComponent;

    public CiftlikComponent getCiftlikComponent() {
        return ciftlikComponent;
    }

    public void setCiftlikComponent(CiftlikComponent ciftlikComponent) {
        this.ciftlikComponent = ciftlikComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        ciftlikComponent= DaggerCiftlikComponent.builder().ciftlikModule(new CiftlikModule(this)).build();

    }
}
