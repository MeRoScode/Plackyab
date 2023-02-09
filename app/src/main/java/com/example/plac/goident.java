package com.example.plac;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class goident {

    private AlertDialog alertDialog ;
    private Button button ;

    public interface OnClickLisiner{
        void onclick(AlertDialog alertDialog) ;
    }

    public goident(Context context){
        alertDialog = new AlertDialog.Builder(context).create() ;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.goident,null);
        interviews(view);
        alertDialog.setView(view);
        alertDialog.show();
    }

    private void interviews(View view) {
        button = view.findViewById(R.id.button);
    }

    public void setButton(final OnClickLisiner onClickLisiner){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClickLisiner != null) {
                    onClickLisiner.onclick(alertDialog);
                    return;
                }
            }

        });
    }

}
