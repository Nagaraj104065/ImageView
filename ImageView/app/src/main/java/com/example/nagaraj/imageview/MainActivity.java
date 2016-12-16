package com.example.nagaraj.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button btn;
    ImageView img;
    TextView txt;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        img=(ImageView) findViewById(R.id.imageView);
        txt=(TextView) findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flag==0){
                    img.setImageResource(R.drawable.sathya);
                    txt.setText("hi thanks for clicking images");
                    btn.setText("clicked"+flag);
                    flag=1;
                }else{
                    img.setImageResource(R.drawable.no);
                    txt.setText("hello thanks for clicking images1");
                    flag=0;
                    btn.setText("clicked"+flag);
                }
            }
        });
    }
}
