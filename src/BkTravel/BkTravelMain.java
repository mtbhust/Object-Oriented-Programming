package Bai2;
import java.util.*;
public class BkTravelMain {
    static Scanner input = new Scanner(System.in);
    ArrayList<Object> carList;
    static int doanhThu1;
    static int doanhThu2;
    public BkTravelMain() {
        this.doanhThu1 = 0;
        this.doanhThu2 = 0;
        carList = new ArrayList<Object>();
    }

    public void nhap() {
        System.out.println("Nhap thong tin xe: ");
        System.out.println("1. Xe noi thanh");
        System.out.println("2. Xe ngoai thanh");

        if ( Integer.parseInt(input.nextLine()) == 1) {
            System.out.println("MaSoChuyen: ");
            int maSoChuyen = Integer.parseInt(input.nextLine());
            System.out.println("Ten Tai Xe ");
            String taiXe = input.nextLine();
            System.out.println("so xe: ");
            String soXe = input.nextLine();
            System.out.println("so tuyen: ");
            int soTuyen = Integer.parseInt(input.nextLine());
            System.out.println("kmDiDuoc: ");
            int kmDiDuoc = Integer.parseInt(input.nextLine());
            System.out.println("Doanh Thu: ");
            int doanhThu = Integer.parseInt(input.nextLine());
            xeNoiThanh temp = new xeNoiThanh(maSoChuyen, taiXe, soXe,
                    doanhThu , soTuyen, kmDiDuoc);
            carList.add(temp);
            this.doanhThu1 += doanhThu;
        }
        else {
            System.out.println("MaSoChuyen: ");
            int maSoChuyen = Integer.parseInt(input.nextLine());
            System.out.println("Ten Tai Xe ");
            String taiXe = input.nextLine();
            System.out.println("so xe: ");
            String soXe = input.nextLine();
            System.out.println("Noi Den: ");
            String noiDen = input.nextLine();
            System.out.println("soNgayDiDuoc: ");
            int soNgayDiDuoc = Integer.parseInt(input.nextLine());
            System.out.println("Doanh Thu: ");
            int doanhThu = Integer.parseInt(input.nextLine());
            xeNgoaiThanh temp = new xeNgoaiThanh(maSoChuyen, taiXe, soXe, doanhThu, noiDen, soNgayDiDuoc);
            carList.add(temp);
            this.doanhThu2 += doanhThu;
        }
    }
    public void xuat () {
        System.out.println("Danh sach cac chuyen xe: ");
        int count = 1;
        for(Object object: carList) {
            System.out.print(count + ". ");
            if (object.getClass() == xeNoiThanh.class) {
                xeNoiThanh temp = (xeNoiThanh) object;
                temp.xuat();
            }
            else {
                xeNgoaiThanh temp = (xeNgoaiThanh) object;
                temp.xuat();
            }

            count ++;
        }
    }
    public void tongDoanhThu(){
        System.out.println("xe Noi Thanh co doanh thu: "+ doanhThu1);
        System.out.println("xe Ngoai Thanh co doanh thu: "+ doanhThu2 );
    }
    public static void main (String[] args) {
        BkTravelMain BkTravel = new BkTravelMain();
        int conti = 1;
        while (conti == 1) {
            BkTravel.nhap();
            System.out.println("Ban co muon tiep tuc nhap? (1/0)");
            conti = Integer.parseInt(input.nextLine());
        }
        BkTravel.xuat();
        BkTravel.tongDoanhThu();
    }
}
