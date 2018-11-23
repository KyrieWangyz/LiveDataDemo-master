package easytoeat.com.lxf.livedatademo.repertory;

import com.lxf.common.base.CommonLiveData;

import java.util.ArrayList;

import easytoeat.com.lxf.livedatademo.ErrorHandling;

/**
 * LiveDataDemo
 * easytoeat.com.lxf.livedatademo.repertory
 * Created by Kyrie
 * Created on 2018/8/13.
 */

public class DataRepertory implements IDataRepertory {


    @Override
    public void refureshData(CommonLiveData<ArrayList<String>> liveData) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add("模拟数据" + i);
        }
        //
        liveData.setValue(arrayList);
    }

    @Override
    public void loadData(CommonLiveData<ArrayList<String>> liveData) {
        liveData.setValue(ErrorHandling.ERROR, "请求数据失败");
    }
}
