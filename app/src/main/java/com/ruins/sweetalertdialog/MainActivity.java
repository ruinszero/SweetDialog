package com.ruins.sweetalertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ruins.library.sweet.SweetAlertDialog;

/**
 * @author jihao
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new SweetAlertDialog(this).show();
        new SweetAlertDialog(this, SweetAlertDialog.AlertType.ERROR_TYPE).show();
    }
}
