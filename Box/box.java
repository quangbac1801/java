package Box;

import java.util.Scanner;

public class box {
    // Bài Tập
    /*
     * Xây dựng lớp box với các thuộc tính
     * chiều dài, chiều rộng, chiều cao
     * xây dựng pt khởi tạo và pt nhập
     * xây dựng pt tính thể tích
     * 
     * xây dựng lớp lập phương kế thừa từ lớp box
     * xây dựng pt khởi tạo của lớp lp
     * xây dựng pt tính thể tích của lp
     */
    private double chieuRong;
    private double chieuDai;
    private double chieuCao;

    public box(double chieuRong, double chieuDai, double chieuCao) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
        this.chieuCao = chieuCao;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu Rong: ");
        chieuRong = sc.nextDouble();
        System.out.println("Nhap chieu Dai: ");
        chieuDai = sc.nextDouble();
        System.out.println("Nhap chieu Cao: ");
        chieuCao = sc.nextDouble();
    }

    public double tinhTheTich() {
        return this.chieuRong * this.chieuDai * this.chieuCao;
    }
}

class lapPhuong extends box {
    int canh;

    lapPhuong(int canh) {
        // gọi pt từ lớp cha
        super(canh, canh, canh);
    }

    public double tinhthetich() {
        return Math.pow(this.canh, 3);
    }

    public static void main(String[] args) {
        lapPhuong lp = new lapPhuong(8);
        lp.nhap();
        lp.tinhTheTich();
    }
}
