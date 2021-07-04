package com.example.administrator.book;

/**
 * Created by Administrator on 10-04-2018.
 */
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private ImageView mImageView;
    private TextView tv;
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("STRING_I_NEED");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }
        mImageView = (ImageView) findViewById(R.id.selectImage);
        tv=(TextView)findViewById(R.id.selectText);
        if(newString.equals("Intro to html")) {
            mImageView.setImageResource(R.drawable.one);
            tv.setText("\nPRICE: 50$\n\n it is an Intro to html\n" +
                    "\nAuthor: Paulo Coelho\n" +

                    "\nPublisher: HarperCollins  \n" +
                    "\nOriginal language: Portuguese\n" +
                    
                    "\nGenres:study");

        }
        else if(newString.equals("Intro to css")){
            mImageView.setImageResource(R.drawable.two);

            tv.setText("\nPRICE: 80$\n\n it is an Intro to css\n" +
                    "\nOriginally published: 2006\n" +
                    "\nAuthor: Paulo Coelho\n" +
                    "\nGenre: study");
        }
        else if(newString.equals("Intro to php")) {
            mImageView.setImageResource(R.drawable.three);
            tv.setText("\nPRICE: 75$\n\nit is an Intro to php\n" +
                    "\nOriginally published: 2008\n" +
                    "\nAuthor: Paulo Coelho\n" +
                    "\nGenre: study\n" +


                    "\nCountry: us");

        }
        //Toast.makeText(getApplicationContext(),newString,Toast.LENGTH_LONG).show();





    }
    public void button11(View v){
        Intent i = new Intent(Main2Activity.this, Main3Activity.class);

        i.putExtra("STRING_I_NEED2", newString);
        startActivity(i);

    }
}
