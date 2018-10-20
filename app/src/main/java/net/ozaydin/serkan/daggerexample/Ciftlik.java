package net.ozaydin.serkan.daggerexample;

import javax.inject.Inject;

public class Ciftlik {
    private Inek inek;
    private Koyun koyun;

    @Inject
    public Ciftlik(Inek inek, Koyun koyun) {
        this.inek = inek;
        this.koyun = koyun;
    }

    public void yemekYedir(){
        inek.otla();
        koyun.otla();
    }
}
