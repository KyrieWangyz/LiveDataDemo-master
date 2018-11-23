package easytoeat.com.lxf.livedatademo.di;

import dagger.Component;
import easytoeat.com.lxf.livedatademo.ui.MainActivity;

/**
 * LiveDataDemo
 * Created by Kyrie
 * Created on 2018/8/13.
 */
@Component(modules = {AdapterModule.class, ViewModelModule.class})
public interface MianComponent {
    void inject(MainActivity mainActivity);
}
