package br.com.etecia.testefragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    ListView lista_plantas;
    int[] imagem_plantas = {R.drawable.almeiraoarvore, R.drawable.azedinha, R.drawable.anredera, R.drawable.bertalha, R.drawable.capuchinha};
    String[] nome_plantas = {"Almeirão de árvore", "Azedinha", "Anredera", "Bertalha", "Capuchinha"};
    String[] desc_plantas = {"Hortaliça tradicional", "Plantio e Saúde", "Alimentação e bem-estar", "Longevidade e saúde", "Disposição e qualidade de vida"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        lista_plantas = view.findViewById(R.id.lista_panc);
        AdapterListaplantas adapterListaplantas = new AdapterListaplantas();

        lista_plantas.setAdapter(adapterListaplantas);

        return view;
    }

    public class AdapterListaplantas extends BaseAdapter {
        @Override
        public int getCount() {
            return imagem_plantas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView img_modelo;
            TextView nome_planta, desc_planta;
            CardView card_planta;
            View v = getLayoutInflater().inflate(R.layout.modelo_lista, null);

            nome_planta = v.findViewById(R.id.nome_planta);
            desc_planta = v.findViewById(R.id.planta_desc);
            img_modelo = v.findViewById(R.id.img_modelo);

            nome_planta.setText(nome_plantas[i]);
            desc_planta.setText(desc_plantas[i]);
            img_modelo.setImageResource(imagem_plantas[i]);

            return v;
        }
    }
}