package com.wce.pallapu.collapsingtoolbar;

import android.content.Context;

import com.iceteck.silicompressorr.SiliCompressor;

/**
 * Created by A7718 on 12/27/2017.
 */

public class Album {



    private int img_id;



    public Album(int img_id) {
        setImg_id(img_id);
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {

        this.img_id = img_id;
    }
}
