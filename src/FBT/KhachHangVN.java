package FBT;

public class KhachHangVN extends KhachHang {
    public String doiTuong;

    public KhachHangVN(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KhachHangVN(int id, String fullName, String date, int soLuong, double donGia, String doiTuong) {
        super(id, fullName, date, soLuong, donGia);
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public int thanhTien(int donGia) {
        if (soLuong < 50)
            return soLuong * 1000;
        else if (soLuong < 100)
            return (soLuong - 50) * 1200 + 50 * 1000;
        else if (soLuong > 100 && soLuong < 200)
            return (soLuong - 200) * 1500 + 50 * 1000;

        return donGia;
    }
}
