package com.s.d.a.a.fragments2;

//import android.app.Activity;
import android.app.ActionBar;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;

//public class FragmentoPrincipal extends Activity {
public class FragmentoPrincipal extends DebugActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento_principal);

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuItem m1 = menu.add(0, 0, 0, "Alterar Texto do Fragmento02.");
        m1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        FragmentManager fm = getFragmentManager();
        switch (item.getItemId()) {
            case 0:
                // Demonstra método "findFragmentById"
                Fragmento02 frag2 = (Fragmento02) fm.findFragmentById(R.id.frag2);
                frag2.setTexto("Texto Fragmento02 Atualizado!");
                break;
        }
        return true;
    }
}
