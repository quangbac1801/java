import java.util.Scanner;

public class diem {
    /*
     * 2
     * xay dựng lớp điểm với các thông số
     * các thuộc tinhs: tọa độ x,y
     * xây dựng pt khởi tạo, nhập cho lớp điểm
     * 
     * xây dựng lớp tam giác kế thừa lớp điểm
     * xây dựng pt nhap,tính chu vi, diện tích tam giác
     */
    int x;
    int y;

    public diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do x : ");
        this.x = sc.nextInt();
        System.out.println("Nhap toa do y : ");
        this.y = sc.nextInt();
    }
}

class tamgiac {
    diem d1, d2, d3;
    double []canh;
    public void nhap() {
        d1.nhap();
        d2.nhap();
        d3.nhap();
    }

    public double chieuDaiCanh(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(d2.x - d1.x, 2) + Math.pow(d2.y - d1.y, 2));
    }

    public double chuViTamGiac() {
        return (chieuDaiCanh(d1.x, d2.x, d1.x, d2.y) + chieuDaiCanh(d2.x, d3.x, d2.y, d3.y)
                + chieuDaiCanh(d1.x, d3.x, d1.y, d3.y));
    }
    // tamgiac(){
    // diem d1,d2,d3;
    // }
}
