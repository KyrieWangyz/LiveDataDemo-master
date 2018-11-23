package easytoeat.com.lxf.livedatademo.p;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;

import com.lxf.common.base.BasePresenter;
import com.lxf.common.base.CommonLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import easytoeat.com.lxf.livedatademo.ui.MainActivity;
import easytoeat.com.lxf.livedatademo.viewModel.DataViewModel;

/**
 * LiveDataDemo
 * easytoeat.com.lxf.livedatademo
 * Created by Kyrie
 * Created on 2018/8/13.
 */

public class MainPresenter extends BasePresenter<MainActivity> {


    @Inject
    DataViewModel dataViewModel;

    @Inject
    public MainPresenter() {
    }

    @Override
    public void onCreat() {
        super.onCreat();
        dataViewModel.getData().
                setCommonLiveDataCall(new CommonLiveData.CommonLiveDataCall(){
                    @Override
                    public void dataError(int errorCode, String msg){
                        //处理错误的地方
                        view.setData(new ArrayList());
                        view.showError();
                    }
                }).
                observe(view, new Observer<ArrayList<String>>() {
                    @Override
                    public void onChanged(@Nullable ArrayList<String> list) {
                        view.setData(list);
                    }
                });

        view.autoRefresh();
    }

    /**
     * 刷新数据
     */
    public void getData() {
        dataViewModel.refureshData();
    }

    public void loadData() {
        dataViewModel.loadData();
    }
}
