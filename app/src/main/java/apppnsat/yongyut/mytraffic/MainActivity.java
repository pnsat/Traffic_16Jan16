package apppnsat.yongyut.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
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

        //ListView Controller
        ListViewController();




    }  // Main Method

    private void ListViewController() {

        //1#
        int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        //#2
        String[] titleStrings = new String[20];
        titleStrings[0] = "หัวขัอหลัก ที่ 1";
        titleStrings[1] = "หัวขัอหลัก ที่ 2";
        titleStrings[2] = "หัวขัอหลัก ที่ 3";
        titleStrings[3] = "หัวขัอหลัก ที่ 4";
        titleStrings[4] = "หัวขัอหลัก ที่ 5";
        titleStrings[5] = "หัวขัอหลัก ที่ 6";
        titleStrings[6] = "หัวขัอหลัก ที่ 7";
        titleStrings[7] = "หัวขัอหลัก ที่ 8";
        titleStrings[8] = "หัวขัอหลัก ที่ 9";
        titleStrings[9] = "หัวขัอหลัก ที่ 10";
        titleStrings[10] = "หัวขัอหลัก ที่ 11";
        titleStrings[11] = "หัวขัอหลัก ที่ 12";
        titleStrings[12] = "หัวขัอหลัก ที่ 13";
        titleStrings[13] = "หัวขัอหลัก ที่ 14";
        titleStrings[14] = "หัวขัอหลัก ที่ 15";
        titleStrings[15] = "หัวขัอหลัก ที่ 16";
        titleStrings[16] = "หัวขัอหลัก ที่ 17";
        titleStrings[17] = "หัวขัอหลัก ที่ 18";
        titleStrings[18] = "หัวขัอหลัก ที่ 19";
        titleStrings[19] = "หัวขัอหลัก ที่ 20";

        //#3
        String[] descriptionStrings = getResources().getStringArray(R.array.description);

        //Create ListView
        MyAdapter objMyAdapter = new MyAdapter(getBaseContext(), iconInts,
                titleStrings, descriptionStrings);
        TrafficListView.setAdapter(objMyAdapter);

    }


    private void buttonController() {


        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttonMediaPlayer.start();

                //Show Webview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/5zROCThpVyc"));
                startActivity(objIntent);







  }  //event
        });


    }
    private void bindWidget() {
        TrafficListView = (ListView) findViewById(R.id.livTraffic);
        aboutMeButton = (Button) findViewById(R.id.button);


    }
} // Main Class
