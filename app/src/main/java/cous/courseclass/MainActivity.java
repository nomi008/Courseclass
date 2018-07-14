package cous.courseclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public  void clickFunction(View View){


        EditText A1=(EditText) findViewById(R.id.A1);
        EditText A2=(EditText) findViewById(R.id.A2);

        Log.i("info",A1.getText().toString());


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
