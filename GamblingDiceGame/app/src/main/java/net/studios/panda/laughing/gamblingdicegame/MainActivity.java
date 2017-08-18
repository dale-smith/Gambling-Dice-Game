package net.studios.panda.laughing.gamblingdicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button
        Button btnRoll;
        btnRoll = (Button) findViewById(R.id.btnRoll);
        //Images
        final ImageView leftDice = (ImageView) findViewById(R.id.imgLeftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.imgRightDice);
        //Array
        final int [] arrDice = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6
        };

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Gambling Dice Game","The Button has been pressed!");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Gambling Dice Game","The Left Random number is: " + number);
                leftDice.setImageResource(arrDice[number]);

                number = randomNumberGenerator.nextInt(6);
                Log.d("Gambling Dice Game","The Right Random number is: " + number);
                rightDice.setImageResource(arrDice[number]);
            }
        });
    }
}
