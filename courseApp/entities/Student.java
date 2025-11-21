package courseApp.entities;

public class Student {
    private int id;
    private String ad;
    private String soyad;
    private int yash;
    private  String kurs;
    private  String username;
    private int password1;

    public  String getUsername() {
        return username;
    }

    public int getPassword1() {
        return password1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yash=" + yash +
                ", kurs=" + kurs +
                '}';
    }

    public Student( int id,String ad, String soyad, int yash,String username,int password) {
this.id=id;
        this.ad = ad;
        this.soyad = soyad;
        this.yash = yash;
this.username=username;
this.password1=password;
    }

    public String  getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public  String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYash() {
        return yash;
    }

    public void setYash(int yash) {
        this.yash = yash;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
