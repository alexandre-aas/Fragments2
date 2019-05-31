package com.s.d.a.a.fragments2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragmentos extends ListActivity {

    private static final String[] opcoes = new String[] { "Activity normal","Fragmentos XML",
            "Fragmentos API", "Fragmentos XML/API", "Sair" };
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        int layout = android.R.layout.simple_list_item_1;
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, layout,opcoes);
        this.setListAdapter(adaptador);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, FragmentoPrincipal.class));
                break;
            case 2:
                startActivity(new Intent(this, FragmentoAPI.class));
                break;
            case 3:
                startActivity(new Intent(this, ActionBarPrincipal.class));
                break;
            default:
                finish();
        }
    }
}
