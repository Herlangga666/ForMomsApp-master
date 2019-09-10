package com.example.formoms.Care;

public class Baby {
    private String judul, isi;
    private int pic;

    public Baby(String judul, String isi, int pic) {
        this.judul = judul;
        this.isi = isi;
        this.pic = pic;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
