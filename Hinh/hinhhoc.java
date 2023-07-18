package Hinh;

//Tạo 1 packages có tên là Hinh
//Trong packages tạo 1 lớp có tên là hinhhoc với 
//  - thuộc tính chieudai, chieurong
//  - phương thưcs: Khởi tạo , nhập thông tin, xuất thông tin, xác định xem nhập vào là hình hình chữ nhật hay hình vuông 
//Bên ngoài packages
//  Tạo 1 lơp HinhVuong
//   Thêm phương thức tính chu vi diện tích hình vuông
import java.util.Scanner;

public class hinhhoc {
    public int chieuDai;
    public int chieuRong;

    public hinhhoc(){}
    public hinhhoc(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        chieuRong = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Chieu dai : " + chieuDai);
        System.out.println("Chieu dai : " + chieuRong);
    }

    public void ktHinh() {
        if (chieuDai == chieuRong) {
            double goc = Math.toDegrees(Math.atan(chieuDai / chieuRong));
            if (goc == 90) {
                System.out.println("Tam giac này la hinh vuong");
            } else {
                System.out.println("Tam giac nay không phai la hinh vuong");
            }
        }else {
            System.out.println("Tam giac nay khong phai la hinh vuong.");
        }
    }
    public static void main(String[] args) {
        hinhhoc h1 = new hinhhoc(12, 6);
        h1.nhap();
        h1.xuat();
        h1.ktHinh();
    }
}
