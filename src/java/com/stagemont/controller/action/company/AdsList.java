/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Ads;
import com.stagemont.source.ads.AdsDAO;
import com.stagemont.source.ads.AdsSource;
import java.util.List;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class AdsList extends AbstractAction {

    private final AdsSource DATA_ADS = new AdsDAO();


    @Override
    public String execute() {
        
        Cookie[] idCookie = request.getCookies();
        int idConnecte=-1;
        if (idCookie!=null) {
            for (int i=0; i<idCookie.length; i++) {
                if ((idCookie[i].getName()).equals("idConnecte")){
                    idConnecte = Integer.parseInt(idCookie[i].getValue());
                }
            }
        }
        
        request.setAttribute("idConnecte", idConnecte);
        
        List<Ads> listAds = DATA_ADS.getAdsFromCompanyid(idConnecte);
        request.setAttribute("listAds", listAds);
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/adsList";
    }
    


}
