package com.example.dell.besecure;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by DELL on 11/07/2017.
 */
public class encrypt extends Activity {
    Button b1,b2,b3;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt);
        b1=(Button)findViewById(R.id.bok);
        b2=(Button)findViewById(R.id.bclear);
        b3=(Button)findViewById(R.id.bsend);
        e1=(EditText)findViewById(R.id.edt1);
        SmsManager sms=SmsManager.getDefault();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()==0)
                {
                    Toast.makeText(encrypt.this,"Enter some text",Toast.LENGTH_SHORT).show();
                }
                else {
                    char l;
                    int k = 0, m = 0;
                    String s1 = e1.getText().toString();
                    e1.setText(" ");
                    //String s2="";
                    //char[] array = new char[26];
                    for (int i = 0; i < s1.length(); i++) {
                        l = s1.charAt(i);
                        if (l >= 'a' && l <= 'f') {
                            k = (l + 20);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else if (l >= 'u' && l <= 'z') {
                            k = (l - 20);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                            }
                        else if (l >= 'g' && l <= 'm') {
                            k = (l + 7);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else if (l >= 'n' && l <= 't') {
                            k = (l - 7);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else if (l >= 'A' && l <= 'F') {
                            k = (l + 20);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else if (l >= 'U' && l <= 'Z') {
                            k = (l - 20);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else if (l >= 'G' && l <= 'M') {
                            k = (l + 7);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else if (l >= 'N' && l <= 'T') {
                            k = (l - 7);
                            e1.setText(e1.getText().toString()+(char) k+"");
                            //s2=s2.concat(s2);
                        }
                        else{
                            e1.setText(e1.getText().toString()+l+"");
                            //s2=s2.concat(s2);
                        }
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, e1.getText().toString());
                sendIntent.setType("text/plain");

                // Do not forget to add this to open whatsApp App specifically
                sendIntent.setPackage("com.whatsapp");
                startActivity(sendIntent);

            }
        });
    }
    }
