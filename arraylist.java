import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    //xây dựng 1 lớp có các phương thức như sau:
    //Nhập: cho phép người dùng thêm mới 1 phần tử vào arraylist
    //Hiển thị: Cho phép hiển thị danh sách arraylist
    //Xóa : cho phép nhập vào một thứ tự hoặc tên của phần tử và xóa 
    ArrayList<String> list=new ArrayList<>();

    // public void add(){
    //     String itemlist;
    //     Scanner sc=new Scanner(System.in);
    //     itemlist=sc.nextLine();
    //     this.list.add(itemlist);
    // }
    public void add(String item) {
        list.add(item);
    }
    // public void out(){
    //     for(int i=0;i<list.size();i++){
    //         System.out.println(list.get(i));
    //     }
    // }
    public void display() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            System.out.println("Danh sách các phần tử: ");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
    //xóa theo chỉ số
    public void remove(String input) {
        for (int j = 0; j <list.size(); j++) {
            list.remove(input);
        }
    }
    //xóa theo tên
    public void xoatheoten(String c){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==c){
                list.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        arraylist arrList=new arraylist();
        Scanner sc=new Scanner(System.in);
        String input;

        System.out.println("Nhap cac phan tu vao danh sach(Nhan enter de dung lai): ");
        do {
            input = sc.nextLine();
            if (!input.isEmpty()) {
                arrList.add(input);
            }
        } while (!input.isEmpty());

        arrList.display();

        System.out.print("Nhap phan tu muon xoa: ");
        input = sc.nextLine();
        arrList.remove(input);
        arrList.display();

    // String c=sc.next();
    // while(c!="1"){
    //     arl1.add();
    //     c=sc.next();
    // }
       // arl1.out();
    }
}
