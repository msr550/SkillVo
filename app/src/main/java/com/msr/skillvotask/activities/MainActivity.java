package com.msr.skillvotask.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.msr.skillvotask.R;
import com.msr.skillvotask.adapters.PagesAdapter;
import com.msr.skillvotask.app.SkillVo;
import com.msr.skillvotask.helpers.JsonHelper;
import com.msr.skillvotask.model.response.PagedList;
import com.msr.skillvotask.model.response.ServiceRespnse;
import com.msr.skillvotask.utils.DialogUtils;
import com.msr.skillvotask.utils.Logger;

import org.json.JSONObject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private final int REQUEST_CODE = 1000;
    @Bind(R.id.pagesRV)
    RecyclerView pagesRV;
    private PagesAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        makeSampleDataRequest();
    }

    private void makeSampleDataRequest() {
        progressDialog = DialogUtils.getInstance().progressDialog(this);
        Logger.showInfo("URL::" + getString(R.string.url_sample_data));
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(
                getString(R.string.url_sample_data), null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        ServiceRespnse serviceRespnse = JsonHelper.parseJson(response, ServiceRespnse.class);
                        Logger.showInfo("ServiceResponse:::" + serviceRespnse);
                        if (serviceRespnse != null) {
                            Logger.showInfo("Pages Size:::" + serviceRespnse.getPagedList().size());
                            pagesRV.setHasFixedSize(true);
                            pagesRV.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
                            adapter = new PagesAdapter(MainActivity.this, serviceRespnse.getPagedList());
                            pagesRV.setAdapter(adapter);
                        }
                        Logger.showInfo("Response:::" + response);

                        dismissDialog();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Logger.showInfo("Error:::" + error.getMessage());
                dismissDialog();

            }
        });

        // Adding request to request queue
        SkillVo.getInstance().addToRequestQueue(jsonObjReq, getString(R.string.url_sample_data));
    }

    @Override
    public void onClick(View view) {
        RadioButton selectRB = (RadioButton) view.findViewById(R.id.selectRB);
        PagedList pagedList = (PagedList) selectRB.getTag();
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(getString(R.string.bundle_page_obj), pagedList);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
            PagedList pagedList = (PagedList) compoundButton.getTag();
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(getString(R.string.bundle_page_obj), pagedList);
            startActivityForResult(intent, REQUEST_CODE);
        }
    }
}
