import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

public class bai4 {
    int msv;
    String hoten;
    int diem;

    public void bai4(int sv, String hoten, int diem) {
        this.msv = sv;
        this.hoten = hoten;
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        this.msv = sc.nextInt();
        System.out.println("Nhap ho ten");
        this.hoten = sc.nextLine();
        System.out.println("Nhap diem sinh vien");
        this.diem = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Danh sach sinh vien");
        System.out.println("Ma sinh vien: " + this.msv);
        System.out.println("Ho ten sinh vien: " + this.hoten);
        System.out.println("Diem sinh vien:" + this.diem);
    }

    public void diemmax(int n) {
        int max = 0;
        for (int i = 0; i > n; i++) {
            if (this.diem > max) {
                max = this.diem;
            }
        }
        System.out.println("Sinh vien co diem cao nhat" + this.hoten);

    }

    public static void main(String[] args) {
        // bai4 sv1=new bai4();
        // sv1.bai4(6378289, "Nguyen van a");
        // System.out.println(sv1.hoten);
        // sv1.nhap();
        // sv1.xuat();
        bai4 s[] = new bai4[2];
        for (int i = 0; i < 2; i++) {
            bai4 sv = new bai4();
            sv.nhap();
            s[i] = sv;
        }
        System.out.println("Danh sach sinh vien");
        for (int i = 0; i < 2; i++) {
            s[i].xuat();
        }
        int max = 0;
        String ten = "";
        for (int i = 0; i < 2; i++) {
            if (s[i].diem > max){
                max = s[i].diem;
            ten = s[i].hoten;
        }
    }

        System.out.println("Sinh vien co diem cao nhat: " + ten);
    }
    // khoi tao lop sinh vien gồm msv, ho ten, diem
    // xây dựng phuong thuc nhap, xuất
    // nhap vao so luong sinh vien của 1 lop va nhap tt, xuat
    // dua ra diem cao nhat
}
