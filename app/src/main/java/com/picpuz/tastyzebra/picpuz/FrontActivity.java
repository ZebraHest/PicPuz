package com.picpuz.tastyzebra.picpuz;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class FrontActivity extends ActionBarActivity {

    Button button;
    ImageView image;
    boolean first = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_front);

        addListenerButton();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.front, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void addListenerButton(){
        image = (ImageView) findViewById(R.id.imageView1);



        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first){
                    image.setImageResource(R.drawable.mess);
                    image.setCropToPadding(true);
                    first = false;
                }else{
                    image.setImageResource(R.drawable.ic_launcher);
                    first = true;
                }

            }
        });

    }

    public ImageView[] cutPicture(ImageView d){
        ImageView lars;


        return null;
    }

}
