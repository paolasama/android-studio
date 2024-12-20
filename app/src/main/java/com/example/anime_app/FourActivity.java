package com.example.anime_app;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);  // Asegúrate de usar el archivo correcto

        // Encuentra el VideoView por su ID
        VideoView videoView4 = findViewById(R.id.videoView4);  // Usar el ID correcto

        // URI del archivo de video en la carpeta raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dandan);

        // Configura el VideoView para reproducir el video
        videoView4.setVideoURI(videoUri);

        // Crea un MediaController para controlar el video
        MediaController mediaController = new MediaController(this);

        // Configura el MediaController para el VideoView
        mediaController.setAnchorView(videoView4);
        videoView4.setMediaController(mediaController);

        // Inicia la reproducción del video
        videoView4.start();
    }
}
