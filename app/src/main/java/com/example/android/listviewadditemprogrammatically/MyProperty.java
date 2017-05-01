package com.example.android.listviewadditemprogrammatically;

/**
 * Created by rudi on 5/1/17.
 */

public class MyProperty {

    public String kalimat;

    public String getKalimat() {
        return kalimat;
    }

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    @Override
    public String toString() {
        return getKalimat();
    }
}
