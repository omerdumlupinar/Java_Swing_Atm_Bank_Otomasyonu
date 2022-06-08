
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class islemeler {

    String kullanıcıAdı = "root";
    String parola = "";
    String url = "jdbc:mysql://localhost:3306/atm_otomasyon";
    Connection con = null;

    public static String islemler_KullaniciAdi;
    public static String islemler_Sifre;

    public void Baglanti() {
        try {
            con = DriverManager.getConnection(url, kullanıcıAdı, parola);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veri Tabanı Bağlantisi Kurulamadı");

        }
    }

    //Veri Tabanında  kullanıcı adi ile parolanın aynı kişiye ayıt olup olmadığını kontolr eder
    public String giris(String kadi, String parola) throws SQLException {
        String sorgu = "Select * from bilgi where Kullanici_Adi=? and Parola=?";
        PreparedStatement ps = con.prepareStatement(sorgu);
        ps.setString(1, kadi);
        ps.setString(2, parola);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return "basarili";

        } else {
            return "Giriş Bilgisi Hatalı\n Bilgileri Kontrol Ederek Tekrar Deyeyin.";
        }

    }

    //Güvenlik kodu formunun  başlığına ad soyad çekmek için 
    public String birlestir;

    public String Guvenlik_Ad_Soyad_Getir(String kullanici_Adi, String sifre) throws SQLException {
        String sorgu = "Select Ad,Soyad From bilgi WHERE Kullanici_Adi='" + kullanici_Adi + "' and Parola='" + sifre + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sorgu);

        while (rs.next()) {
            birlestir = "Sayın " + rs.getString("Ad") + " " + rs.getString("Soyad");
        }
        return birlestir;
    }

    //Giriş ekranında aldığımız kullanıcı adi ve parola parametresi ile giriş yapan kullanıcının adı ve soyadını çekmek için
    public String ad;
    public String soyad;
    public int HesapNo;
    public String bankaAd;
    public int bakiye;

    public int ikiyuz;
    public int yuz;
    public int elli;
    public int yirmi;
    public int on;
    public int bes;

    public void anaform_Bilgileri() throws SQLException {
        String sorgu = "Select *  From islemler INNER JOIN bilgi ON bilgi.Hesap_No=islemler.Hesap_NO "
                + " WHERE bilgi.Kullanici_Adi='" + islemler_KullaniciAdi + "' and bilgi.Parola='" + islemler_Sifre + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sorgu);

        while (rs.next()) {

            try {
                ad = rs.getString("Ad");
                soyad = rs.getString("Soyad");
                HesapNo = rs.getInt("Hesap_NO");
                bankaAd = rs.getString("Banka_Adi");
                bakiye = rs.getInt("Bakiye");

                ikiyuz = rs.getInt("banknot_ikiyuz");
                yuz = rs.getInt("banknot_yuz");
                elli = rs.getInt("banknot_elli");
                yirmi = rs.getInt("banknot_yirmi");
                on = rs.getInt("banknot_on");
                bes = rs.getInt("banknot_bes");

            } catch (NullPointerException e) {
                bakiye = 0;
            }

        }
    }

    //Giriş yapan kullanıcını işlem bilgileri
    public ArrayList<islem> islemGetir() throws SQLException {
        ArrayList<islem> islemelerList = null;
        String sorgu = "SELECT Islem_Tarihi,Aciklama,Tutar,Bakiye FROM islemler "
                + "INNER JOIN bilgi ON bilgi.Hesap_No = islemler.Hesap_NO where bilgi.Kullanici_Adi='" + islemler_KullaniciAdi + "' and bilgi.Parola='" + islemler_Sifre + "'";
        try {
            Baglanti();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sorgu);
            islemelerList = new ArrayList<>();
            while (rs.next()) {
                islemelerList.add(new islem(
                        String.valueOf(rs.getString("Islem_Tarihi")),
                        rs.getString("Aciklama"),
                        rs.getString("Tutar"),
                        rs.getInt("Bakiye")));
            }
        } catch (SQLException ex) {
            ex.getErrorCode();
        }

        return islemelerList;
    }

    public void islemEkle(String tarih, String aciklama, String tutar, int bakiyelist, int hesapNo) throws SQLException {
        String sorgu = "insert into islemler(Hesap_NO,Islem_Tarihi,Aciklama,Tutar,Bakiye) Values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sorgu);
        ps.setInt(1, hesapNo);
        ps.setString(2, tarih);
        ps.setString(3, aciklama);
        ps.setString(4, tutar);
        ps.setInt(5, bakiyelist);
        ps.execute();

    }

    public void banknot_ekle(int s_ikiyuz, int s_yuz, int s_elli, int s_yirmi, int s_on, int s_bes, int s_hesapno) throws SQLException {
        String sorgu = "UPDATE bilgi SET banknot_ikiyuz=?,banknot_yuz=?,banknot_elli=?,banknot_yirmi=?,banknot_on=?,banknot_bes=? WHERE Hesap_No='" + s_hesapno + "'";
        PreparedStatement ps = con.prepareStatement(sorgu);
        ps.setInt(1, s_ikiyuz);
        ps.setInt(2, s_yuz);
        ps.setInt(3, s_elli);
        ps.setInt(4, s_yirmi);
        ps.setInt(5, s_on);
        ps.setInt(6, s_bes);
        ps.execute();

    }

    //Havale Alan Kişinin Bilgileri
    public int havale_bakiye = 0;
    public String Havale_Banka_Adi = "";
    public int havale_ikiyuz = 0;
    public int havale_yuz = 0;
    public int havale_elli = 0;
    public int havale_yirmi = 0;
    public int havale_on = 0;
    public int havale_bes = 0;

    public void Havala_Alan_Bilgileri(int Havala_Alan_HesapNO) throws SQLException {
        String sorgu = "SELECT * FROM bilgi INNER JOIN islemler ON islemler.Hesap_No = bilgi.Hesap_NO where bilgi.Hesap_No='" + Havala_Alan_HesapNO + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sorgu);

        while (rs.next()) {
            Havale_Banka_Adi = rs.getString("Banka_Adi");

            havale_ikiyuz = rs.getInt("banknot_ikiyuz");
            havale_yuz = rs.getInt("banknot_yuz");
            havale_elli = rs.getInt("banknot_elli");
            havale_yirmi = rs.getInt("banknot_yirmi");
            havale_on = rs.getInt("banknot_on");
            havale_bes = rs.getInt("banknot_bes");

            havale_bakiye = Integer.parseInt(rs.getString("Bakiye"));
        }

    }

    public boolean Havale_hesap_Kontrol(int hesanpno) throws SQLException {
        String sorgu = "select * from bilgi where Hesap_No='" + hesanpno + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sorgu);

        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }

    public void havale_banknotlar(int gelenPara) {
        int para = gelenPara;

        int a = para / 200;
        havale_ikiyuz += a;
        para -= a * 200;
        if (havale_ikiyuz > 5) {
            para = para + (havale_ikiyuz - 5) * 200;
            havale_ikiyuz -= havale_ikiyuz - 5;
        }

        int b = para / 100;
        havale_yuz += b;
        para -= b * 100;
        if (havale_yuz > 10) {
            para = para + ((havale_yuz - 10) * 100);
            havale_yuz -= havale_yuz - 10;

        }

        int c = para / 50;
        havale_elli += c;
        para -= c * 50;
        if (havale_elli > 20) {
            para = para + ((havale_elli - 20) * 50);
            havale_elli -= havale_elli - 20;

        }

        int d = para / 20;
        havale_yirmi += d;
        para -= d * 20;
        if (havale_yirmi > 50) {
            para = para + ((havale_yirmi - 50) * 20);
            havale_yirmi -= havale_yirmi - 50;

        }

        int e = para / 10;
        havale_on += e;
        para -= e * 10;
        if (havale_on > 100) {
            para = para + ((havale_on - 100) * 10);
            havale_on -= havale_on - 100;

        }
        int f = para / 5;
        havale_bes += f;
        para -= f * 5;
        if (havale_bes > 200) {
            para = para + ((havale_bes - 200) * 5);
            havale_bes -= havale_bes - 200;

        }
    }

    public boolean Eft_hesap_Kontrol(int hesanpno, String banka_ad) throws SQLException {
        String sorgu = "select * from bilgi where Hesap_No='" + hesanpno + "' and Banka_Adi='" + banka_ad + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sorgu);

        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }
}
