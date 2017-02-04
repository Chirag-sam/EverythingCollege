package com.example.hp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class topHundredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_hundred);
        setTitle("Top 25");

         final ArrayList<topHundred> top100 = new ArrayList<topHundred>();
        top100.add(new topHundred(1, "IIT Kanpur","Kanpur"));
        top100.add(new topHundred(2,"Indian Institute of Science","Bangalore"));
        top100.add(new topHundred(3,"Jawaharlal Nehru University","Delhi"));
        top100.add(new topHundred(4,"University of Hyderabad","Hyderabad"));
        top100.add(new topHundred(5,"Delhi University","Delhi"));
        top100.add(new topHundred(6,"Anna University","Tamil Nadu"));
        top100.add(new topHundred(7,"Indian institue of Technology","Hyderabad"));
        top100.add(new topHundred(8,"Indian institue of Technology","Gandhinagar"));
        top100.add(new topHundred(9,"Indian institue of Technology","Ropar"));
        top100.add(new topHundred(10,"Indian institue of Technology","Patna"));
        top100.add(new topHundred(11,"National Institute of Technology","Trichy"));
        top100.add(new topHundred(12,"SRM University","Chennai"));
        top100.add(new topHundred(13,"VIT","Vellore"));
        top100.add(new topHundred(14,"Indian institute of Technology","Varanasi"));
        top100.add(new topHundred(15,"Sardar Vallabhai Patel National Institue of Technology ","Surat"));
        top100.add(new topHundred(16,"PSG college of Technology","Coimbatore"));
        top100.add(new topHundred(17,"National institue of Technology","Karnataka"));
        top100.add(new topHundred(18,"Birla institute of Technology","Palani"));
        top100.add(new topHundred(19,"Birla institute of Technology","Ranchi"));
        top100.add(new topHundred(20,"National Institute of Technology  ","Calicut"));
        top100.add(new topHundred(21,"R.E college of Engineering","Bangalore"));
        top100.add(new topHundred(22,"Motilal Nehru Institute of Technology","Allahabad"));
        top100.add(new topHundred(23,"Delhi University","Delhi"));
        top100.add(new topHundred(24,"Manipal University","Manipal"));
        top100.add(new topHundred(25,"Amrita University","Coimbatore"));
        topHundreduniversitiesAdapter Adapter = new topHundreduniversitiesAdapter(this,top100);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}