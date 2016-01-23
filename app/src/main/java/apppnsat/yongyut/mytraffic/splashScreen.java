package apppnsat.yongyut.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        MediaPlayer intrMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_tata);
        intrMediaPlayer.start();
//Threan
        Handler obHandler = new Handler();
        obHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashScreen.this, MainActivity.class));
                finish();


            }
        },8000);


    }

}
