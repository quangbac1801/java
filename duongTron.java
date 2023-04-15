import java.util.Scanner;

public class duongTron {
    // khai báo 1 lớp đường tròn
    // có 2 thuộc tính là tọa độ tâm và bán kính
    // phương thức nhập :tọa độ tâm và bán kính
    // phương thức xuất để in ra tâm và bán kính đã nhập
    // xây dựng 1 phương thức cho phép nhập vào một điểm.Xem điểm đó nằm trên ,
    // trong hay ngoài đường tròn
    // xây dựng phương thức xem 2 đường tròn có giao nhau không
    private double x;
    private double y;
    private double banKinh;

    public duongTron() {
    }

    public duongTron(double x, double y, double banKinh) {
        this.x = x;
        this.y = y;
        this.banKinh = banKinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoang do x: ");
        this.x = sc.nextDouble();
        System.out.print("Nhap tung do y: ");
        this.y = sc.nextDouble();
        System.out.print("Nhap ban kinh: ");
        this.banKinh = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Toa do tam: (" + this.x + "," + this.y + ")");
        System.out.println("Ban kinh: " + this.banKinh);
    }

    public void KhoangCach() {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Nhap toa do diem bat ki---");
        System.out.print("Nhap hoang do x1 : ");
        double x1=sc.nextDouble();
        System.out.print("Nhap hoang do y1 : ");
        double y1=sc.nextDouble();
        double d = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        if (d == banKinh) {
            System.out.println("Diem nam tren duong tron");      
        } else if (d < banKinh) {
            System.out.println("Diem nam trong duong tron");
        } else {
           System.out.println( "Diem nam ngoai duong tron");
        }
    }

    // Phương thức kiểm tra 2 đường tròn có giao nhau không r1>=d/2 || r2>=d/2
    public boolean KtGiaoNhau(duongTron dt) {
        double d = Math.sqrt(Math.pow(x - dt.x, 2) + Math.pow(y - dt.y, 2));
        System.out.println(d);
        if (d<=banKinh+dt.banKinh) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        duongTron Duongtron = new duongTron();
        Duongtron.nhap();
        Duongtron.xuat();
        Duongtron.KhoangCach();
        System.out.println("Nhap duong tron thu 2 ");
        duongTron Duongtron2 = new duongTron();
        Duongtron2.nhap();
        Duongtron2.xuat();
        if (Duongtron.KtGiaoNhau(Duongtron2)) {
            System.out.println("Hai duong tron giao nhau");
        } else {
            System.out.println("Hai duong tron không giao nhau");
        }
    }

}
