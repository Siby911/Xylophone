package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Add member variables here
    private SoundPool msound;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new SoundPool
        msound =new SoundPool(7,AudioManager.STREAM_MUSIC,0);

        // Load and get the IDs to identify the sounds

        mCSoundId=msound.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=msound.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId=msound.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId=msound.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId=msound.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId=msound.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId=msound.load(getApplicationContext(),R.raw.note7_b,1);





    }

    //Add the play methods triggered by the buttons
    public void playc(View v)
    {
        msound.play(mCSoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playd(View v)
    {
        msound.play(mDSoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playe(View v)
    {
        msound.play(mESoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playf(View v)
    {
        msound.play(mFSoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playg(View v)
    {
        msound.play(mGSoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playa(View v)
    {
        msound.play(mASoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playb(View v)
    {
        msound.play(mBSoundId,1.0f,1.0f,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }



}
