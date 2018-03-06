package com.example.android.popularmovies.Utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by stefa on 5/3/2018.
 */

public class ItemDecoration extends RecyclerView.ItemDecoration{

    private int spaceColumn;

    public ItemDecoration(int space) {
        this.spaceColumn = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
        outRect.left = spaceColumn;
        outRect.right = spaceColumn;
        outRect.bottom = spaceColumn;

        // Add top margin only for the first item to avoid double space between items
        /*if (parent.getChildLayoutPosition(view) == 0) {
            outRect.top = spaceColumn;
        } else {
            outRect.top = 0;
        }*/
    }
}
