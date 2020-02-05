package id.ac.poliban.dts.molida.latihan10;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Button btPhone = findViewById(R.id.btPhone);
        Button btEmail = findViewById(R.id.btEmail);
        Button btWebsite = findViewById(R.id.btWebsite);
        Button btGeo = findViewById(R.id.btGeo);

        btPhone.setOnClickListener(v -> {
            Uri uri = Uri.parse("tel : 089691710217");
            Intent intent = new
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
