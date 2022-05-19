/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author melis
 */
public class AddAds extends AbstractAction  {


    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("addAdsForm.jsp").forward(request, response);
    }
    */
    
    @Override
    public String execute() {
        
        String userType = request.getSession(false).getAttribute("type").toString();
        
        return userType + "/addAdsForm";
    }


}
