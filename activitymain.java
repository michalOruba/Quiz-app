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
    private int progressBarID = R.id.first_progress_bar;
    private int AAnswerID = R.id.first_AAnswer;
    private int BAnswerID = R.id.first_BAnswer;
    private int CAnswerID = R.id.first_CAnswer;
    private int DAnswerID = R.id.first_DAnswer;
    private int counter = 0;
    private int[] answers = {R.id.first_CAnswer, R.id.second_BAnswer, R.id.third_DAnswer, R.id.fourth_BAnswer, R.id.fifth_BAnswer, R.id.sixth_CAnswer,
            R.id.seventh_DAnswer, R.id.eighth_CAnswer, R.id.ninth_BAnswer, R.id.tenth_AAnswer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTD = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {

                Log.v("Main activity", "Wchodzę do onTick");
                mProgress = (ProgressBar) findViewById(progressBarID);
                progressTimeLeft = (int) millisUntilFinished / 1000;
                mProgress.setProgress(progressTimeLeft);
                Log.v("Main activity", "Wychodzę do onTick" + progressTimeLeft);
            }

            public void onFinish() {
                counter++;

                RadioButton firstRadio = (RadioButton) findViewById(AAnswerID);
                RadioButton secondRadio = (RadioButton) findViewById(BAnswerID);
                RadioButton thirdRadio = (RadioButton) findViewById(CAnswerID);
                RadioButton lastRadio = (RadioButton) findViewById(DAnswerID);


                if (progressTimeLeft == 0 && !firstRadio.isChecked() && !secondRadio.isChecked() && !thirdRadio.isChecked() &&
                        !lastRadio.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Time run out. Go to next question.", Toast.LENGTH_SHORT).show();
                    ViewGroup firstViewGroup = (ViewGroup) findViewById(layoutID);
                    firstViewGroup.setVisibility(GONE);
                    if (counter == 10) {
                        displayResults(correctAnswers);
                        return;
                    }
                }
                else {
                    ViewGroup firstViewGroup = (ViewGroup) findViewById(layoutID);
                    firstViewGroup.setVisibility(GONE);

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
                    if (counter == 10) {
                        displayResults(correctAnswers);
                        return;
                    }
                    Toast.makeText(getApplicationContext(), "Go to next question.", Toast.LENGTH_SHORT).show();
                    layoutID += 6;
                    ViewGroup nextViewGroup = (ViewGroup) findViewById(layoutID);
                    nextViewGroup.setVisibility(View.VISIBLE);
                    progressBarID += 6;
                    AAnswerID += 6;
                    BAnswerID += 6;
                    CAnswerID += 6;
                    DAnswerID += 6;
                    countTD.onTick(30000);
                    mProgress.setProgress(30);
                    countTD.start();

                }
            }
        }.start();
    }

    public void confirmAnswer(View view) {
        RadioButton firstRadio = (RadioButton) findViewById(AAnswerID);
        RadioButton secondRadio = (RadioButton) findViewById(BAnswerID);
        RadioButton thirdRadio = (RadioButton) findViewById(CAnswerID);
        RadioButton lastRadio = (RadioButton) findViewById(DAnswerID);
        if (!firstRadio.isChecked() && !secondRadio.isChecked() && !thirdRadio.isChecked() &&
                !lastRadio.isChecked()) {
            Toast.makeText(getApplicationContext(), "Select an answer first.", Toast.LENGTH_SHORT).show();
            countTD.onTick(progressTimeLeft);
        } else {
            countTD.cancel();
            countTD.onFinish();
        }
    }

    public void displayResults(int result) {
        TextView textView = (TextView) findViewById(R.id.results);
        textView.setVisibility(View.VISIBLE);
        textView.setText("Twój wynik to: \n" + result);
    }
}
