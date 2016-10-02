package com.msr.skillvotask.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.msr.skillvotask.R;
import com.msr.skillvotask.model.response.PagedList;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Sandeep Maram on 30-09-2016.
 */
public class PagesAdapter extends RecyclerView.Adapter<PagesAdapter.ItemRowHolder> {
    private List<PagedList> pagedList;
    private Context context;

    /**
     * to initialize the instances of your class
     *
     * @param context   context
     * @param pagedList lead details arraylist
     */
    public PagesAdapter(Context context, List<PagedList> pagedList) {
        this.context = context;
        this.pagedList = pagedList;
    }

    @Override
    public ItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_page_list_item, parent, false);
        return new ItemRowHolder(view);
    }

    @Override
    public void onBindViewHolder(final ItemRowHolder itemRowHolder, final int position) {
        final PagedList page = pagedList.get(position);
        itemRowHolder.titleTV.setText(page.getTitle());
        itemRowHolder.photosTV.setText("Photos: " + page.getPortfolio().size());
        itemRowHolder.selectRB.setChecked(false);
        itemRowHolder.selectRB.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) context);
        itemRowHolder.selectRB.setTag(page);
    }

    @Override
    public int getItemCount() {
        return pagedList.size();
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.titleTV)
        TextView titleTV;
        @Bind(R.id.photosTV)
        TextView photosTV;
        @Bind(R.id.selectRB)
        RadioButton selectRB;

        public ItemRowHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener((View.OnClickListener) context);
        }
    }
}
