package kuis.kuissiapatahu;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Question mQuestion = new Question();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestion.mQuestion.length;

   //Random r;
    public int identifikasi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        identifikasi = 0;

        score.setText("Score : " +mScore);

       updateQuestion(identifikasi);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer )  {
                    mScore++;
                    score.setText("Score :" +mScore);
                    identifikasi+=1;
                    Log.d("TAG-identifikas", String.valueOf(identifikasi));
                    if(identifikasi == 9){
                        menang();
                    }else{
                        updateQuestion(identifikasi);
                    }
                }else{
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer )  {
                    mScore++;
                    score.setText("Score :" +mScore);
                    identifikasi+=1;
                    Log.d("TAG-identifikas", String.valueOf(identifikasi));
                    if(identifikasi == 9){
                        menang();
                    }else{
                        updateQuestion(identifikasi);
                    }
                }else{
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer )  {
                    mScore++;
                    score.setText("Score :" +mScore);
                    identifikasi+=1;
                    Log.d("TAG-identifikas", String.valueOf(identifikasi));
                    if(identifikasi == 9){
                        menang();
                    }else{
                        updateQuestion(identifikasi);
                    }
                }else{
                    gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer )  {
                    mScore++;
                    score.setText("Score :" +mScore);
                    identifikasi+=1;
                    Log.d("TAG-identifikas", String.valueOf(identifikasi));
                    if(identifikasi == 9){
                        menang();
                    }else{
                        updateQuestion(identifikasi);
                    }
                }else{
                    gameOver();
                }
            }
        });
    }

        private void updateQuestion(int num){
            question.setText(mQuestion.getQuestion(num));
            answer1.setText(mQuestion.getChoice1(num));
            answer2.setText(mQuestion.getChoice2(num));
            answer3.setText(mQuestion.getChoice3(num));
            answer4.setText(mQuestion.getChoice4(num));

            mAnswer = mQuestion.getCorrectAnswer(num);
            Log.d("TAG", mAnswer);
            Log.d("TAG-identifikasi", String.valueOf(num));
        }

        private void gameOver(){
            AlertDialog.Builder alertDiaolgBuilder = new AlertDialog.Builder(HomeActivity.this);
            alertDiaolgBuilder
                    .setMessage("Game Over! Your Score is " + mScore + " points")
                    .setCancelable(false)
                    .setPositiveButton("New Game",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                                }
                            })
                    .setNegativeButton("Exit",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            });
            AlertDialog alertDialog = alertDiaolgBuilder.create();
            alertDialog.show();
        }

        private void menang(){
            AlertDialog.Builder alertDiaolgBuilder = new AlertDialog.Builder(HomeActivity.this);
            alertDiaolgBuilder
                    .setMessage("Congrats! " + mScore + " points")
                    .setCancelable(false)
                    .setPositiveButton("New Game",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                                }
                            })
                    .setNegativeButton("Exit",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            });
            AlertDialog alertDialog = alertDiaolgBuilder.create();
            alertDialog.show();
        }
}
