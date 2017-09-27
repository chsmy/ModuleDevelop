package com.chs.library.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chs.library.R;


/**
 * 作者：chs on 2017-08-28 14:30
 * 邮箱：657083984@qq.com
 */

public class RecycleViewDivider extends RecyclerView.ItemDecoration {
    private Drawable drawable;

    public RecycleViewDivider(Context context) {
        drawable = ContextCompat.getDrawable(context, R.drawable.bottom_line);
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
//        drawVertical(c, parent);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        drawVertical(c, parent);
    }

    private void drawVertical(Canvas canvas, RecyclerView parent) {
        int left;
        int right = parent.getWidth() - parent.getPaddingRight();
        View child;
        RecyclerView.LayoutParams layoutParams;
        int top;
        int bottom;
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            child = parent.getChildAt(i);
            layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
            left = child.getLeft();

            top = child.getBottom() + layoutParams.bottomMargin;
            bottom = top + drawable.getIntrinsicHeight();
            drawable.setBounds(left, top, right, bottom);
            drawable.draw(canvas);
        }

    }

    //如果等于分割线的高度或宽度的话可以不重写次方法
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        if (parent.getChildLayoutPosition(view) == parent.getChildCount() - 1) {
            outRect.set(0, 0, 0, 0);
        } else {
            outRect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }
}
