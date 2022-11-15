package com.example.healthcare;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NewsFragment extends Fragment {
    RecyclerView recylerView;
    RecyclerView recylerViewTrending;
    String s1[], s2[];
    int images[] = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image1,
    };
    int trendingImages[] = {
            R.drawable.trending,
            R.drawable.trending,
            R.drawable.trending,
            R.drawable.trending,
            R.drawable.trending,
    };

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recylerView = view.findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.tanggal);
        s2 = getResources().getStringArray(R.array.subjudul);
        HealthAdapter appAdapter = new HealthAdapter(this,s1,s2,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(view.getContext(),
                LinearLayoutManager.VERTICAL, false));

        recylerViewTrending = view.findViewById(R.id.recyclerViewTrending);
        TrendingAdapter trendingAdapter = new TrendingAdapter(this,s2,trendingImages);
        recylerViewTrending.setAdapter(trendingAdapter);
        recylerViewTrending.setLayoutManager(new LinearLayoutManager(view.getContext(),
                LinearLayoutManager.HORIZONTAL, false));

    }
}