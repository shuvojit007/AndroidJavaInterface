package com.example.androidjavainterface;

public class ButtonOne {


    MainActivityOne mainActivityOne;

    public void setMainActivityOne(MainActivityOne mainActivityOne) {
        this.mainActivityOne = mainActivityOne;
    }


    /**
     * Fires when a User Clicks the Button.
     * Let’s not worry how, just assume it works.
     **/

    private void OnClick() {
        /*
         *    we’re basically relaying the fact that the button was clicked, and which one
         *    was clicked (by hypothetical Id), so that the Activity can handle user input.
         */
        mainActivityOne.onClick(getViewId());
    }


    public int getViewId(){
        return 123456;
    }
}
