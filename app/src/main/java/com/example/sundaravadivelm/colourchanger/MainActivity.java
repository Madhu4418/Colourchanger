package com.example.sundaravadivelm.colourchanger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    SeekBar seekred, seekgreen, seekblue;
    TextView countred, countgreen, countblue;
    RelativeLayout layout1;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekred = (SeekBar) findViewById(R.id.seekBar1);
        seekgreen = (SeekBar) findViewById(R.id.seekBar2);
        seekblue = (SeekBar) findViewById(R.id.seekBar3);
        layout1 = (RelativeLayout) findViewById(R.id.myScreen);

        countred = (TextView) findViewById(R.id.countred);
        countgreen = (TextView) findViewById(R.id.countgreen);
        countblue = (TextView) findViewById(R.id.countblue);

        seekred.setOnSeekBarChangeListener(ChangeColor);
        seekgreen.setOnSeekBarChangeListener(ChangeColor);
        seekblue.setOnSeekBarChangeListener(ChangeColor);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }

    public SeekBar.OnSeekBarChangeListener ChangeColor = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {


        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {


        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {


            int R, G, B;

            R = seekred.getProgress();
            G = seekgreen.getProgress();
            B = seekblue.getProgress();
            layout1.setBackgroundColor(0xff000000 + R * 0x10000 + G * 0x100 + B);

            countred.setText(String.valueOf(R));
            countgreen.setText(String.valueOf(G));
            countblue.setText(String.valueOf(B));


        }



    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
