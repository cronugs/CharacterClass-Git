package se.jimiwindmills.shade.character;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    public class Character {

        String name;
        int hitPoints;
        int str;
        int dex;
        int con;
        int intel;
        int wis;
        int charis;

        public void setName(String n) {
            name = n;
        }

        public String getName() {
            return name;
        }

        public void setHp(int hp) {
            hitPoints = hp;
        }

        public int getHp() {
            return hitPoints;
        }

        public void setStr(int st) {
            str = st;
        }

        public int getStr() {
            return str;
        }

        public void setDex(int de) {
            dex = de;
        }

        public int getDex() {
            return dex;
        }

        public void setCon(int co) {
            con = co;
        }

        public int getCon() {
            return con;
        }

        public void setIntel(int in) {
            intel = in;
        }

        public int getIntel() {
            return intel;
        }

        public void setWis(int wi) {
            wis = wi;
        }

        public int getWis() {
            return wis;
        }

        public void setCharis(int ch) {
            charis = ch;
        }

        public int getCharis() {
            return charis;
        }

    }

    public void createCharacter(View view) {

        Character p1 = new Character();

        EditText p1Name = (EditText) findViewById(R.id.charNameEntered);
        EditText p1Str = (EditText) findViewById(R.id.chaStr);
        EditText p1Dex = (EditText) findViewById(R.id.chaDex);
        //EditText p1Con = (EditText) findViewById(R.id.chaCon);
        //EditText p1Int = (EditText) findViewById(R.id.chaInt);
        //EditText p1Wis = (EditText) findViewById(R.id.chaWis);
        //EditText p1Cha = (EditText) findViewById(R.id.chaCha);

        p1.setName(p1Name.getText().toString());
        p1.setStr(Integer.parseInt(p1Str.getText().toString()));
        p1.setDex(Integer.parseInt(p1Dex.getText().toString()));
        //p1.setCon(Integer.parseInt(p1Con.getText().toString()));
        //p1.setIntel(Integer.parseInt(p1Int.getText().toString()));
        //p1.setWis(Integer.parseInt(p1Wis.getText().toString()));
        //p1.setCharis(Integer.parseInt(p1Cha.getText().toString()));


        Toast.makeText(getApplicationContext(), "Your name is " + p1.getName().toString() + " and your strength is " + p1.getStr(), Toast.LENGTH_SHORT).show();
        //System.out.println("Here are your ability stats " + p1.getStr() + " Str" + p1.getDex() + " Dex");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
