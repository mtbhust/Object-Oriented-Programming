package Bai2;
public class Car {
    private int maSoChuyen;
    private String taiXe;
    private String soXe;
    private int doanhThu;

    public Car (int maSoChuyen, String taiXe, String soXe, int doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.taiXe = taiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public void xuat(){
        String a = String.format("%d %s %s ", maSoChuyen, taiXe, soXe);
        System.out.println(a);
    }

    public int getMaSoChuyen () {
        return maSoChuyen;
    }

    public void setMaSoChuyen (int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getTaiXe () {
        return taiXe;
    }

    public void setTaiXe (String taiXe) {
        this.taiXe = taiXe;
    }

    public String getSoXe () {
        return soXe;
    }

    public void setSoXe (String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu () {
        return doanhThu;
    }

    public void setDoanhThu (int doanhThu) {
        this.doanhThu = doanhThu;
    }
}

