package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Detail_Activity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Film> list = new ArrayList<>();

    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);

        txtName = findViewById(R.id.Judul);
        Film film = getIntent().getParcelableExtra("film");
        txtName.setText(film.getName());

        txtDetail = findViewById(R.id.penjelasan);
        txtDetail.setText(film.getDetail());

        imgView = findViewById(R.id.Gambar);
        imgView.setImageResource(film.getPhoto());


    }
}