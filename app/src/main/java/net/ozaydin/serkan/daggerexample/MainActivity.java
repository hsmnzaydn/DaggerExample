package net.ozaydin.serkan.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Ciftlik ciftlik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MvpApp) getApplication()).getCiftlikComponent().inject(MainActivity.this);

        ciftlik.yemekYedir();

    }
}
