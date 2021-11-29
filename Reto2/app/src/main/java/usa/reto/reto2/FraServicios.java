package usa.reto.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FraServicios extends Fragment {

    Drawable drawable;
    ImageView imagenini;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_fra_servicios, container, false);

        //*****carga imagenes******//

        Resources ima1 = getResources();
        drawable = ima1.getDrawable(R.drawable.medidas, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fser1);
        imagenini.setImageDrawable(drawable);

        Resources ima2 = getResources();
        drawable = ima2.getDrawable(R.drawable.domicilio, v.getContext().getTheme());
        imagenini = (ImageView) v.findViewById(R.id.ima_fser2);
        imagenini.setImageDrawable(drawable);



        return v;
    }
}