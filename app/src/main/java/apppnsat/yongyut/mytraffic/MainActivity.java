package apppnsat.yongyut.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private ListView TrafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget
        bindWidget();

        //Button Controller

        buttonController();
    }  // Main Method

    private void buttonController() {


        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
                buttonMediaPlayer.start();


            }  //event
        });


    }

    private void bindWidget() {
        TrafficListView = (ListView) findViewById(R.id.livTraffic);
        aboutMeButton = (Button) findViewById(R.id.button);


    }
} // Main Class
