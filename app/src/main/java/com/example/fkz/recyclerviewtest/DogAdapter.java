package com.example.fkz.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fkz on 2017/1/18.
 */

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.ViewHolder>{

    private List<Dog> mdogList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView dogimg;
        TextView dogname;

        public ViewHolder(View view){
            super(view);
            dogimg= (ImageView) view.findViewById(R.id.dog_img);
            dogname= (TextView) view.findViewById(R.id.dog_name);
        }
    }

    public DogAdapter(List<Dog> dogList){
        mdogList=dogList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog=mdogList.get(position);
        holder.dogimg.setImageResource(dog.getDogImg());
        holder.dogname.setText(dog.getDogName());

    }

    @Override
    public int getItemCount() {
        return mdogList.size();
    }
}
