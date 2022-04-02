package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Ads {

    public Ads(String title, String description, String image, int company_id) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.company_id = company_id;
    }

    private String title;
    private String description;
    private String image;
    private int company_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
}
