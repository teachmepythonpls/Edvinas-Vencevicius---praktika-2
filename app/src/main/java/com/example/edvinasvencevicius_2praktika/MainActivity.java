package com.example.edvinasvencevicius_2praktika;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Spinner spinner;
    Button countButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        countButton = findViewById(R.id.countButton);
        resultTextView = findViewById(R.id.resultTextView);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.count_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count();
            }
        });
    }

    private void count() {
        String text = editText.getText().toString().trim();
        String countType = spinner.getSelectedItem().toString();

        if (text.isEmpty()) {
            showToast(getString(R.string.toast_empty_input));
            return;
        }

        int count = 0;
        if (countType.equals(getString(R.string.words))) {
            count = WordCounter.countWords(text);
        } else if (countType.equals(getString(R.string.characters))) {
            count = WordCounter.countCharacters(text);
        }

        displayResult(count);
    }

    private void displayResult(int count) {
        resultTextView.setText(getString(R.string.result_label) + " " + count);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

