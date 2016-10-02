package com.msr.skillvotask.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.msr.skillvotask.R;
import com.msr.skillvotask.adapters.ImagesRecyclerViewAdapter;
import com.msr.skillvotask.model.response.PagedList;
import com.msr.skillvotask.model.response.Portfolio;
import com.msr.skillvotask.utils.Logger;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DetailsActivity extends BaseActivity implements View.OnClickListener {
    @Bind(R.id.imagesRecyclerView)
    RecyclerView imagesRecyclerView;
    @Bind(R.id.itemIV)
    ImageView itemIV;
    @Bind(R.id.rotateRightIV)
    ImageView rotateRightIV;
    @Bind(R.id.rotateLeftIV)
    ImageView rotateLeftIV;
    private ImagesRecyclerViewAdapter myRecyclerViewAdapter;
    private LinearLayoutManager linearLayoutManager;
    private Portfolio portfolio = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            PagedList pagedList = (PagedList) bundle.getSerializable(getString(R.string.bundle_page_obj));
            if (pagedList != null) {
                linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
                List<Portfolio> portfolioList = pagedList.getPortfolio();
                if (portfolioList != null) {
                    for (Portfolio portfolio : portfolioList) {
                        portfolio.setDegrees(0);
                    }
                }
                Logger.showInfo("Size:::" + portfolioList.size());
                myRecyclerViewAdapter = new ImagesRecyclerViewAdapter(this, portfolioList);
                imagesRecyclerView.setAdapter(myRecyclerViewAdapter);
                imagesRecyclerView.setLayoutManager(linearLayoutManager);
                if (portfolioList.size() > 0) {
                    portfolio = portfolioList.get(0);
                    loadImage();
                }
            }
        }
    }

    private void updateTag() {
        rotateLeftIV.setTag(portfolio);
        rotateRightIV.setTag(portfolio);
    }

    private void loadImage() {
        updateTag();
        String url = portfolio.getUrl();
        if (url != null && !url.equals("")) {
            Picasso.with(this)
                    .load(url)
                    .rotate(portfolio.getDegrees())
                    .into(itemIV);
        }
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK, null);
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.rotateLeftIV:
                portfolio = (Portfolio) view.getTag();
                portfolio.setDegrees(portfolio.getDegrees() == 0 ? 270 : portfolio.getDegrees() - 90);
                loadImage();
                myRecyclerViewAdapter.notifyDataSetChanged();
                break;
            case R.id.rotateRightIV:
                portfolio = (Portfolio) view.getTag();
                portfolio.setDegrees(portfolio.getDegrees() == 360 ? 0 : portfolio.getDegrees() + 90);
                loadImage();
                myRecyclerViewAdapter.notifyDataSetChanged();
                break;
            default:
                ImageView imageView = (ImageView) view.findViewById(R.id.itemIV);
                portfolio = (Portfolio) imageView.getTag();
                loadImage();
                break;
        }
    }
}
