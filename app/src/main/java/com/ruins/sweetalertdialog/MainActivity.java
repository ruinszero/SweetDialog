package com.ruins.sweetalertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ruins.library.sweet.SweetAlertDialog;
import com.ruins.library.sweet.SweetAlertType;

/**
 * @author jihao
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_error).setOnClickListener(v -> new SweetAlertDialog(this, SweetAlertType.PROGRESS_TYPE).show());
    }
}
