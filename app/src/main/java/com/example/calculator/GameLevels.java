package com.example.calculator;

import static android.util.Log.INFO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator.lvls.Level1;
import com.example.calculator.lvls.Level10;
import com.example.calculator.lvls.Level11;
import com.example.calculator.lvls.Level12;
import com.example.calculator.lvls.Level13;
import com.example.calculator.lvls.Level14;
import com.example.calculator.lvls.Level15;
import com.example.calculator.lvls.Level16;
import com.example.calculator.lvls.Level17;
import com.example.calculator.lvls.Level18;
import com.example.calculator.lvls.Level19;
import com.example.calculator.lvls.Level2;
import com.example.calculator.lvls.Level20;
import com.example.calculator.lvls.Level3;
import com.example.calculator.lvls.Level4;
import com.example.calculator.lvls.Level5;
import com.example.calculator.lvls.Level6;
import com.example.calculator.lvls.Level7;
import com.example.calculator.lvls.Level8;
import com.example.calculator.lvls.Level9;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Button button_back = (Button)findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO,"TrueButtonBack","Нажата клавиша 'Назад'.");
                    System.out.println("Нажата клавиша buttonBack.");
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Кнопки уровней

        // Кнопка - 1 уровень
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO, "TrueTextView1", "Нажата клавиша '1'.");
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка - 2 уровень
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO, "TrueTextView2", "Нажата клавиша '2'.");
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                }
            }
        });
            // Кнопка - 3 уровень
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView3", "Нажата клавиша '3'.");
                        Intent intent = new Intent(GameLevels.this, Level3.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 4 уровень
            TextView textView4 = (TextView) findViewById(R.id.textView4);
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView4", "Нажата клавиша '4'.");
                        Intent intent = new Intent(GameLevels.this, Level4.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 5 уровень
            TextView textView5 = (TextView) findViewById(R.id.textView5);
            textView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView5", "Нажата клавиша '5'.");
                        Intent intent = new Intent(GameLevels.this, Level5.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 6 уровень
            TextView textView6 = (TextView) findViewById(R.id.textView6);
            textView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView6", "Нажата клавиша '6'.");
                        Intent intent = new Intent(GameLevels.this, Level6.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 7 уровень
            TextView textView7 = (TextView) findViewById(R.id.textView7);
            textView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView7", "Нажата клавиша '7'.");
                        Intent intent = new Intent(GameLevels.this, Level7.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 8 уровень
            TextView textView8 = (TextView) findViewById(R.id.textView8);
            textView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView8", "Нажата клавиша '8'.");
                        Intent intent = new Intent(GameLevels.this, Level8.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 9 уровень
            TextView textView9 = (TextView) findViewById(R.id.textView9);
            textView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView9", "Нажата клавиша '9'.");
                        Intent intent = new Intent(GameLevels.this, Level9.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 10 уровень
            TextView textView10 = (TextView) findViewById(R.id.textView10);
            textView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView10", "Нажата клавиша '10'.");
                        Intent intent = new Intent(GameLevels.this, Level10.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 11 уровень
            TextView textView11 = (TextView) findViewById(R.id.textView11);
            textView11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView11", "Нажата клавиша '11'.");
                        Intent intent = new Intent(GameLevels.this, Level11.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 12 уровень
            TextView textView12 = (TextView) findViewById(R.id.textView12);
            textView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView12", "Нажата клавиша '12'.");
                        Intent intent = new Intent(GameLevels.this, Level12.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 13 уровень
            TextView textView13 = (TextView) findViewById(R.id.textView13);
            textView13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView13", "Нажата клавиша '13'.");
                        Intent intent = new Intent(GameLevels.this, Level13.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 14 уровень
            TextView textView14 = (TextView) findViewById(R.id.textView14);
            textView14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView14", "Нажата клавиша '14'.");
                        Intent intent = new Intent(GameLevels.this, Level14.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 15 уровень
            TextView textView15 = (TextView) findViewById(R.id.textView15);
            textView15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView15", "Нажата клавиша '15'.");
                        Intent intent = new Intent(GameLevels.this, Level15.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 16 уровень
            TextView textView16 = (TextView) findViewById(R.id.textView16);
            textView16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView16", "Нажата клавиша '16'.");
                        Intent intent = new Intent(GameLevels.this, Level16.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 17 уровень
            TextView textView17 = (TextView) findViewById(R.id.textView17);
            textView17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView17", "Нажата клавиша '17'.");
                        Intent intent = new Intent(GameLevels.this, Level17.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 18 уровень
            TextView textView18 = (TextView) findViewById(R.id.textView18);
            textView18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView18", "Нажата клавиша '18'.");
                        Intent intent = new Intent(GameLevels.this, Level18.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 19 уровень
            TextView textView19 = (TextView) findViewById(R.id.textView19);
            textView19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView19", "Нажата клавиша '19'.");
                        Intent intent = new Intent(GameLevels.this, Level19.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 20 уровень
            TextView textView20 = (TextView) findViewById(R.id.textView20);
            textView20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView20", "Нажата клавиша '20'.");
                        Intent intent = new Intent(GameLevels.this, Level20.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });

    }

    //Системная кнопка "Назад"
    @Override
    public void onBackPressed(){
        try {
            Log.println(INFO,"TrueButtonBack","Нажата системная клавиша 'Назад'.");
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}