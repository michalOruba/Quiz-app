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
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;
import static android.view.View.GONE;

@SuppressWarnings("WrongConstant")
public class MainActivity extends AppCompatActivity {

    static final String STATE_PROGRESSSTATUS = "firstProgressBar";
    static final String STATE_PROGRESSTIMELEFT = "progressStatus";
    static final String STATE_CORRECTANSWERS = "correctAnswers";
    static final String STATE_LAYOUTID = "layoutID";
    static final String STATE_COUNTDTEXTID = "countDTextID";
    static final String STATE_PROGRESSBARID = "progressBarID";
    static final String STATE_AANSWERID = "AAnswerID";
    static final String STATE_BANSWERID = "BAnswerID";
    static final String STATE_CANSWERID = "CAnswerID";
    static final String STATE_DANSWERID = "DAnswerID";
    static final String STATE_COUNTER = "counter";
    static final String STATE_MILISLEFT = "milisLeft";
    static final String STATE_FIRSTLAYOUT = "firstLayout";
    static final String STATE_SECONDLAYOUT = "secondLayout";
    static final String STATE_THIRDLAYOUT = "thirdLayout";
    static final String STATE_FOURTHLAYOUT = "fourthLayout";
    static final String STATE_FIFTHLAYOUT = "fifthLayout";
    static final String STATE_SIXTHLAYOUT = "sixthLayout";
    static final String STATE_SEVENTHLAYOUT = "seventhLayout";
    static final String STATE_EIGHTLAYOUT = "eighthLayout";
    static final String STATE_NINTHLAYOUT = "ninthLayout";
    static final String STATE_TENTHLAYOUT = "tenthLayout";

    private ProgressBar mProgress;
    private CountDownTimer countTD;
    private int progressTimeLeft;
    private long milisLeft;
    private int correctAnswers = 0;
    private int layoutID = R.id.first_layout;
    private int countDTextID = R.id.firstCountDTextView;
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
    private ViewGroup firstLayout;
    private ViewGroup secondLayout;
    private ViewGroup thirdLayout;
    private ViewGroup fourthLayout;
    private ViewGroup fifthLayout;
    private ViewGroup sixthLayout;
    private ViewGroup seventhLayout;
    private ViewGroup eighthLayout;
    private ViewGroup ninthLayout;
    private ViewGroup tenthLayout;
    private ProgressBar firstProgressBar;

