package id.ac.poliban.mi.maisarah.android_lat07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Ubah action default pada action bar
        if (getSupportActionBar()!=null)
            getSupportActionBar().setTitle("Second Activity");
    }
}
