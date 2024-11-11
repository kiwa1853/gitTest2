package com.example.myapplication_123;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; // Intent import 추가

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);
        ImageView myImageView = findViewById(R.id.myImageView); // ImageView 추가

        // view 클릭 시 다이얼로그 표시
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });

        // myImageView 클릭 시 새로운 액티비티로 전환
        myImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TitleActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showCustomDialog() {
        // 다이얼로그 생성
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.cutom); // custom.xml 레이아웃 설정

        // 다이얼로그 배경을 투명하게 설정
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageView = dialog.findViewById(R.id.imageView);
        ImageView smallImageView = dialog.findViewById(R.id.imageView4);

        // 작은 이미지 클릭 시 다이얼로그 닫기
        smallImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // 다이얼로그 닫기
            }
        });

        dialog.show();
    }
}
