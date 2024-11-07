package com.example.myapplication_123;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private TextView finishTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 메인 레이아웃 파일

        checkBox = findViewById(R.id.checkBox);
        finishTextView = findViewById(R.id.textView3);

        // FINISH 텍스트 클릭 리스너 설정
        finishTextView.setOnClickListener(v -> showCustomDialog());
    }

    private void showCustomDialog() {
        // custom.xml 레이아웃을 다이얼로그에 설정
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.cutom, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);

        // 다이얼로그 생성
        AlertDialog dialog = builder.create();

        // imageView4 클릭 리스너 설정
        ImageView imageView4 = dialogView.findViewById(R.id.imageView4);
        imageView4.setOnClickListener(v -> dialog.dismiss()); // imageView4 클릭 시 다이얼로그 닫기

        dialog.show();
    }
}
