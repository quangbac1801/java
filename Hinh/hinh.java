package Hinh;

//Lớp trừu tượng abstract
public abstract class hinh {
    public String tenHinh;

    public hinh() {
    }

    public hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract double tinhChuVi();

    public abstract double tinhDienTich();

}

class HinhChuNhat extends hinh {
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat() {
        super(); // Gọi đến hàm tạo cha gần nhaats
    }

    public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong) {
        super(tenHinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return (chieuDai * chieuRong);
    }
}

class HinhTron extends hinh {
    public double banKinh;

    public HinhTron() {
        super();
    }

    public HinhTron(String tenHinh, double banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return banKinh * 2 * Math.PI;
    }

    public double tinhDienTich() {
        return banKinh*banKinh * Math.PI;
    }

}
class thucThi{
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat("hcn", 3, 4);
        double cvHcn=hcn.tinhChuVi();
        double dtHcn=hcn.tinhDienTich();
        System.out.println("Ket qua thuc thi la: ");
        System.out.println("Chu vi HCN= "+cvHcn);
        System.out.println("Dien tich HCN= "+dtHcn);
    }
}
