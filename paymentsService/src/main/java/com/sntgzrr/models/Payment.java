package com.sntgzrr.models;

public class Payment {
    private String id;
    private  Float amount;
    private String clientId;
    private String ownerId;

    public Payment(String id, Float amount, String clientId, String ownerId) {
        this.id = id;
        this.amount = amount;
        this.clientId = clientId;
        this.ownerId = ownerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
