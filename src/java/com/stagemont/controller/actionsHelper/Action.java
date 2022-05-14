package com.stagemont.controller.actionsHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
    
    public String execute();
    
    public void setRequest(HttpServletRequest request);
    
    public void setResponse(HttpServletResponse response);
}
