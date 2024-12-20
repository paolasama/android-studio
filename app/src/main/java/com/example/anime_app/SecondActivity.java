package com.example.anime_app;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);  // Asegúrate de usar el archivo correcto

        // Encuentra el VideoView por su ID
        videoView = findViewById(R.id.videoView1);

        // URI del archivo de video en la carpeta raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dragonb);

        // Configura el VideoView para reproducir el video
        videoView.setVideoURI(videoUri);

        // Crea un MediaController para controlar el video
        MediaController mediaController = new MediaController(this);

        // Configura el MediaController para el VideoView
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Inicia la reproducción del video
        videoView.start();
    }
}