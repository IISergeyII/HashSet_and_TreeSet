package com.s.samsungitschool.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button addBt, showBt;
    TextView hashSetTV, treeSetTV;

    HashSet<String> hashSet = new HashSet<>();
    TreeSet<String> treeSet = new TreeSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edit_text);
        addBt = (Button) findViewById(R.id.add_bt);
        showBt = (Button) findViewById(R.id.show_bt);
        hashSetTV = (TextView) findViewById(R.id.hash_set_tv);
        treeSetTV = (TextView) findViewById(R.id.tree_set_tv);

        addBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hashSet.add( editText.getText().toString() );
                treeSet.add( editText.getText().toString() );
                editText.setText("");
            }
        });

        showBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (String bfr : hashSet) {
                    hashSetTV.append(bfr + "\n");
                }
                for (String bfr : treeSet) {
                    treeSetTV.append(bfr + "\n");
                }
            }
        });
    }
}
