package com.chs.module_duanzi;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chs.library.base.BaseActivity;
import com.chs.library.util.LogUtils;
import com.chs.library.widget.RecycleViewDivider;
import com.chs.module_duanzi.adapter.DuanZiListAdapter;
import com.chs.module_duanzi.module.DuanZiListEntity;
import com.chs.module_duanzi.net.DuanZiDataManager;

import butterknife.BindView;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 作者：chs on 2017-09-26 16:13
 * 邮箱：657083984@qq.com
 */
@Route(path = "/duanzi/DuanZiActivity")
public class DuanZiHuActivity extends BaseActivity {
    @BindView(R2.id.recycler_view)
    RecyclerView mRecyclerView;

    @Override
    public int getLayoutId() {
        return R.layout.duanzi_home;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        GridLayoutManager manager = new GridLayoutManager(this,2);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        RecycleViewDivider divider = new RecycleViewDivider(this);
        mRecyclerView.addItemDecoration(divider);
        mRecyclerView.setLayoutManager(manager);
        loadData(true);
    }

    @Override
    protected void loadData(boolean isShowLoading) {
        super.loadData(isShowLoading);
        DuanZiDataManager.getInstance().getZhuHuList(new Observer<DuanZiListEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(final DuanZiListEntity entity) {
                DuanZiListAdapter adapter = new DuanZiListAdapter(R.layout.duanzi_item_list,entity.getData().getData());
                mRecyclerView.setAdapter(adapter);
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.i("DuanZiHuActivity", "onError:" + e.getMessage());
            }

            @Override
            public void onComplete() {
                finishDialog();
                LogUtils.i("DuanZiHuActivity", "onComplete:" );
            }
        });
    }
}
