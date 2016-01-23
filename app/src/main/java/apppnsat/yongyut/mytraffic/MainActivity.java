package apppnsat.yongyut.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private ListView TrafficListView;
    private Button aboutMeButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


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


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }  // Main Method

    private void ListViewController() {

        //1#
        final int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        //#2
        final String[] titleStrings = new String[20];
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


        //Actiove When Click on ListView
        TrafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);

                objIntent.putExtra("Title", titleStrings[position]);
                objIntent.putExtra("Image", iconInts[position]);
                objIntent.putExtra("Index", position);
                startActivity(objIntent);




            }  //event
        });

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
                objIntent.setData(Uri.parse("https://youtu.be/rpGAAyAQWIQ"));
                startActivity(objIntent);


            }  //event
        });


    }

    private void bindWidget() {
        TrafficListView = (ListView) findViewById(R.id.livTraffic);
        aboutMeButton = (Button) findViewById(R.id.button);


    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://apppnsat.yongyut.mytraffic/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://apppnsat.yongyut.mytraffic/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
} // Main Class
