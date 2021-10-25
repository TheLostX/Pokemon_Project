package com.lost.pokemonprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.lost.pokemonprojects.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<String> mWordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        wordListAutoGenerate();
        setupRecyclerView();

    }

    private void setupRecyclerView(){
        WordListAdapter adapter = new WordListAdapter(this, mWordList );
        binding.rvPokemon.setAdapter(adapter);
        binding.rvPokemon.setLayoutManager(new LinearLayoutManager(this));
        binding.rvPokemon.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    private List<String> wordListAutoGenerate() {

        mWordList = new ArrayList<>();

        mWordList.add("CHARMANDER");
        mWordList.add("BULBASOUR");
        mWordList.add("SQUIRTLE");
        mWordList.add("CHIKORITA");
        mWordList.add("PIKACHU");

        return mWordList;
    }


}