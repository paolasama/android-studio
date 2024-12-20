package com.example.anime_app;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);  // Asegúrate de usar el archivo de layout correcto

        // Encuentra el VideoView por su ID
        VideoView videoView2 = findViewById(R.id.videoView2);  // Usar la variable correcta

        // URI del archivo de video en la carpeta raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ranma);

        // Configura el VideoView para reproducir el video
        videoView2.setVideoURI(videoUri);

        // Crea un MediaController para controlar el video
        MediaController mediaController = new MediaController(this);

        // Configura el MediaController para el VideoView
        mediaController.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController);

        // Inicia la reproducción del video
        videoView2.start();
    }
}

