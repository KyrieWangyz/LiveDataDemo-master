package easytoeat.com.lxf.livedatademo.di;

import dagger.Module;
import dagger.Provides;
import easytoeat.com.lxf.livedatademo.ErrorHandling;
import easytoeat.com.lxf.livedatademo.repertory.DataRepertory;
import easytoeat.com.lxf.livedatademo.viewModel.DataViewModel;

/**
 * LiveDataDemo
 * Created by Kyrie
 * Created on 2018/8/13.
 */
@Module
public class ViewModelModule {

    @Provides
    DataViewModel provideDataViewModel() {
        return new DataViewModel(new ErrorHandling()
                ,new DataRepertory());
    }
}
