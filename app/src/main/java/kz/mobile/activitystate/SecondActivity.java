package kz.mobile.activitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewIntentResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewIntentResult = findViewById(R.id.textViewIntentResult);

        int result = getIntent().getIntExtra("cnt_val", 0);
        textViewIntentResult.setText(String.valueOf(result));
    }
}
