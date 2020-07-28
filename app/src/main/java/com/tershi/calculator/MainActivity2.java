package com.tershi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Title ,author;
    Button back ,btnClick_Author ,btnClick_openYT ,btnClick_FB ,btnClick_Policy ,btnClick_Open_Source;
    Uri AuthorURL = Uri.parse("https://official.tershi.ml");
    Uri Open_Source = Uri.parse("https://zh.wikipedia.org/zh-tw/%E9%96%8B%E6%BA%90%E8%BB%9F%E9%AB%94");
    Uri AuthorYT = Uri.parse("https://www.youtube.com/channel/UCPdpFDFOp3sPbZhRkaQVaQA?");
    Uri AuthorFB = Uri.parse("https://www.facebook.com/Tershi25648");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Title = findViewById(R.id.Title);
        author = findViewById(R.id.author);
        back = findViewById(R.id.btnClick_back);
        btnClick_Author = findViewById(R.id.btnClick_Author);
        btnClick_openYT = findViewById(R.id.btnClick_openYT);
        btnClick_FB = findViewById(R.id.btnClick_FB);
        btnClick_Policy = findViewById(R.id.btnClick_Policy);
        btnClick_Open_Source = findViewById(R.id.btnClick_Open_Source);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnClick_Author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Intent.ACTION_VIEW ,AuthorURL);
                startActivity(it);
            }
        });
        btnClick_openYT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ytit = new Intent(Intent.ACTION_VIEW,AuthorYT);
                ytit.setPackage("com.google.android.youtube");
                startActivity(ytit);
            }
        });
        btnClick_FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    Intent intent = new Intent(Intent.ACTION_VIEW, AuthorFB);
                    startActivity(intent);

                } catch (Exception e) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, AuthorFB);
                    startActivity(intent);
                }
            }
        });
        btnClick_Policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setClass(MainActivity2.this,PolicyActivity.class);
                startActivity(it);
            }
        });
        btnClick_Open_Source.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Intent.ACTION_VIEW,Open_Source);
                startActivity(it);
            }
        });

    }
}