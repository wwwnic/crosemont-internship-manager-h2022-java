/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.ads;

import com.stagemont.entities.Ads;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis
 */
public class AdsFakeData implements AdsSource {

    @Override
    public List<Ads> getAllAds() {
        List<Ads> listAds = new ArrayList();
        
        Ads ad1 = new Ads(1, "Google is now hiring", "Google is hiring more employees! Contact the person in charge", "google_ad_img", 1);
        Ads ad2 = new Ads(2, "Work Hard. Have Fun. Make History", "If you want to work in an efficient and spacious environement, apply to work for Amazon!", "amazon_ad_img", 3);
        Ads ad3 = new Ads(3, "Don't be evil", "Google is now looking for interns!", "google_ad2_img", 1);
        
        listAds.add(ad1);
        listAds.add(ad2);
        listAds.add(ad3);
        
        return listAds;
    }
    
}
