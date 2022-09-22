package FBT;

public class KhachHang {
    public int id;
    public String fullName;
    public String date;
    public int soLuong;
    public double donGia;

    public KhachHang() {

    }

    public KhachHang(int id, String fullName, String date, int soLuong, double donGia) {
        this.id = id;
        this.fullName = fullName;
        this.date = date;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int thanhTien(int donGia){
        return soLuong*donGia;
    }
}
