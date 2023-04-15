import java.util.Scanner;

//khoi tao lop sinh vien gồm msv, ho ten, diem
//xây dựng phuong thuc nhap, xuất
//nhap vao so luong sinh vien của 1 lop va nhap tt, xuat
//dua ra diem cao nhat (có cùng điểm cao nhất...)
public class sinhVien {
    private int msv;
    private String hoTen;
    private int diem;

    public sinhVien(int msv, String hoTen, int diem) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.msv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap diem sinh vien: ");
        this.diem = sc.nextInt();
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma sinh vien: "+this.msv);
        System.out.println("Ho ten sinh vien: "+this.hoTen);
        System.out.println("Diem sinh vien: "+this.diem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        sinhVien sv[] = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            sv[i] = new sinhVien(0, "", 0);
            sv[i].nhap();
        }
        System.out.println("\tDanh sach sinh vien");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sinh vien " + (i + 1) + " : ");
            sv[i].xuat();
        }
        int diemmax = sv[0].diem;
        for (int i = 0; i < n; i++) {
            if (sv[i].diem > diemmax) {
                diemmax = sv[i].diem;
            }
        }
        String ten=" ";
        for (int i = 0; i < n; i++) {
            if (sv[i].diem == diemmax) {
                ten=sv[i].hoTen;
                System.out.println("Sinh vien co diem cao nhat: "+ten);
            }
        }
    }
}
