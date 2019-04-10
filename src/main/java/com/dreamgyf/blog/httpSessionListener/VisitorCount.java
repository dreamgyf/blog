package com.dreamgyf.blog.httpSessionListener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class VisitorCount implements HttpSessionListener {

    private long visitorCount = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        synchronized(this)
        {
            visitorCount++;
            se.getSession().setAttribute("visitorCount",visitorCount);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
