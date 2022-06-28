package com.example.p3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LocatieBaseAdapter extends BaseAdapter {

    private ArrayList<Locatie> locaties;
    private LayoutInflater inflater;

    public LocatieBaseAdapter(Context context, ArrayList<Locatie> locaties) {
        this.locaties = locaties;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return locaties.size();
    }

    @Override
    public Object getItem(int i) {
        return locaties.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = convertView;

        if (view == null) {
            view = inflater.inflate(R.layout.list_item, null);
        }

        TextView naamText = (TextView) view.findViewById(R.id.naam);
        TextView infoText = (TextView) view.findViewById(R.id.info);
        TextView bezoekersText = (TextView) view.findViewById(R.id.bezoekers);

        Locatie locaties = Locatie.get(position);
        naamText.setText(locaties.getNaam());
        infoText.setText(locaties.getInfo());
        bezoekersText.setText(Integer.toString(locaties.getBezoekers()));
        return view;
    }
}
