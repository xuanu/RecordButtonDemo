package cn.zeffectn.view.recordbuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.zeffectn.view.recordbutton.view.RecordButton;

public class MainActivity extends AppCompatActivity {
    RecordButton mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (RecordButton) findViewById(R.id.button);
        //mButton.setMaxIntervalTime(100);
        //mButton.setSavePath("");
    }
}
