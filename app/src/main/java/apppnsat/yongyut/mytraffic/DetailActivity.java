package apppnsat.yongyut.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detTextView;
    private ImageView traImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bind widget
        bindWidget();

        // show View
        showView();






    }  //main Method

    private void showView() {

        //show title
        String string = getIntent().getStringExtra("Title");
        titleTextView.setText(string);

        //show image
        int intIcon = getIntent().getIntExtra("Image", 0);
        traImageView.setImageResource(intIcon);

        //show detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.detail);




    } //showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView2);
        traImageView = (ImageView) findViewById(R.id.imageView2);
        detTextView = (TextView) findViewById(R.id.textView4);
       // detTextView.setText();
    }
}  //main class
