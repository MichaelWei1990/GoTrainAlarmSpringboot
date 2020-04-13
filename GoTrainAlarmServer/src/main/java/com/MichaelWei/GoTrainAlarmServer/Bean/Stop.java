package com.MichaelWei.GoTrainAlarmServer.Bean;

import java.io.Serializable;

public class Stop implements Serializable {

    private static final long serialVersionUID = 1L;

    private String m_ID;
    private String m_Name;
    private String m_URL;

    // TODO: services

    // TODO; more properties, such as location (longitude and latitude) and .etc.

    public Stop(String id, String name, String url) {
        super();
        m_ID = id;
        m_Name = name;
        m_URL = url;
    }

    public String GetID(){
        return this.m_ID;
    }

    public String GetName(){
        return this.m_Name;
    }

    @Override
    public String toString(){
        return "ID " + this.m_ID + ", Name: " + this.m_Name + ", URL: " + this.m_URL;
    }

}
