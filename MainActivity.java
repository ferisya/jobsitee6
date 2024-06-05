package com.example.jobsite6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


<?xml version="1.0" encoding="utf-8"?>

<!--Linear Layout with the vertical orientation and center gravity-->
<LinearLayout
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:orientation="vertical"
            tools:context=".MainActivity">

    <!--Button whose background color depends on the
            selector and state of the button-->
    <Button
            android:id="@+id/button"
            android:layout_width="160dp"
            android:layout_height="110dp"
            android:backgroundTint="@color/button_background_color"
            android:text="Click Me"
            android:textColor="@color/button_text_color"
            android:textSize="24sp"
            android:textStyle="bold" />

    <!--Switch with default state as enabled-->
    <Switch
                android:id="@+id/buttonSwitch"
                android:layout_width="160dp"
                android:layout_height="80dp"
                android:checked="true"
                android:text="Enabled"
                android:textAlignment="center"
                android:textSize="24sp"
                android:textStyle="bold" />

</LinearLayout>
        });
    }
}