package com.example.plac;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.plac.View.Textveiev;

import java.util.ArrayList;

public class Adapter_Placks extends RecyclerView.Adapter<Adapter_Placks.ViewHolder>{


    private final Context context;
    private final ArrayList<String> list;

    public Adapter_Placks(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public Adapter_Placks.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.placks_item_list, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Placks.ViewHolder viewHolder, int position) {
        String text = list.get(position);

        viewHolder.txt_view.setText(text);
        if (text.equals("هیچ شهری پیدا نشد")){
            viewHolder.txt_view.setTextColor(Color.parseColor("#FF0000"));

        }
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        Textveiev txt_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_view=itemView.findViewById(R.id.txt_view);
            startanim(txt_view, R.anim.in_from_right);

        }
    }

    private void startanim(View view, int animid) {
        Animation animation = AnimationUtils.loadAnimation(context, animid);
        view.startAnimation(animation);
    }
}