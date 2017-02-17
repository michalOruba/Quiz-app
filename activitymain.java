<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.android.quizapp.MainActivity">

    <LinearLayout
        android:id="@+id/first_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/first_question" />

        <ProgressBar
            android:id="@+id/first_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/first_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/first_a_answer" />

            <RadioButton
                android:id="@+id/first_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/first_b_answer" />

            <RadioButton
                android:id="@+id/first_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/first_c_answer" />

            <RadioButton
                android:id="@+id/first_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/first_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>


    <LinearLayout
        android:id="@+id/second_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/second_question" />

        <ProgressBar
            android:id="@+id/second_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/second_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/second_a_answer" />

            <RadioButton
                android:id="@+id/second_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/second_b_answer" />

            <RadioButton
                android:id="@+id/second_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/second_c_answer" />

            <RadioButton
                android:id="@+id/second_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/second_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/third_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/third_question" />

        <ProgressBar
            android:id="@+id/third_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/third_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/third_a_answer" />

            <RadioButton
                android:id="@+id/third_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/third_b_answer" />

            <RadioButton
                android:id="@+id/third_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/third_c_answer" />

            <RadioButton
                android:id="@+id/third_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/third_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>


    <LinearLayout
        android:id="@+id/fourth_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/fourth_question" />

        <ProgressBar
            android:id="@+id/fourth_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/fourth_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fourth_a_answer" />

            <RadioButton
                android:id="@+id/fourth_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fourth_b_answer" />

            <RadioButton
                android:id="@+id/fourth_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fourth_c_answer" />

            <RadioButton
                android:id="@+id/fourth_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fourth_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/fifth_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/fifth_question" />

        <ProgressBar
            android:id="@+id/fifth_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/fifth_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fifth_a_answer" />

            <RadioButton
                android:id="@+id/fifth_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fifth_b_answer" />

            <RadioButton
                android:id="@+id/fifth_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fifth_c_answer" />

            <RadioButton
                android:id="@+id/fifth_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/fifth_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/sixth_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/sixth_question" />

        <ProgressBar
            android:id="@+id/sixth_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/sixth_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/sixth_a_answer" />

            <RadioButton
                android:id="@+id/sixth_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/sixth_b_answer" />

            <RadioButton
                android:id="@+id/sixth_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/sixth_c_answer" />

            <RadioButton
                android:id="@+id/sixth_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/sixth_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/seventh_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/seventh_question" />

        <ProgressBar
            android:id="@+id/seventh_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/seventh_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/seventh_a_answer" />

            <RadioButton
                android:id="@+id/seventh_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/seventh_b_answer" />

            <RadioButton
                android:id="@+id/seventh_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/seventh_c_answer" />

            <RadioButton
                android:id="@+id/seventh_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/seventh_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/eighth_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/eighth_question" />

        <ProgressBar
            android:id="@+id/eighth_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/eighth_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/eighth_a_answer" />

            <RadioButton
                android:id="@+id/eighth_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/eighth_b_answer" />

            <RadioButton
                android:id="@+id/eighth_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/eighth_c_answer" />

            <RadioButton
                android:id="@+id/eighth_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/eighth_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/ninth_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/ninth_question" />

        <ProgressBar
            android:id="@+id/ninth_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/ninth_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/ninth_a_answer" />

            <RadioButton
                android:id="@+id/ninth_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/ninth_b_answer" />

            <RadioButton
                android:id="@+id/ninth_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/ninth_c_answer" />

            <RadioButton
                android:id="@+id/ninth_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/ninth_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/tenth_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center_vertical"
        android:orientation="vertical"
        android:visibility="visible">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:textSize="20sp"
            android:layout_gravity="center"
            android:text="@string/tenth_question" />

        <ProgressBar
            android:id="@+id/tenth_progress_bar"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:indeterminate="false"
            android:max="30"
            android:progress="0" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="6">

            <RadioButton
                android:id="@+id/tenth_AAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/tenth_a_answer" />

            <RadioButton
                android:id="@+id/tenth_BAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/tenth_b_answer" />

            <RadioButton
                android:id="@+id/tenth_CAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/tenth_c_answer" />

            <RadioButton
                android:id="@+id/tenth_DAnswer"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:textSize="16sp"
                android:padding="16sp"
                android:text="@string/tenth_d_answer" />
        </RadioGroup>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_gravity="center"
            android:onClick="confirmAnswer"
            android:text="@string/confirm" />
    </LinearLayout>

    <TextView
        android:id="@+id/results"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:visibility="gone" />
</LinearLayout>
