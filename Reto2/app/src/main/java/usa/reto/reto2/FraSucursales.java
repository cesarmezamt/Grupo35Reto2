package usa.reto.reto2;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class FraSucursales extends Fragment {

    Drawable drawable;
    ImageView imagenini;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_fra_sucursales, container, false);

        //*****carga imagenes******//

        Resources ima1 = getResources();
        drawable = ima1.getDrawable(R.drawable.almacen1, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fsuc1);
        imagenini.setImageDrawable(drawable);

        Resources ima2 = getResources();
        drawable = ima2.getDrawable(R.drawable.almacen2, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fsuc2);
        imagenini.setImageDrawable(drawable);

        return v;
    }


}