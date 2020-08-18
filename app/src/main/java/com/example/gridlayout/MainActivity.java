package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        int id=view.getId();
        System.out.println("Value"+id);
        String buttonId="";
        buttonId=view.getResources().getResourceEntryName(id);
        int resourceId=getResources().getIdentifier(buttonId,"raw","com.example.gridlayout");
            mplayer=MediaPlayer.create(this,resourceId);
        mplayer.start();
        Log.i("Button Trapped", buttonId);

    }
}