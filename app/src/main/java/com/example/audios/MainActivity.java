package com.example.audios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer Reprocancion;

    ImageView portada;

    Button Pause, stop, can1, can2, can3, can4;

    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    portada = findViewById(R.id.Imagen_cancion);
    label = findViewById(R.id.Namecan);
    Pause = findViewById(R.id.Pausar);
    stop = findViewById(R.id.detener);
    can1 = findViewById(R.id.cancion1);
    can2 = findViewById(R.id.cancion2);
    can3 = findViewById(R.id.cancion3);
    can4 = findViewById(R.id.cancion4);

    //pausa
    Pause.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        if (Reprocancion.isPlaying()){
            Reprocancion.pause();
        }else {
            Reprocancion.start();
            }
        }
    });

    stop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Reprocancion.seekTo(000);
        Reprocancion.pause();
        }
    });



    can1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            label.setText("Mi corazon encantado");
            Picasso.get().load(R.drawable.dragonball).resize(250,250).centerCrop().into(portada);
            if (Reprocancion != null){
                if (Reprocancion.isPlaying()){
                    Reprocancion.release();
                    Reprocancion = null;
                }
            }
            Reprocancion = MediaPlayer.create(MainActivity.this,R.raw.cancion1);
            Reprocancion.start();
        }
    });


    can2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            label.setText("Kawaki wo Ameku");
            Picasso.get().load(R.drawable.kanojodosmetic).resize(250,250).centerCrop().into(portada);
            if (Reprocancion != null) {
                if (Reprocancion.isPlaying()) {
                    Reprocancion.release();
                    Reprocancion = null;
                }
            }
            Reprocancion = MediaPlayer.create(MainActivity.this,R.raw.cancion2);
            Reprocancion.start();


        }
    });


        can3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("WEAVER");
                Picasso.get().load(R.drawable.yamada7majo).resize(250,250).centerCrop().into(portada);
                if (Reprocancion != null) {
                    if (Reprocancion.isPlaying()) {
                        Reprocancion.release();
                        Reprocancion = null;
                    }
                }
                Reprocancion = MediaPlayer.create(MainActivity.this,R.raw.cancion3);
                Reprocancion.start();


            }
        });

        can4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("This Game");
                Picasso.get().load(R.drawable.nogamenolife).resize(250,250).centerCrop().into(portada);
                if (Reprocancion != null) {
                    if (Reprocancion.isPlaying()) {
                        Reprocancion.release();
                        Reprocancion = null;
                    }
                }
                Reprocancion = MediaPlayer.create(MainActivity.this,R.raw.cancion4);
                Reprocancion.start();


            }
        });


    }
}

