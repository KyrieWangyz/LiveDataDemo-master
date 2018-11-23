package easytoeat.com.lxf.livedatademo.repertory;

import com.lxf.common.base.CommonLiveData;

import java.util.ArrayList;

/**
 * LiveDataDemo
 * easytoeat.com.lxf.livedatademo.repertory
 * Created by Kyrie
 * Created on 2018/8/13.
 */

public interface IDataRepertory {

    void refureshData(CommonLiveData<ArrayList<String>> liveData);

    void loadData(CommonLiveData<ArrayList<String>> liveData);

}
