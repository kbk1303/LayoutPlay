package zbc.dk.krik.layoutplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button showImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showImage = findViewById(R.id.btn_show_image);
        showImage.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_layout, ShowImageFragment.class, null)
                    .setReorderingAllowed(true)
                    .commit();
        });
    }
}