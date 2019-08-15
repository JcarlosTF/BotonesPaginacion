package com.example.btnpaginacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int noOfBtns;
    private Button[] btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Btnfooter();
            //loadList(0);
           CheckBtnBackGroud(0);
        }

        private void Btnfooter() {
            noOfBtns=10;

            LinearLayout ll = (LinearLayout) findViewById(R.id.btnLay);

            btns	=new Button[noOfBtns];

            for(int i=0;i<noOfBtns;i++) {
                btns[i]	=	new Button(this);
                btns[i].setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                btns[i].setText(""+(i+1));

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                ll.addView(btns[i], lp);

               /**/ final int j = i;
                btns[j].setOnClickListener(new View.OnClickListener() {
                    int ie=j+1;
                    public void onClick(View v) {
                        Log.e("numero ",""+ie);
                       CheckBtnBackGroud(j);
                    }
                });
            }

        }

        private void CheckBtnBackGroud(int index) {
            for(int i=0;i<noOfBtns;i++) {
                if(i==index) {
                    btns[index].setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }
                else {
                    btns[i].setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    btns[i].setTextColor(getResources().getColor(android.R.color.black));
                }
            }
        }


    }