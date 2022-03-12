package com.example.textcounterapp2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcounterapp2022.utils.TextUtils;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner spOptionSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelection.setAdapter(adapter);
    }

    public void onBtnCalculateClick(View view) {
        if (this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Words")) {
            //TODO:
        } else {
            String content = this.txtMain.getText().toString();
            int charsCount = content.length();
            String charsCountFormatted = String.valueOf(charsCount);
            this.tvResult.setText(charsCountFormatted);
        }
    }
}
