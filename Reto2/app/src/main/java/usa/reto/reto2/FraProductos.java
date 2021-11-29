package usa.reto.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FraProductos extends Fragment {
    Drawable drawable;
    ImageView imagenini;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_fra_productos, container, false);
        //*****carga imagenes******//
        //*****imagenes mujeres******//
        Resources ima1 = getResources();
        drawable = ima1.getDrawable(R.drawable.cham1, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fpro1);
        imagenini.setImageDrawable(drawable);

        Resources ima2 = getResources();
        drawable = ima2.getDrawable(R.drawable.cham2, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fpro2);
        imagenini.setImageDrawable(drawable);

       Resources ima3 = getResources();
        drawable = ima3.getDrawable(R.drawable.cham3, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fpro3);
        imagenini.setImageDrawable(drawable);

        //*****imagenes hombres******//
        Resources imah1 = getResources();
        drawable = imah1.getDrawable(R.drawable.chah1, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_hpro1);
        imagenini.setImageDrawable(drawable);

        Resources imah2 = getResources();
        drawable = imah2.getDrawable(R.drawable.chah2, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_hpro2);
        imagenini.setImageDrawable(drawable);

        Resources imah3 = getResources();
        drawable = imah3.getDrawable(R.drawable.chah3, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_hpro3);
        imagenini.setImageDrawable(drawable);

        return v;
    }
}