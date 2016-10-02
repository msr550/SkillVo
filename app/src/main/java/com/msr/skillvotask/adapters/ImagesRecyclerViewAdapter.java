package com.msr.skillvotask.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.msr.skillvotask.R;
import com.msr.skillvotask.model.response.Portfolio;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Sandeep Maram on 01-10-2016.
 */

public class ImagesRecyclerViewAdapter extends RecyclerView.Adapter<ImagesRecyclerViewAdapter.ItemHolder> {

    private List<Portfolio> items;
    private LayoutInflater layoutInflater;
    private Activity context;
    private View.OnClickListener onClickListener = null;

    public ImagesRecyclerViewAdapter(Activity context, List<Portfolio> items) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.items = items;
        onClickListener = (View.OnClickListener) context;
    }

    @Override
    public ImagesRecyclerViewAdapter.ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemCardView = layoutInflater.inflate(R.layout.view_gallery_item, parent, false);
        return new ItemHolder(itemCardView, this);
    }

    @Override
    public void onBindViewHolder(ImagesRecyclerViewAdapter.ItemHolder holder, int position) {
        Portfolio portfolio = items.get(position);
        String url = portfolio.getUrl();
        holder.imageView.setTag(portfolio);
        if (url != null && !url.equals("")) {
            Picasso.with(context)
                    .load(url)
                    .rotate(portfolio.getDegrees())
                    .into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class ItemHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ItemHolder(View cardView, ImagesRecyclerViewAdapter parent) {
            super(cardView);
            itemView.setOnClickListener(onClickListener);
            imageView = (ImageView) cardView.findViewById(R.id.itemIV);
        }
    }
}


