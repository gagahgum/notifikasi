package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosomething(View view) {
        NotificationManagerCompat myManager = NotificationManagerCompat.from(this);
        NotificationCompat.Builder myNotif = new NotificationCompat.Builder(this);

        myNotif.setContentTitle("Pesan Baru Masuk");
        myNotif.setContentText("Hai Buka Aku Dong...");
        myNotif.setSmallIcon(android.R.drawable.ic_btn_speak_now);
        myNotif.setSmallIcon(R.drawable.ic_launcher_background);
        myNotif.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),R.drawable.kucing));

        Intent il = new Intent(this, MainActivity.class);
        PendingIntent pd = PendingIntent.getActivity(this, 1,il,0);

        myNotif.setContentIntent(pd);
        myNotif.setAutoCancel(true);
        myManager.notify(1,myNotif.build());


        finish();
    }
}
