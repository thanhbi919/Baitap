package lesson10;

public class SinhVien {
    private String MaSV;
    private String hoten;
    private int Diem;
    private String xeploai;

    public SinhVien(String maSV, String hoten, int diem) {
        MaSV = maSV;
        this.hoten = hoten;
        Diem = diem;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int diem) {
        Diem = diem;
    }

    public String getXeploai() {
        if(Diem>=8){
            xeploai ="giỏi";
        }else if(Diem>=7){
            xeploai= "khá";
        }else if(Diem>=5){
            xeploai="trung binh";
        }else{
            xeploai="yeu";
        }
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "MaSV='" + MaSV + '\'' +
                ", hoten='" + hoten + '\'' +
                ", Diem=" + Diem +
                ", xeploai='" + xeploai + '\'' +
                '}';
    }
}
