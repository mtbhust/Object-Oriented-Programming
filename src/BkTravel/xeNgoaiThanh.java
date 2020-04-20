package Bai2;
public class xeNgoaiThanh extends Car {
    private String noiDen;
    private int soNgayDiDuoc;
    public xeNgoaiThanh (int maSoChuyen, String taiXe, String soXe, int doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen () {
        return noiDen;
    }

    public void setNoiDen (String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc () {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc (int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
}


