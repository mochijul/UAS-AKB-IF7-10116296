package com.hijulmochamad.view;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hijulmochamad.R;
/*
        Nim   10116296
        Nama  Mochamad Hijul M
        Kelas IF-7
        Waktu 14/08/19
*/
public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
//        Typeface customfont= Typeface.createFromAsset(getContext().getAssets(),"font/StardustAdventure.ttf");
//        TextView myname=(TextView) view.findViewById(R.id.myname);
//        myname.setTypeface(customfont);

        return view;

    }
}
