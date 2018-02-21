package com.example.vutahoanghiep.webuy.magasin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vutahoanghiep.webuy.R;

import java.util.ArrayList;
import java.util.List;

public class MagasinsActivity extends AppCompatActivity {

    ListView listViewMagasin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasins);

        List<Magasin> lisMagasin = getMagasin();
        listViewMagasin = (ListView) findViewById(R.id.listViewMagasin);
        listViewMagasin.setAdapter(new MagasinsAdapter(this,lisMagasin));

    }

    private List<Magasin> getMagasin() {
        List<Magasin> list = new ArrayList<>();
        Magasin Carrefour1 = new Magasin("carrefour","Carrefour","1 rue Moreau 45000 Orléans",10);
        Magasin Auchan1 = new Magasin("auchan","Auchan","1 place République 37000 Tours",5);
        Magasin Leclerc1 = new Magasin("leclerc","Leclerc","1 rue Grandmont 37000 Tours",20);
        list.add(Carrefour1);
        list.add(Auchan1);
        list.add(Leclerc1);
        return list;

    }
}
