package com.hijulmochamad.view;
/*
        Nim   10116296
        Nama  Mochamad Hijul M
        Kelas IF-7
        Waktu 14/08/19
*/
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hijulmochamad.R;

public class ContactFragment extends Fragment {
    Button btnTlp,btnEmail,btnIg,btnTwitter,btnGit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact,container,false);
        btnTlp = (Button) view.findViewById(R.id.btnTlp);
        btnEmail = (Button) view.findViewById(R.id.btnEmail);
        btnIg = (Button) view.findViewById(R.id.btnIstagram);
        btnTwitter = (Button) view.findViewById(R.id.btn_twitter);
        btnGit = (Button) view.findViewById(R.id.btn_github);

        btnTlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "tel:089525692775";
                Intent teleponPribadi = new Intent(Intent.ACTION_DIAL);
                teleponPribadi.setData(Uri.parse(uri));
                startActivity(teleponPribadi);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"hijul1998@gmail.com"});
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Welcome to hijul app");
                sendEmail.setType("message/rfc822");
                startActivity(sendEmail);
            }
        });

        btnIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://instagram.com/hijulmochamad";
                Intent bukaIg = new Intent(Intent.ACTION_VIEW);
                bukaIg.setData(Uri.parse(url));
                startActivity(bukaIg);

            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://twitter.com/hijulmochamad";
                Intent bukaTwitter = new Intent(Intent.ACTION_VIEW);
                bukaTwitter.setData(Uri.parse(url));
                startActivity(bukaTwitter);
            }
        });

        btnGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/mochijul";
                Intent bukaGit = new Intent(Intent.ACTION_VIEW);
                bukaGit.setData(Uri.parse(url));
                startActivity(bukaGit);
            }
        });
        return view;




    }
}
