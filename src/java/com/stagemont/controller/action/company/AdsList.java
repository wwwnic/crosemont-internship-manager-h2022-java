/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Ads;
import com.stagemont.source.ads.AdsFakeData;
import com.stagemont.source.ads.AdsSource;
import java.util.List;

/**
 *
 * @author melis
 */
public class AdsList extends AbstractAction {

    private final AdsSource DATA_ADS = new AdsFakeData();
    
    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        List<Ads> listAds = DATA_ADS.getAllAds();
        
        request.setAttribute("listAds", listAds);
        
        request.getRequestDispatcher("adsList.jsp").forward(request, response);
    }
    */

    @Override
    public String execute() {
        List<Ads> listAds = DATA_ADS.getAllAds();
        request.setAttribute("listAds", listAds);
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/adsList";
    }
    


}
