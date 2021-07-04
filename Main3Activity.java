package com.example.administrator.book;

/**
 * Created by Administrator on 10-04-2018.
 */


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    String newString1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1=(TextView)findViewById(R.id.se);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString1= null;
            } else {
                newString1= extras.getString("STRING_I_NEED2");
            }
        } else {
            newString1= (String) savedInstanceState.getSerializable("STRING_I_NEED2");
        }
        tv1.setText(newString1+" Buy Book");
    }
    public void click111(View v){
        Toast.makeText(getApplicationContext(),"Confirmed Order ! Please pay via link received in mail",Toast.LENGTH_LONG).show();
    }
}
