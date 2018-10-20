package net.ozaydin.serkan.daggerexample;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CiftlikModule {

    private Context context;

    public CiftlikModule(Application app){
        this.context=app;
    }

    @Provides
    Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    Inek provideInek(){
        return new Inek();
    }

    @Provides
    @Singleton
    Koyun provideKoyun(){
        return new Koyun();
    }

    @Provides
    @Singleton
    Ciftlik provideCiftlik(Inek inek,Koyun koyun){
        return new Ciftlik(inek,koyun);
    }

}
