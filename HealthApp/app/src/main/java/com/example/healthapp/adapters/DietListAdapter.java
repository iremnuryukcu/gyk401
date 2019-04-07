package com.example.healthapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healthapp.R;
import com.example.healthapp.models.Diet;

import java.util.List;

public class DietListAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<Diet> dietList;

    public DietListAdapter(LayoutInflater layoutInflater, List<Diet> dietList) {
        this.layoutInflater = layoutInflater;
        this.dietList = dietList;
    }

    @Override
    public int getCount() {
        return dietList.size();
    }

    @Override
    public Object getItem(int position) {
        return dietList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View dietView = layoutInflater.inflate(R.layout.custom_diet_layout,null);
        ImageView imageViewCustomDietFoodPicture = dietView.findViewById(R.id.imageViewCustomDietFoodPicture);
        TextView textViewCustomDietFoodName = dietView.findViewById(R.id.textViewCustomDietFoodName);
        TextView textViewCustomDietFoodCalorie = dietView.findViewById(R.id.textViewCustomDietFoodCalorie);

        Diet diet = dietList.get(position);
        imageViewCustomDietFoodPicture.setImageResource(diet.getFoodPicture());
        textViewCustomDietFoodName.setText(diet.getFoodName());
        textViewCustomDietFoodCalorie.setText(diet.getTotalCalorie());
        return dietView;
    }
}
