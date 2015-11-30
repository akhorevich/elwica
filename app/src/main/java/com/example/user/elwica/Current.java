package com.example.user.elwica;

import android.widget.Spinner;

import java.util.List;

public class Current {
    int cur;
    float cond;

    int sec;

    public int Intensity( int pow, int vol, int coef ) {
        cur = pow / (vol * coef);
        return cur;//сила тока
    }

    public float Conductor( int cur ) {
        cond = cur * 1.5f;
        return cond;//Автоматический выключатель
    }

    public int Section( Spinner spinner,int Array[][] ) {
        for (int i = 0; i < Array[0].length; i++) {
            if (cur >= Array[spinner.getSelectedItemPosition()][i] && cur < Array[spinner.getSelectedItemPosition()][i]-1){
                sec = Array[spinner.getSelectedItemPosition()][i+1];
            }
        }
        return sec;//сечение
    }
}

