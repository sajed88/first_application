package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private RadioGroup rdGroup;
    private Switch swLast;
    private TextView txResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();


    }

    private void setupViews() {
        edtName = findViewById(R.id.edtName);
        rdGroup = findViewById(R.id.rdGroup);
        swLast = findViewById(R.id.swLast);
        txResult = findViewById(R.id.txResult);
    }


    public void btnSave_Click(View view) {
        String msg = "";
       String name = edtName.getText().toString();
        if(!name.isEmpty()){
            msg = name;
        }
        if(swLast.isChecked()){
           msg +=", \n"+swLast.getText().toString();
        }
        int id = rdGroup.getCheckedRadioButtonId();
        if(id!=-1){
            RadioButton rd = findViewById(id);
            msg +=", \n"+rd.getText().toString();
        }
        txResult.setText(msg);
    }
}