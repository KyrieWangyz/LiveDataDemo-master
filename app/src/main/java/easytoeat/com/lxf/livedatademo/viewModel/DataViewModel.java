package easytoeat.com.lxf.livedatademo.viewModel;

import com.lxf.common.base.BaseErrorHandling;
import com.lxf.common.base.BaseViewModel;

import java.util.ArrayList;

import easytoeat.com.lxf.livedatademo.repertory.IDataRepertory;

/**
 * LiveDataDemo
 * easytoeat.com.lxf.livedatademo
 * Created by Kyrie
 * Created on 2018/8/13.
 */

public class DataViewModel extends BaseViewModel<ArrayList<String>>  {


    private IDataRepertory iDataRepertory;

    public DataViewModel(BaseErrorHandling errorHandling, IDataRepertory iDataRepertory) {
        super(errorHandling);
        this.iDataRepertory = iDataRepertory;
    }

    /**
     * 去仓库获取数据
     */
    public void refureshData() {
        iDataRepertory.refureshData(liveData);
    }

    public void loadData() {
        iDataRepertory.loadData(liveData);
    }
}
