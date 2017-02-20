package com.example.android.quizapp;

import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;
import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgress;
    private CountDownTimer countTD;
    private int progressTimeLeft;
    private int correctAnswers = 0;
    private int layoutID = R.id.first_layout;
    private int countDText = R.id.firstCountDTextView;
    private int progressBarID = R.id.first_progress_bar;
    private int AAnswerID = R.id.first_AAnswer;
    private int BAnswerID = R.id.first_BAnswer;
    private int CAnswerID = R.id.first_CAnswer;
    private int DAnswerID = R.id.first_DAnswer;
    private int counter = 0;
    private int[] answers = {R.id.first_CAnswer, R.id.second_BAnswer, R.id.third_DAnswer, R.id.fourth_BAnswer, R.id.fifth_BAnswer, R.id.sixth_CAnswer,
            R.id.seventh_DAnswer, R.id.eighth_CAnswer, R.id.ninth_BAnswer, R.id.tenth_AAnswer};

    private RadioButton firstRadio;
    private RadioButton secondRadio;
    private RadioButton thirdRadio;
    private RadioButton lastRadio;
    private ViewGroup firstViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CountDownTimer set to 30 sec, intersec 10ms to make progress bar look smoother.
        countTD = new CountDownTimer(30000, 10) {
            public void onTick(long millisUntilFinished) {
                mProgress = (ProgressBar) findViewById(progressBarID);
                progressTimeLeft = (int) millisUntilFinished / 1000;            //1 sec
                mProgress.setProgress((int) millisUntilFinished / 10);          //0,01sec
                TextView countDTextView = (TextView) findViewById(countDText);  //Display time left in textView
                countDTextView.setText(Integer.toString(progressTimeLeft));
            }

            public void onFinish() {
                counter++;                                                      //Counts questions.
                firstRadio = (RadioButton) findViewById(AAnswerID);
                secondRadio = (RadioButton) findViewById(BAnswerID);
                thirdRadio = (RadioButton) findViewById(CAnswerID);
                lastRadio = (RadioButton) findViewById(DAnswerID);

                //Case when non answer is checked.
                if (progressTimeLeft == 0 && !firstRadio.isChecked() && !secondRadio.isChecked() && !thirdRadio.isChecked() &&
                        !lastRadio.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Time run out. Next question.", Toast.LENGTH_SHORT).show();
                    //Set current viewGroup to be gone.
                    firstViewGroup = (ViewGroup) findViewById(layoutID);
                    firstViewGroup.setVisibility(GONE);
                    if (counter == 10) {                                        //If 10th question, go to results.
                        displayResults(correctAnswers);
                        return;
                    }
                }
                //Case when answer is checked.
                else {
                    //Set current viewGroup to be gone.
                    firstViewGroup = (ViewGroup) findViewById(layoutID);
                    firstViewGroup.setVisibility(GONE);

                    //Compare checked answer with correct answers in the answers table.
                    if (firstRadio.isChecked() && AAnswerID == answers[counter - 1]) {
                        correctAnswers++;
                    }
                    if (secondRadio.isChecked() && BAnswerID == answers[counter - 1]) {
                        correctAnswers++;
                    }
                    if (thirdRadio.isChecked() && CAnswerID == answers[counter - 1]) {
                        correctAnswers++;
                    }
                    if (lastRadio.isChecked() && DAnswerID == answers[counter - 1]) {
                        correctAnswers++;
                    }
                    if (counter == 10) {                                        //If 10th question, go to results.
                        displayResults(correctAnswers);
                        return;
                    }
                }
                //Increse all ID's by 7, becouse each groupView has 7 different objects with ID's.
                layoutID += 7;
                countDText += 7;
                progressBarID += 7;
                AAnswerID += 7;
                BAnswerID += 7;
                CAnswerID += 7;
                DAnswerID += 7;
                ViewGroup nextViewGroup = (ViewGroup) findViewById(layoutID);
                nextViewGroup.setVisibility(View.VISIBLE);
                countTD.onTick(30000);
                mProgress.setProgress(30);
                countTD.start();


            }
        }.start();
    }

    public void confirmAnswer(View view) {
        firstRadio = (RadioButton) findViewById(AAnswerID);
        secondRadio = (RadioButton) findViewById(BAnswerID);
        thirdRadio = (RadioButton) findViewById(CAnswerID);
        lastRadio = (RadioButton) findViewById(DAnswerID);

        //If no answer is checked, than display Toast, and resume countdown.
        if (!firstRadio.isChecked() && !secondRadio.isChecked() && !thirdRadio.isChecked() &&
                !lastRadio.isChecked()) {
            Toast.makeText(getApplicationContext(), "Select an answer first.", Toast.LENGTH_SHORT).show();
            countTD.onTick(progressTimeLeft);
        }
        //If answer is checked, than stop countdown, and go to onFinish.
        else {
            countTD.cancel();
            countTD.onFinish();
        }
    }
    //Displays results.
    public void displayResults(int result) {
        TextView textView = (TextView) findViewById(R.id.results);
        textView.setVisibility(View.VISIBLE);
        textView.setText("Twój wynik to: \n" + result);
    }
}
