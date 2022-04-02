package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup rGroup;
    RadioButton rdoDog,rdoCat,rdoRabbit;
    Button btnOk;
    ImageView imgPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진 보기");
        text1=(TextView) findViewById(R.id.textView);
        chkAgree=(CheckBox) findViewById(R.id.checkBox);
        text2=(TextView) findViewById(R.id.textView2);
        rGroup=(RadioGroup) findViewById(R.id.rGroup);
        rdoCat=(RadioButton) findViewById(R.id.rbCat);
        rdoDog=(RadioButton) findViewById(R.id.rbDog);
        rdoRabbit=(RadioButton) findViewById(R.id.rbRabbit);

        btnOk=(Button)findViewById(R.id.button);
        imgPet=(ImageView) findViewById(R.id.imageView);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(chkAgree.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch(rGroup.getCheckedRadioButtonId()){
                    case R.id.rbDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rbCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rbRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                        default:
                            Toast.makeText(getApplicationContext(),"동물을 먼저 선택하세요",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}