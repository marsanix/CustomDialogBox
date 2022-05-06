package com.example.customdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnWin, btnLose;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWin = findViewById(R.id.btnWin);
        btnLose = findViewById(R.id.btnLose);
        dialog = new Dialog(this);

        btnWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWinDialog();
            }
        });

        btnLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoseDialog();
            }
        });
    }

    private void openLoseDialog() {
    }

    private void openWinDialog() {
        dialog.setContentView(R.layout.win_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);
        Button btnOk = dialog.findViewById(R.id.btnOk);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(), "Thanks!", Toast.LENGTH_SHORT).show();
            }
        });
        
        dialog.show();

    }
}