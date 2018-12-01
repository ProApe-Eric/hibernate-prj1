package cn.edu.zjut.po;

import java.sql.Blob;

public class Item {

    private ItemPK itemPK;
    private String description;
    private float cost;
    private Blob image;

    public Item() {
    }

    public Item(ItemPK itemPK) {
        this.itemPK = itemPK;
    }

    public Item(ItemPK itemPK, String description, float cost, Blob image) {
        this.itemPK = itemPK;
        this.description = description;
        this.cost = cost;
        this.image = image;
    }

    public ItemPK getItemPK() {
        return itemPK;
    }

    public void setItemPK(ItemPK itemPK) {
        this.itemPK = itemPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
