package com.example.calculator.lvls;

import static android.util.Log.INFO;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.GameLevels;
import com.example.calculator.R;

import java.util.Random;

public class Level11 extends AppCompatActivity {

    Dialog dialog;

    // Переменные карточек
    public int numLeft;
    public int numRight;
    Array array = new Array();
    Random random = new Random();
    public int playerPoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // Текст текущего уровня
        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level11);
        // Путь к тексту карточек
        final TextView text_left = findViewById(R.id.text_left);
        final TextView text_right = findViewById(R.id.text_right);
        // Скругление углов у карточек уровня
        final ImageView img_left = (ImageView)findViewById(R.id.img_left);
        img_left.setClipToOutline(true);
        final ImageView img_right = (ImageView)findViewById(R.id.img_right);
        img_right.setClipToOutline(true);

        // Запуск и разворачивание окна.
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Вызов стартового диалогового окна
        dialogShow(R.layout.dialog_preview);

        // Кнопка назад
        Button button_back = (Button)findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO, "TrueButtonBack", "Нажата клавиша 'Назад'.");
                    Intent intent = new Intent(Level11.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        // Массив прогресса игрока
        final int[] progress = { R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5};

        // Генерация карточек
        generateCards(img_left, img_right);
        // Обработка нажатий на картинки левой карты
        leftCardListener(progress, img_left, img_right);
        // Обработка нажатий на картинки правой карты
        rightCardListener(progress, img_left, img_right);
    }

    //Системная кнопка "Назад"
    @Override
    public void onBackPressed() {
        try {
            Log.println(INFO,"TrueButtonBack","Нажата системная клавиша 'Назад'.");
            Intent intent = new Intent(Level11.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }

    // Вызов диалогового окна (R.layout.dialog_preview, R.layout.dialog_lvlfinish)
    public void dialogShow(final int dialog_view) {
        // Вызов диалогового окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(dialog_view);
        // Прозрачный фон диалогового окна
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        // Запрет закрытия окна кнопкой "Назад"
        dialog.setCancelable(false);
        // Кнопка закрытия диалога
        {
            TextView buttonClose = (TextView) dialog.findViewById(R.id.buttonClose);
            buttonClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO,"TrueButtonClose","Нажата клавиша 'Х'.");
                        Intent intent = new Intent(Level11.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            dialog.dismiss();
        }
        {
            TextView buttonContinue = (TextView) dialog.findViewById(R.id.buttonContinue);
            buttonContinue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO,"TrueButtonContinue","Нажата клавиша 'Продолжить'.");
                        if (dialog_view == R.layout.dialog_preview) {
                            dialog.dismiss();
                        } else if (dialog_view == R.layout.dialog_lvlfinish) {
                            Intent intent = new Intent(Level11.this, Level12.class);
                            startActivity(intent);
                            finish();
                        }
                    } catch (Exception e) {
                    }
                }
            });
        }
        dialog.show();
    }

    // Генерация карточек
    public void generateCards(ImageView img_left, ImageView img_right){
        // Путь к тексту карточек
        final TextView text_left = findViewById(R.id.text_left);
        final TextView text_right = findViewById(R.id.text_right);

        // Анимация карточек
        final Animation a = AnimationUtils.loadAnimation(Level11.this, R.anim.alpha);

        numLeft = random.nextInt(8);
        img_left.setImageResource(array.images1[numLeft]);
        img_left.startAnimation(a);
        text_left.setText(array.textList1[numLeft]);

        numRight = random.nextInt(8);
        while (numLeft == numRight) {
            numRight = random.nextInt(8);
        }
        img_right.setImageResource(array.images1[numRight]);
        img_right.startAnimation(a);
        text_right.setText(array.textList1[numRight]);
    }

    // Обработка нажатий на картинки левой карты
    public void leftCardListener(int[] progress, ImageView img_left, ImageView img_right){
        img_left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // Касание (нажато)
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    img_right.setEnabled(false);
                    if (numLeft>numRight){
                        img_left.setImageResource(R.drawable.card_template_true);
                    } else {
                        img_left.setImageResource(R.drawable.card_template_false);
                    }
                }
                // Касание (отпущено)
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP) {
                    if (numLeft>numRight){
                        if (playerPoint<5) {
                            playerPoint=playerPoint+1;
                        }
                    } else {
                        if (playerPoint>0) {
                            playerPoint=playerPoint-2;
                            if (playerPoint < 0) playerPoint=0;
                        }
                    }
                    for (int count=0; count<5; count++){
                        TextView textView = findViewById(progress[count]);
                        textView.setBackgroundResource(R.drawable.style_point);
                    }
                    for (int count=0; count<playerPoint; count++){
                        TextView textView = findViewById(progress[count]);
                        textView.setBackgroundResource(R.drawable.style_point_true);
                    }
                    if (playerPoint==5){
                        // Выход из уровня
                        // Вызов финишного диалогового окна
                        dialogShow(R.layout.dialog_lvlfinish);
                    } else {
                        // Генерация карточек
                        generateCards(img_left, img_right);

                        img_right.setEnabled(true);
                    }
                }
                return true;
            }
        });
    }

    // Обработка нажатий на картинки правой карты
    public void rightCardListener(int[] progress, ImageView img_left, ImageView img_right){
        img_right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // Касание (нажато)
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    img_left.setEnabled(false);
                    if (numRight>numLeft){
                        img_right.setImageResource(R.drawable.card_template_true);
                    } else {
                        img_right.setImageResource(R.drawable.card_template_false);
                    }
                }
                // Касание (отпущено)
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP) {
                    if (numRight>numLeft){
                        if (playerPoint<5) {
                            playerPoint=playerPoint+1;
                        }
                    } else {
                        if (playerPoint>0) {
                            playerPoint=playerPoint-2;
                            if (playerPoint < 0) playerPoint=0;
                        }
                    }
                    for (int count=0; count<5; count++){
                        TextView textView = findViewById(progress[count]);
                        textView.setBackgroundResource(R.drawable.style_point);
                    }
                    for (int count=0; count<playerPoint; count++){
                        TextView textView = findViewById(progress[count]);
                        textView.setBackgroundResource(R.drawable.style_point_true);
                    }
                    if (playerPoint==5){
                        // Выход из уровня
                        // Вызов финишного диалогового окна
                        dialogShow(R.layout.dialog_lvlfinish);
                    } else {
                        // Генерация карточек
                        generateCards(img_left, img_right);

                        img_left.setEnabled(true);
                    }
                }
                return true;
            }
        });
    }


}