    public void onSaveInstanceState(Bundle savedInstanceState) {
        firstLayout = (ViewGroup) findViewById(R.id.first_layout);
        secondLayout = (ViewGroup) findViewById(R.id.second_layout);
        thirdLayout = (ViewGroup) findViewById(R.id.third_layout);
        fourthLayout = (ViewGroup) findViewById(R.id.fourth_layout);
        fifthLayout = (ViewGroup) findViewById(R.id.fifth_layout);
        sixthLayout = (ViewGroup) findViewById(R.id.sixth_layout);
        seventhLayout = (ViewGroup) findViewById(R.id.seventh_layout);
        eighthLayout = (ViewGroup) findViewById(R.id.eighth_layout);
        ninthLayout = (ViewGroup) findViewById(R.id.ninth_layout);
        tenthLayout = (ViewGroup) findViewById(R.id.tenth_layout);

        firstProgressBar = (ProgressBar) findViewById(R.id.first_progress_bar);
        savedInstanceState.putInt(STATE_PROGRESSSTATUS, firstProgressBar.getProgress());

        savedInstanceState.putInt(STATE_PROGRESSTIMELEFT, progressTimeLeft);
        savedInstanceState.putInt(STATE_CORRECTANSWERS, correctAnswers);
        savedInstanceState.putInt(STATE_LAYOUTID, layoutID);
        savedInstanceState.putInt(STATE_COUNTDTEXTID, countDTextID);
        savedInstanceState.putInt(STATE_PROGRESSBARID, progressBarID);
        savedInstanceState.putInt(STATE_AANSWERID, AAnswerID);
        savedInstanceState.putInt(STATE_BANSWERID, BAnswerID);
        savedInstanceState.putInt(STATE_CANSWERID, CAnswerID);
        savedInstanceState.putInt(STATE_DANSWERID, DAnswerID);
        savedInstanceState.putInt(STATE_COUNTER, counter);
        savedInstanceState.putLong(STATE_MILISLEFT, milisLeft);

        savedInstanceState.putInt(STATE_FIRSTLAYOUT, firstLayout.getVisibility());
        savedInstanceState.putInt(STATE_SECONDLAYOUT, secondLayout.getVisibility());
        savedInstanceState.putInt(STATE_THIRDLAYOUT, thirdLayout.getVisibility());
        savedInstanceState.putInt(STATE_FOURTHLAYOUT, fourthLayout.getVisibility());
        savedInstanceState.putInt(STATE_FIFTHLAYOUT, fifthLayout.getVisibility());
        savedInstanceState.putInt(STATE_SIXTHLAYOUT, sixthLayout.getVisibility());
        savedInstanceState.putInt(STATE_SEVENTHLAYOUT, seventhLayout.getVisibility());
        savedInstanceState.putInt(STATE_EIGHTLAYOUT, eighthLayout.getVisibility());
        savedInstanceState.putInt(STATE_NINTHLAYOUT, ninthLayout.getVisibility());
        savedInstanceState.putInt(STATE_TENTHLAYOUT, tenthLayout.getVisibility());

        timerPause();
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {

        firstLayout = (ViewGroup) findViewById(R.id.first_layout);
        secondLayout = (ViewGroup) findViewById(R.id.second_layout);
        thirdLayout = (ViewGroup) findViewById(R.id.third_layout);
        fourthLayout = (ViewGroup) findViewById(R.id.fourth_layout);
        fifthLayout = (ViewGroup) findViewById(R.id.fifth_layout);
        sixthLayout = (ViewGroup) findViewById(R.id.sixth_layout);
        seventhLayout = (ViewGroup) findViewById(R.id.seventh_layout);
        eighthLayout = (ViewGroup) findViewById(R.id.eighth_layout);
        ninthLayout = (ViewGroup) findViewById(R.id.ninth_layout);
        tenthLayout = (ViewGroup) findViewById(R.id.tenth_layout);

        firstProgressBar = (ProgressBar) findViewById(R.id.first_progress_bar);
        firstProgressBar.setProgress(savedInstanceState.getInt(STATE_PROGRESSSTATUS));

        progressTimeLeft = savedInstanceState.getInt(STATE_PROGRESSTIMELEFT);
        correctAnswers = savedInstanceState.getInt(STATE_CORRECTANSWERS);
        layoutID = savedInstanceState.getInt(STATE_LAYOUTID);
        countDTextID = savedInstanceState.getInt(STATE_COUNTDTEXTID);
        progressBarID = savedInstanceState.getInt(STATE_PROGRESSBARID);
        AAnswerID = savedInstanceState.getInt(STATE_AANSWERID);
        BAnswerID = savedInstanceState.getInt(STATE_BANSWERID);
        CAnswerID = savedInstanceState.getInt(STATE_CANSWERID);
        DAnswerID = savedInstanceState.getInt(STATE_DANSWERID);
        counter = savedInstanceState.getInt(STATE_COUNTER);
        milisLeft = savedInstanceState.getLong(STATE_MILISLEFT);

        firstLayout.setVisibility(savedInstanceState.getInt(STATE_FIRSTLAYOUT));
        secondLayout.setVisibility(savedInstanceState.getInt(STATE_SECONDLAYOUT));
        thirdLayout.setVisibility(savedInstanceState.getInt(STATE_THIRDLAYOUT));
        fourthLayout.setVisibility(savedInstanceState.getInt(STATE_FOURTHLAYOUT));
        fifthLayout.setVisibility(savedInstanceState.getInt(STATE_FIFTHLAYOUT));
        sixthLayout.setVisibility(savedInstanceState.getInt(STATE_SIXTHLAYOUT));
        seventhLayout.setVisibility(savedInstanceState.getInt(STATE_SEVENTHLAYOUT));
        eighthLayout.setVisibility(savedInstanceState.getInt(STATE_EIGHTLAYOUT));
        ninthLayout.setVisibility(savedInstanceState.getInt(STATE_NINTHLAYOUT));
        tenthLayout.setVisibility(savedInstanceState.getInt(STATE_TENTHLAYOUT));

        timerPause();                   //Cancels onCreate timerStart()
        timerResume();                  //Restores saved countdown
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerStart(30000);                                                      //countDown initialization
    }


    public void timerStart(long milisCountDown) {
        //CountDownTimer set to 30 sec, intersec 10ms to make progress bar look smoother.
        countTD = new CountDownTimer(milisCountDown, 10) {
            public void onTick(long millisUntilFinished) {
                mProgress = (ProgressBar) findViewById(progressBarID);
                milisLeft = millisUntilFinished;
                progressTimeLeft = (int) millisUntilFinished / 1000;            //1 sec
                mProgress.setProgress((int) millisUntilFinished / 10);          //0,01sec
                TextView countDTextView = (TextView) findViewById(countDTextID);  //Display time left in textView
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
                    //Set current viewGroup to be gone.
                    firstViewGroup = (ViewGroup) findViewById(layoutID);
                    firstViewGroup.setVisibility(GONE);
                    if (counter == 10) {                                        //If 10th question, go to results.
                        displayResults(correctAnswers);
                        return;
                    }
                    Toast.makeText(getApplicationContext(), "Time run out. Next question.", Toast.LENGTH_SHORT).show();
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
                countDTextID += 7;
                progressBarID += 7;
                AAnswerID += 7;
                BAnswerID += 7;
                CAnswerID += 7;
                DAnswerID += 7;
                ViewGroup nextViewGroup = (ViewGroup) findViewById(layoutID);
                nextViewGroup.setVisibility(View.VISIBLE);
                timerStart(30000);
                mProgress.setProgress(30);
            }
        }.start();
    }

    //Pause countDownTimer
    public void timerPause() {
        countTD.cancel();
    }
    //Start countDownTimer with saved time left
    private void timerResume() {
        timerStart(milisLeft);
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
        ImageView imageView = (ImageView) findViewById(R.id.intel_logo);
        imageView.setVisibility(View.VISIBLE);
    }
}
