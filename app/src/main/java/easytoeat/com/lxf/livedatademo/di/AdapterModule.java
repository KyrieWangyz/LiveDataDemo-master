package easytoeat.com.lxf.livedatademo.di;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import easytoeat.com.lxf.livedatademo.ui.MainAdapter;
import easytoeat.com.lxf.livedatademo.R;

/**
 * LiveDataDemo
 * Created by Kyrie
 * Created on 2018/8/13.
 */
@Module
public class AdapterModule {

    @Provides
    MainAdapter provideMaindapter() {
        return new MainAdapter(R.layout.main_item, new ArrayList<String>());
    }
}
