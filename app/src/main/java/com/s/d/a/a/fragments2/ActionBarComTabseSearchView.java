package com.s.d.a.a.fragments2;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class ActionBarComTabseSearchView extends DebugActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento_api);
        Fragmento01 frag1 = new Fragmento01();
        Fragmento02 frag2 = new Fragmento02();
        Fragmento03 frag3 = new Fragmento03();
        Fragmento04 frag4 = new Fragmento04();
        Fragmento05 frag5 = new Fragmento05();

        // Adiciona os fragments
        FragmentManager gerenteFragmento = getFragmentManager();
        FragmentTransaction transacaoFragmento = gerenteFragmento.beginTransaction();
        transacaoFragmento.replace(R.id.layout1, frag1, "frag1");
        transacaoFragmento.replace(R.id.layout2, frag2, "frag2");
        transacaoFragmento.replace(R.id.layout3, frag3, "frag3");
        transacaoFragmento.commit();

        // Ativa a navegação por Tabs
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // Ativa o ícone "Home"
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Cria as Tabs
        ActionBar.Tab tab = actionBar.newTab();
        tab.setText("Frag 4");
        tab.setIcon(R.drawable.smile1);
        tab.setTabListener(new NavegacaoTabListener(frag4));
        actionBar.addTab(tab);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setIcon(R.drawable.smile2);
        tab2.setText("Frag 5");
        tab2.setTabListener(new NavegacaoTabListener(frag5));
        actionBar.addTab(tab2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pesquisa, menu);

        MenuItem item = menu.findItem(R.id.menu_busca);
        SearchView sv = new SearchView(this);
        sv.setOnQueryTextListener(new MenuListener(this));
        item.setActionView(sv);

        return true;
    }
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        // Clicou no menu
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(this, "Voltar para a página inicial",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu2:
                Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu3:
                Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onMenuItemSelected(featureId, item);
    }
    // Listener para quando clicar na Tab, trocar o fragmento
    private class NavegacaoTabListener implements ActionBar.TabListener {
        private Fragment frag;
        public NavegacaoTabListener(Fragment frag) {
            // Ao criar o listener para a Tab, indicamos qual o fragment que ela pertence
            this.frag = frag;
        }
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            // Adiciona o Fragment desta Tab
            ft.replace(R.id.layout1, frag, null);
        }
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            // Quando uma Tab perde o foco removemos ela
            ft.remove(frag);
        }
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        }
    }
    // Listener para as buscas do menu
    static class MenuListener implements SearchView.OnQueryTextListener {
        private Context context;
        public MenuListener(Context context) {
            this.context = context;
        }
        @Override
        public boolean onQueryTextChange(String textoParcial) {
            Log.i("conceito_fragmentos2","onQueryTextChange: " + textoParcial);
            return false;
        }
        @Override
        public boolean onQueryTextSubmit(String textoFinal) {
            Log.i("conceito_fragmentos2","onQueryTextSubmit: " + textoFinal);
            Toast.makeText(context, "Texto: " + textoFinal, Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
