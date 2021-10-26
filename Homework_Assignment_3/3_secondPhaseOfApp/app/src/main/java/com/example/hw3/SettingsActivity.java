package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    RelativeLayout settings_relativeLayout;
//    private Button sound;
//    private Button mute;
    private RadioButton sound;
    private RadioButton mute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settings_relativeLayout = findViewById(R.id.relativelayout_settings_page);
//        sound = (Button) findViewById(R.id.setting_button1);
        sound = (RadioButton) findViewById(R.id.setting_radio_button1);
        mute = (RadioButton) findViewById(R.id.setting_radio_button2);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                MediaPlayer ring= MediaPlayer.create(SettingsActivity.this,R.raw.music);
                ring.start();
                Toast.makeText(getApplicationContext(), "Play The Music", Toast.LENGTH_SHORT).show();
//                mute = (Button) findViewById(R.id.setting_button2);
                mute = (RadioButton) findViewById(R.id.setting_radio_button2);
                mute.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        ring.stop();
                        Toast.makeText(getApplicationContext(), "Stop The Music", Toast.LENGTH_SHORT).show();
                    }
                } );
            }
        } );
    }
//    public void onRadioButtonClicked(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
////        MediaPlayer ring= MediaPlayer.create(SettingsActivity.this,R.raw.music);
//        String str="";
//        switch(view.getId()) {
//            case R.id.setting_radio_button1:
//                if(checked)
////                    ring.start();
//                    str="Play The Music";
////                    sound.setChecked(true);
////                    mute.setChecked(false);
//                break;
//            case R.id.setting_radio_button2:
//                if(checked)
////                    ring.stop();
//                    str="Stop The Music";
////                    mute.setChecked(true);
////                    sound.setChecked(false);
//                break;
//        }
//        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
//    }
}