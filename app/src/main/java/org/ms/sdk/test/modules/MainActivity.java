package org.ms.sdk.test.modules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.ms.module.supper.client.Modules;
import org.ms.module.test.R;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private Button buttonLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonLog = findViewById(R.id.buttonLog);

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Modules.getLogModule().e(TAG, "e");

            }
        });
    }
}
