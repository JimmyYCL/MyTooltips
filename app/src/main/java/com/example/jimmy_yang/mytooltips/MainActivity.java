package com.example.jimmy_yang.mytooltips;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.example.jimmy_yang.mytooltips.tourguide.Overlay;
import com.example.jimmy_yang.mytooltips.tourguide.Pointer;
import com.example.jimmy_yang.mytooltips.tourguide.ToolTip;
import com.example.jimmy_yang.mytooltips.tourguide.TourGuide;

public class MainActivity extends AppCompatActivity {



    private Button btnClickMe1, btnClickMe2, btnClickMe3;

    private TourGuide mTourGuideHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickMe1 = (Button) findViewById(R.id.btnTest1);
        btnClickMe2 = (Button) findViewById(R.id.btnTest2);
        btnClickMe3 = (Button) findViewById(R.id.btnTest3);

        mTourGuideHandler = TourGuide.init(this).with(TourGuide.Technique.CLICK)
                .setPointer(new Pointer())
                .setToolTip(
                        new ToolTip()
                                .setTitle("Welcome...")
                                .setDescription("... to MrBool website!!")
                                .setBackgroundColor(Color.parseColor("#e54d26"))
                                .setShadow(true)
                                .setGravity(Gravity.BOTTOM | Gravity.RIGHT))
                .setOverlay(new Overlay())
                .playOn(btnClickMe1);
    }

    public void clickMe1(View view) {
        mTourGuideHandler.cleanUp();

        mTourGuideHandler
                .setToolTip(new ToolTip()
                        .setTitle("Here you'll find...")
                        .setDescription("... a lot of good tutorials")
                        .setBackgroundColor(Color.parseColor("#4b4b4b")))
                .playOn(btnClickMe2);
    }

    public void clickMe2(View view) {
        mTourGuideHandler.cleanUp();

        mTourGuideHandler
                .setToolTip(new ToolTip()
                        .setTitle("Enjoy!!!")
                        .setDescription("and leave a comment if you like it! :)")
                        .setBackgroundColor(Color.parseColor("#0E37EC"))
                        .setGravity(Gravity.TOP | Gravity.RIGHT))
                .playOn(btnClickMe3);
    }

    public void clickMe3(View view) {
        mTourGuideHandler.cleanUp();
    }
}


