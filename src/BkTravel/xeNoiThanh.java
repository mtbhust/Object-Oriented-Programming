package Bai2;
public class xeNoiThanh extends Car {
    private int soTuyen;
    private int kmDiDuoc;
    public xeNoiThanh (int maSoChuyen, String taiXe, String soXe, int doanhThu, int soTuyen, int kmDiDuoc) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.kmDiDuoc = kmDiDuoc;
    }

    public int getSoTuyen () {
        return soTuyen;
    }

    public void setSoTuyen (int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getKmDiDuoc () {
        return kmDiDuoc;
    }

    public void setKmDiDuoc (int kmDiDuoc) {
        this.kmDiDuoc = kmDiDuoc;
    }
}

