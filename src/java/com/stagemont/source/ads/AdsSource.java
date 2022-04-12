/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.ads;

import com.stagemont.entities.Ads;
import java.util.List;

/**
 *
 * @author melis
 */
public interface AdsSource {
    
    public List<Ads> getAllAds();
    
}
