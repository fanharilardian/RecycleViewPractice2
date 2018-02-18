package android.example.com.recyclerviewdemo2;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] F_name, D_name;
    int[] Img_res = {
            R.drawable.alonggods,
            R.drawable.beautyandthebeast,
            R.drawable.blackpanther,
            R.drawable.chrisye,
            R.drawable.dilan1990,
            R.drawable.hangout,
            R.drawable.ldr,
            R.drawable.leap,
            R.drawable.rafathar,
            R.drawable.satriaheroes,
            R.drawable.suratcintauntukstarla,
            R.drawable.surausilek,
            R.drawable.transformers,
            R.drawable.xmendaysoffuturepast2014,
    };

    ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        F_name = getResources().getStringArray(R.array.filim_names);
        D_name = getResources().getStringArray(R.array.director_names);
        int i = 0;
        for (String name : F_name) {
            Dataprovider dataprovider = new Dataprovider(Img_res[i], name, D_name[i]);
            arrayList.add(dataprovider);
            i++;
        }

        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
