package com.example.myapplication_123;

import android.content.Intent; // Intent 클래스 임포트
import android.os.Bundle; // Bundle 클래스 임포트
import android.view.View; // View 클래스 임포트
import android.widget.Button; // Button 클래스 임포트
import androidx.appcompat.app.AppCompatActivity; // AppCompatActivity 클래스 임포트

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 부모 클래스의 onCreate 메서드 호출
        setContentView(R.layout.title); // title.xml 레이아웃 설정

        // 버튼을 찾아서 참조를 가져옴
        Button imageButton = findViewById(R.id.button2);

        // 버튼 클릭 리스너 설정
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MainActivity로 이동하기 위한 Intent 생성
                Intent intent = new Intent(TitleActivity.this, MainActivity.class);
                startActivity(intent); // 새로운 Activity 시작
            }
        });
    }
}
