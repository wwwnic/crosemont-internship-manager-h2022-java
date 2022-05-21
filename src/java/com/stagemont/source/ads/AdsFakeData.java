/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.ads;

import com.stagemont.entities.Ads;
import java.util.ArrayList;
import java.util.List;

public class AdsFakeData implements AdsSource {

    List<Ads> listAds = new ArrayList();

    public AdsFakeData() {
        listAds.add(new Ads(1, "Google is now hiring", "Google is hiring more employees! Contact the person in charge", "google_ad_img", 1));
        listAds.add(new Ads(2, "Work Hard. Have Fun. Make History", "If you want to work in an efficient and spacious environement, apply to work for Amazon!", "amazon_ad_img", 3));
        listAds.add(new Ads(3, "Don't be evil", "Google is now looking for interns!", "google_ad2_img", 1));
    }

    @Override
    public Ads getAdsFromid(int id) {
        return this.listAds.get(id);
    }

    @Override
    public List<Ads> getAllAds() {
        return this.listAds;
    }

    @Override
    public boolean insertAds(Ads ads) {
        ads.setId(listAds.size() + 1);
        listAds.add(ads);
        return true;
    }

    @Override
    public boolean updateAds(Ads ads) {
        this.listAds.remove(ads.getId() - 1);
        this.listAds.add(ads.getId() - 1, ads);
        return true;
    }

    @Override
    public boolean deleteAds(int id) {
        this.listAds.remove(id - 1);
        return true;
    }

    @Override
    public List<Ads> getAdsFromCompanyid(int company_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
