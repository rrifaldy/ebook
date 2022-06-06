package com.example.ebook2;

public class datamodel {

    int image;
    String buku,penulis;

    public datamodel(int image, String buku, String penulis) {
        this.image = image;
        this.buku = buku;
        this.penulis = penulis;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

}
