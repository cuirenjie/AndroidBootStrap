package com.androidbootstrap.ui.base.presenter;

import com.androidbootstrap.ui.base.view.IView;

/**
 * @author puhanhui
 * @version 1.0
 * @date 2016/9/3
 * @since 1.0
 */
public  interface IPresenter<V extends IView> {

    void attachView(V view);

    void detachView();
}
