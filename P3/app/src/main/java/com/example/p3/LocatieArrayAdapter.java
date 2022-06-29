package com.example.p3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class LocatieArrayAdapter extends ArrayAdapter<Locatie> {

    private LayoutInflater inflater;

    public LocatieArrayAdapter(Context context, List<Locatie> locatieList) {
        super(context, 0, locatieList);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, null);
        }

        Locatie locaties = getItem(position);
        TextView naamText = (TextView) view.findViewById(R.id.naam);
        TextView infoText = (TextView) view.findViewById(R.id.info);
        TextView bezoekersText = (TextView) view.findViewById(R.id.bezoekers);
        naamText.setText(Locatie.getNaam());
        infoText.setText((Locatie.getInfo()));
        bezoekersText.setText(Integer.toString(locaties.getBezoekers()));
        return view;
    }
}
