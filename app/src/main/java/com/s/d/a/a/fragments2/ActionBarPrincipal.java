package com.s.d.a.a.fragments2;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarPrincipal extends DebugActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento_api);
        Fragmento01 frag1 = new Fragmento01();
        Fragmento02 frag2 = new Fragmento02();
        Fragmento03 frag3 = new Fragmento03();

        // Adiciona os fragments
        FragmentManager gerenteFragmento = getFragmentManager();
        FragmentTransaction transacaoFragmento = gerenteFragmento.beginTransaction();
        transacaoFragmento.replace(R.id.layout1, frag1, "fragmento01");
        transacaoFragmento.replace(R.id.layout2, frag2, "fragmento02");
        transacaoFragmento.replace(R.id.layout3, frag3, "fragmento03");
        transacaoFragmento.commit();

        // Ativa o ícone "Home"
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        // Clicou no menu
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(this, "Voltar para a página inicial",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu1:
                Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
