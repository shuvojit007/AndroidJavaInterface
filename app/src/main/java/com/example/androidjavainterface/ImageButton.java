package com.example.androidjavainterface;

public class ImageButton {

    public OnWidgetClickListener onWidgetClickListener ;


    public void setOnWidgetClickListener(OnWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }

    /**
     * Fires when a User Clicks the Button.
     * Let’s not worry how, just assume it works.
     **/
    public void setOnClick() {
        onWidgetClickListener.click(getViewId());
    }


    //In reality, the View Id is generated at Runtime. At the moment, I don’t care how.
    //fake view id
    public int getViewId(){
        return 123456;
    }


}
