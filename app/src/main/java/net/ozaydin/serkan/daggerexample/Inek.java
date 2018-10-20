package net.ozaydin.serkan.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Inek  {

    @Inject
    public Inek(){

    }

    public void otla() {
        Log.d("Otlatma Bilgisi","Inek otluyor");
    }
}
