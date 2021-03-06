package com.devdroid.easybiz.model;

public class Accepted {

    private String name;
    private String paid_amount;
    private String mode_of_transaction;
    private String image_url;
    private String date_of_delivery;

    public Accepted()
    {

    }

    public String getName() {
        return name;
    }

    public Accepted setName(String name) {
        this.name = name;
        return this;
    }

    public String getPaid_amount() {
        return paid_amount;
    }

    public Accepted setPaid_amount(String paid_amount) {
        this.paid_amount = paid_amount;
        return this;
    }

    public String getMode_of_transaction() {
        return mode_of_transaction;
    }

    public Accepted setMode_of_transaction(String mode_of_transaction) {
        this.mode_of_transaction = mode_of_transaction;
        return this;
    }

    public String getImage_url() {
        return image_url;
    }

    public Accepted setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public String getDate_of_delivery() {
        return date_of_delivery;
    }

    public Accepted setDate_of_delivery(String date_of_delivery) {
        this.date_of_delivery = date_of_delivery;
        return this;
    }
}
