package com.example.dell.besecure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by DELL on 11/07/2017.
 */
public class decrypt extends Activity {
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decrypt);
        e1=(EditText)findViewById(R.id.et2);
        b1=(Button)findViewById(R.id.blogin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                if(e1.getText().toString().length()==0)
                {
                    Toast.makeText(decrypt.this,"Enter the Password",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(decrypt.this,decrypt.class);
                    startActivity(intent);
                }
                else if(s1.equals("1030"))
                {
                    Intent intent=new Intent(decrypt.this,MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(decrypt.this,"Are you sneaking?",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(decrypt.this,decrypt.class);
                    startActivity(intent);
                }
            }
        });
    }
}
