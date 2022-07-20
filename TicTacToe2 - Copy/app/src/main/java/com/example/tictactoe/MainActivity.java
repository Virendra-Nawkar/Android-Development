package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean gameactive = true;
    //      player representation
    //      0 - X
    //      1 - O
    int activePlayer = 0;


    int [] gameState = {2,2,2,2,2,2,2,2,2};
    //      Game Sate menas
    //      0 - X
    //      1 - O
    //      2 - Blankspace

    int [][] winingPositions = {{0,1,2},{3,4,5},{6,7,8},
                                {0,3,6},{1,4,7},{2,5,8},
                                {0,4,8},{2,4,6}};

    public  void playerTap(View view){
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        if (!gameactive){
            gameReset(view);
        }
        if (gameState[tappedImage]==2) {
            gameState[tappedImage] = activePlayer;
            img.setTranslationY(-1000f);
            if (activePlayer == 0) {
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
                TextView status = findViewById(R.id.status);
                status.setText("O's Turn - Tap to Play");
            } else {
                img.setImageResource(R.drawable.zero);
                activePlayer = 0;
                TextView status = findViewById(R.id.status);
                status.setText("X's Turn - Tap to Play");
            }


            img.animate().translationYBy(1000f).setDuration(300);
        }
        // Check if any player has won
        for (int[] winPositions: winingPositions){
            if (gameState[winPositions[0]] == gameState[winPositions[1]] &&
                    gameState[winPositions[1]] == gameState[winPositions[2]]&&
                    gameState[winPositions[0]] != 2){


                //someone has won the game - Lets Findout Who
                String winnerstr;
                gameactive = false;
                if(gameState[winPositions[0]]== 0){
                    winnerstr = "X has Won the Game";
                }
                else {
                     winnerstr = "O has Won the Game";
                }
                //update the status bar for winner
                TextView status = findViewById(R.id.status);
                status.setText(winnerstr);
            }
        }
    }
    public  void gameReset(View view){
        gameactive = true;
        activePlayer = 0;
        for (int i = 0; i< gameState.length; i++){
            gameState[i] = 2;
        }

        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView10)).setImageResource(0);

        TextView status = findViewById(R.id.status);
        status.setText("X's Turn - Tap to Play");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}