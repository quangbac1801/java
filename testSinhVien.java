import java.util.Scanner;

// Khai báo một lớp  sinhvien
// thuộc tính hoten,sdt,diachi
// viết 2 phương thức nhập và xuất danh sách
class SinhVien {
    // khai báo thuộc tính
    private String hoTen;
    private String sdt;
    private String diaChi;

    // hàm constructor
    public SinhVien(String hoTen, String sdt, String diaChi) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public void nhap() { // phuong thuc nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap sdt sinh vien: ");
        sdt = sc.nextLine();
        System.out.print("Nhap dia chi sinh vien: ");
        diaChi = sc.nextLine();
    }

    public void xuat() { // phuong thuc xuat
        System.out.println(hoTen + " - " + sdt + " - " + diaChi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien dsSinhVien[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            dsSinhVien[i] = new SinhVien("", "", "");
            dsSinhVien[i].nhap();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sinh vien thu " + (i + 1) + ":");
            dsSinhVien[i].xuat();
        }
    }
}
