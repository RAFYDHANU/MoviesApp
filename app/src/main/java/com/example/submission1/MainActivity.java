package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Film> list = new ArrayList<>();

    private static String[] UniversityName = {

            "A Star Is Born",
            "Aquaman",
            "Avangers:Infinity War",
            "Bird Box",

            "bohemian Rhapsody",

            "Bumblebee",
            "CREED II",
            "DEADPOOL",
            "Dragon",
            "DRAGONBALL",


    };


    private static String[] UniversityDetail = {
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.\n" +
                    "\n" +
                    "Featured Crew\n" +
                    "Bradley Cooper\n" +
                    "\n" +
                    "Director, Screenplay\n" +
                    "\n" +
                    "Will Fetters\n" +
                    "\n" +
                    "Screenplay\n" +
                    "\n" +
                    "Eric Roth\n" +
                    "\n" +
                    "Screenplay\n" +
                    "\n" +
                    "William A. Wellman\n" +
                    "\n" +
                    "Story\n" +
                    "\n" +
                    "Robert Carson\n" +
                    "\n" +
                    "Story",


            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people…",

            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",

            "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",

            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics",

            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred",

            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",

            "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's.",

            "An extraordinary discovery inspires two human princes and an elven assassin to team up on an epic quest to bring peace to their warring lands.",

            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",

    };


    private static int[] UniversityImage = {
            R.drawable.poster_a_star,
            R.drawable.poster_aquaman,
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_birdbox,
            R.drawable.poster_bohemian,
            R.drawable.poster_bumblebee,
            R.drawable.poster_creed,
            R.drawable.poster_deadpool,
            R.drawable.poster_dragon,
            R.drawable.poster_dragonball,
    };

    static ArrayList<Film> getListData() {
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position < UniversityName.length; position++) {
            Film Nama = new Film();
            Nama.setName(UniversityName[position]);
            Nama.setDetail(UniversityDetail[position]);
            Nama.setPhoto(UniversityImage[position]);
            list.add(Nama);
        }
        return list;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.rv_heroes);

        CustomListAdapter adapter = new CustomListAdapter(
                this, UniversityName, UniversityDetail,UniversityImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int ii, long l) {
                Intent intent = new Intent(MainActivity.this, Detail_Activity.class);
                intent.putExtra("film",getListData().get(ii));
                startActivity(intent);

            }



        });


    }
}

