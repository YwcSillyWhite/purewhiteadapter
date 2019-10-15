package com.example.purewhile.call;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * 长按点击
 */
public interface OnItemLongListener {

    boolean onClick(RecyclerView.Adapter adapter, View view, int position, boolean itemView);
}
