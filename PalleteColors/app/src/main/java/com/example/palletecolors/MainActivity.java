package com.example.palletecolors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private SeekBar sbr_Red = null;
    private SeekBar sbr_Green = null;
    private SeekBar sbr_Blue = null;
    private SeekBar sbr_Alpha = null;
    private SeekBar view_Colors = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbr_Red = findViewById(R.id.sbrRed);
        sbr_Green = findViewById(R.id.sbrGreen);
        sbr_Blue = findViewById(R.id.sbrBlue);
        sbr_Alpha = findViewById(R.id.sbrAlpha);
        //view_Colors = findViewById(R.id.viewColors);
    }

    //Show options menu
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Actions options menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.iteSearch:
                Toast.makeText(this, "You've pressed Search of option", Toast.LENGTH_SHORT).show()
                break;

            case R.id.iteAboutOf :
                Toast.makeText(this, "You've pressed About of option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteHelp :
                Toast.makeText(this, "You've pressed Help option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteExit :
                Toast.makeText(this, "You've pressed E xit option", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}