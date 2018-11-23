package easytoeat.com.lxf.livedatademo.ui;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import easytoeat.com.lxf.livedatademo.R;

/**
 * LiveDataDemo
 * easytoeat.com.lxf.livedatademo
 * Created by Kyrie
 * Created on 2018/8/13.
 */

public class MainAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


    public MainAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.text, item);
    }


}
