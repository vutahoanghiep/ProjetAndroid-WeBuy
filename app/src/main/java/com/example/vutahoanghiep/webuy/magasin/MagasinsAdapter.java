package com.example.vutahoanghiep.webuy.magasin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vutahoanghiep.webuy.R;

import java.util.List;

/**
 * Created by TaHoangHiep on 21/02/2018.
 */

public class MagasinsAdapter extends BaseAdapter{
    private List<Magasin> listMagasin;
    private LayoutInflater layoutInflater;
    private Context context;

    public MagasinsAdapter (Context context, List<Magasin> listMagasin) {
        this.context = context;
        this.listMagasin = listMagasin;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listMagasin.size();
    }

    @Override
    public Object getItem(int position) {
        return listMagasin.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MagasinViewHolder viewHolder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.liste_magasins,null);
            viewHolder = new MagasinViewHolder();
            viewHolder.logoMagasinView = (ImageView) convertView.findViewById(R.id.imageViewLogoMagasin);
            viewHolder.nomMagasinView = (TextView) convertView.findViewById(R.id.textViewNomMagasin);
            viewHolder.adresseMagasinView = (TextView) convertView.findViewById(R.id.textViewAdresseMagasin);
            viewHolder.nombrePromosView = (TextView) convertView.findViewById(R.id.textViewNombrePromotions);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MagasinViewHolder) convertView.getTag();
        }

        Magasin magasin = this.listMagasin.get(position);
        viewHolder.nomMagasinView.setText(magasin.getNomMagasin());
        viewHolder.adresseMagasinView.setText(context.getString(R.string.textViewLabelAdresse) + magasin.getAdresseMagasin());
        viewHolder.nombrePromosView.setText(context.getString(R.string.textViewLabelPromos) + String.valueOf(magasin.getNombrePromos()));

        int imageId = this.getLogoId(magasin.getNomLogo());
        viewHolder.logoMagasinView.setImageResource(imageId);
        return convertView;
    }

    private int getLogoId(String nomLogo) {
        String nomPackage = context.getPackageName();
        int resId = context.getResources().getIdentifier(nomLogo,"mipmap",nomPackage);
        return resId;
    }

    private class MagasinViewHolder {
        private ImageView logoMagasinView;
        private TextView nomMagasinView;
        private TextView adresseMagasinView;
        private TextView nombrePromosView;
    }
}
