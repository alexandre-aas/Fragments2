package com.s.d.a.a.fragments2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FragmentoAPI extends DebugActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento_api);

        FragmentManager fm = getFragmentManager();
        //Verifica se é a primeira vez que a activity está executando
        if (savedInstanceState == null) {
            Fragmento01 frag1 = new Fragmento01();
            Fragmento02 frag2 = new Fragmento02();
            Fragmento03 frag3 = new Fragmento03();

            //Adicinoa os fragmentos
            FragmentTransaction t = fm.beginTransaction();
            t.add(R.id.layout1, frag1, "fragmento01");
            t.add(R.id.layout2, frag2, "fragmento02");
            t.add(R.id.layout3, frag3, "fragmento03");
            t.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuItem menu1 = menu.add(0, 0, 0, "Remover/Adicionar Farg2");
        menu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        MenuItem menu2 = menu.add(0, 1, 1, "Trocar o Frag3 pelo Frag4");
        menu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item){
        FragmentManager fragManager = getFragmentManager();
        FragmentTransaction fragTransaction = fragManager.beginTransaction();
        switch (item.getItemId()){
            case 0:
                //Utiliza o método findFrgamentByTag
                Fragmento02 frag2 = (Fragmento02) fragManager.findFragmentByTag("fragmento02");
                if(frag2 != null){
                    //Se o fragmento já foi criado remove
                    fragTransaction.remove(frag2);
                }else {
                    //Senão, cria o fragmento dinamicamente via API
                    frag2 = new Fragmento02();
                    fragTransaction.add(R.id.layout2, frag2, "fragmento02");
                }
                fragTransaction.commit();
                break;
            case 1:
                //Usa "FragmentTransaction" com o "addToBackStack"
                Fragmento04 frag4 = new Fragmento04();
                fragTransaction.replace(R.id.layout3, frag4, "fragmento04");
                fragTransaction.addToBackStack("recarregar o fragmento03 no lugaro do fragmento04");
                fragTransaction.commit();
                break;
        }

        return true;
    }
}
