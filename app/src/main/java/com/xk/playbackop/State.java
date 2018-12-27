package com.xk.playbackop;

import android.view.MotionEvent;

/**
 * @author xuekai1
 * @date 2018/12/27
 */
public class State {
    /**
     * 事件
     */
    MotionEvent event;
    /**
     * 从当前activity开始录制到该事件发生的时间
     */
    long time;
}
