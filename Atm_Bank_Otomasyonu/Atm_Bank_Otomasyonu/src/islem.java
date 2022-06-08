
public class islem {

    private String islemTarihi;
    private String acıklama;
    private String tutar;
    private  int bakiye;

    public islem(String islemTarihi, String acıklama, String tutar, int bakiye) {
        this.islemTarihi = islemTarihi;
        this.acıklama = acıklama;
        this.tutar = tutar;
        this.bakiye = bakiye;
    }

    public String getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(String islemTarihi) {
        this.islemTarihi = islemTarihi;
    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        this.tutar = tutar;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    

}
