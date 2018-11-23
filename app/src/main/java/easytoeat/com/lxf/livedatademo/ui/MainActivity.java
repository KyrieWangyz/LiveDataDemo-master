package easytoeat.com.lxf.livedatademo.ui;

import android.view.View;
import android.widget.FrameLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lxf.common.recycle.RecycleActivity;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import butterknife.BindView;
import easytoeat.com.lxf.livedatademo.p.MainPresenter;
import easytoeat.com.lxf.livedatademo.R;
import easytoeat.com.lxf.livedatademo.di.DaggerMianComponent;

public class MainActivity extends RecycleActivity<MainPresenter, MainAdapter> implements IMainActivity {


    @BindView(R.id.content)
    FrameLayout content;

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

    }

    @Override
    public FrameLayout getRecycleParent() {
        return content;
    }

    @Override
    public String getTitleText() {
        return "小戴莫";
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    public void initDagger() {
        DaggerMianComponent.create().inject(this);
    }

    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
    mPresenter.loadData();
    }

    @Override
    public void onRefresh(RefreshLayout refreshLayout) {
        mPresenter.getData();
    }
}
