package com.lost.pokemonprojects;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lost.pokemonprojects.databinding.WordListItemBinding;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private List<String> mWordList;
    private WordListItemBinding binding;

    public WordListAdapter(Context context, List<String> mWordList) {
        this.mWordList = mWordList;

    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        binding = WordListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);


        return new WordViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

        if (position == 1) {
            binding.descripcion.setText("Este es un pokemon de hierba");
            binding.wordItemTv.setText("BULBASOUR");
            binding.ivPokemon.setImageDrawable(binding.getRoot().getContext().getDrawable(R.drawable.bulbasour));
        }
        if (position == 2) {
            binding.wordItemTv.setText("SQUIRTLE");
            binding.descripcion.setText("Este es un pokemon de agua");
            binding.ivPokemon.setImageDrawable(binding.getRoot().getContext().getDrawable(R.drawable.squirtle));
        }
        if (position == 3) {
            binding.wordItemTv.setText("CHIKORITA");
            binding.descripcion.setText("Este es un pokemon de hierba");
            binding.ivPokemon.setImageDrawable(binding.getRoot().getContext().getDrawable(R.drawable.chikorita));
        }
        if (position == 4) {
            binding.wordItemTv.setText("PIKACHU");
            binding.descripcion.setText("Este es un pokemon electrico");
            binding.ivPokemon.setImageDrawable(binding.getRoot().getContext().getDrawable(R.drawable.pikachu));
        }

        binding.ivPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (holder.getAdapterPosition() == 0) {
                    Toast.makeText(binding.ivPokemon.getContext(), holder.wordItemTv.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (holder.getAdapterPosition() == 1) {
                    Toast.makeText(binding.ivPokemon.getContext(), holder.wordItemTv.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (holder.getAdapterPosition() ==2 ){
                    Toast.makeText(binding.ivPokemon.getContext(), holder.wordItemTv.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (holder.getAdapterPosition() ==3 ){
                    Toast.makeText(binding.ivPokemon.getContext(), holder.wordItemTv.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (holder.getAdapterPosition() ==4 ){
                    Toast.makeText(binding.ivPokemon.getContext(), holder.wordItemTv.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }


    public class WordViewHolder extends RecyclerView.ViewHolder {

        public TextView wordItemTv;
        public ImageView ivPokemon;
        public TextView tvDescripcion;

        public WordViewHolder(@NonNull WordListItemBinding binding) {
            super(binding.getRoot());

            wordItemTv = binding.wordItemTv;
            ivPokemon = binding.ivPokemon;
            tvDescripcion = binding.descripcion;
        }

    }


}
