package net.ozaydin.serkan.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Koyun  {
    
    @Inject
    public Koyun(){
        
    }
    
    public void otla() {
        Log.d("Otlatma Bilsidi","Koyun otluyor");
    }
}
