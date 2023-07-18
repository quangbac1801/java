import Hinh.hinhhoc;
public class hinhVuong extends hinhhoc {
    hinhVuong(){
        super();
    }
    public double ChuVi() {
        return this.chieuDai*4;
    }
    public double dienTich() {
        return this.chieuDai*chieuDai;
    }
    public static void main(String[] args) {
        hinhVuong hv=new hinhVuong();
        hv.nhap();
        hv.xuat();
        System.out.println("Dien tich hinh vuong = "+hv.dienTich());
        System.out.println("Chu vi hinh vuong= "+hv.ChuVi());
        hv.ktHinh();
    }
}
