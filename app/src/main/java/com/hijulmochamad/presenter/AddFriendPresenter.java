package com.hijulmochamad.presenter;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import com.hijulmochamad.MainActivity;
import com.hijulmochamad.R;
import com.hijulmochamad.model.Friend;
import com.hijulmochamad.model.User;
import com.hijulmochamad.view.LoginActivity;

import io.realm.Realm;
/*
        Nim   10116296
        Nama  Mochamad Hijul M
        Kelas IF-7
        Waktu 114/08/19
*/
public class AddFriendPresenter {
    public void btnAddClicked(Context context,
                              EditText inputNim,
                              EditText inputName,
                              EditText inputKelas,
                              EditText inputTlp,
                              EditText inputIg,
                              EditText inputEmail
    ){
        if(!(inputNim.getText().toString().equals("") ||
                inputName.getText().toString().trim().equals("") ||
                inputKelas.getText().toString().trim().equals("") ||
                inputTlp.getText().toString().trim().equals("") ||
                inputIg.getText().toString().trim().equals("") ||
                inputEmail.getText().toString().trim().equals("")
        )){        // Created by 10116296 Mochamad Hijul M
                Realm.init(context);
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                Number num = realm.where(Friend.class).max("id");
                int nextID;
                if(num == null) {
                    nextID = 1;
                } else {
                    nextID = num.intValue() + 1;
                }
                Friend friend = realm.createObject(Friend.class,nextID);
                friend.setNim(inputNim.getText().toString());
                friend.setNama(inputName.getText().toString());
                friend.setKelas(inputKelas.getText().toString());
                friend.setTelepon(inputTlp.getText().toString());
                friend.setInstagram(inputIg.getText().toString());
                friend.setEmail(inputEmail.getText().toString());
                realm.commitTransaction();
                Toast.makeText(context, "Berhasil menambah teman", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
        }else{
            Toast.makeText(context, "Form harus di isi", Toast.LENGTH_SHORT).show();
        }
    }
}
