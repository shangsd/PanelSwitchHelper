package com.example.demo.anno;


import static com.example.demo.anno.ApiResetType.ENABLE_EmptyView;
import static com.example.demo.anno.ApiResetType.ENABLE_RecyclerView;
import static com.example.demo.anno.ApiResetType.ENABLE_HookActionUpRecyclerview;
import static com.example.demo.anno.ApiResetType.DISABLE;
import static com.example.demo.anno.ApiResetType.ENABLE;

import android.support.annotation.IntDef;

@IntDef({DISABLE,ENABLE,ENABLE_EmptyView, ENABLE_RecyclerView, ENABLE_HookActionUpRecyclerview})
public @interface ApiResetType {
    int DISABLE = 0;
    int ENABLE = 1;
    int ENABLE_EmptyView = 11;
    int ENABLE_RecyclerView = 12;
    int ENABLE_HookActionUpRecyclerview = 13;
}
