package com.example.hectorvera.myrestapp.Util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hectorvera.myrestapp.pojo.Album;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10/10/2016.
 */

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    public List<Album> albums = new ArrayList<Album>();
    Context context;
    public String URL_BASE = "https://jsonplaceholder.typicode.com/photos";
    TextView output;

    public AlbumAdapter(Context context, TextView output){
        this.context = context;
        this.output = output;
        requestAlbums();
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    public void requestAlbums(){

    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class AlbumViewHolder extends RecyclerView.ViewHolder{
        TextView idAlbum, title, url, image;
        public AlbumViewHolder(View itemView) {
            super(itemView);

        }
    }
}


