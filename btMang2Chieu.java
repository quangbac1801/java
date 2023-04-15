import java.util.Scanner;

public class btMang2Chieu {
    public static void main(String[] args) { 
        //Nhap vao so luong sinh vien cua 1 lop
        //nhap vao ho ten, diem toan,van,ngoai ngu cho tung sinh vien  
        //xuat bang diem cua lop 
        //xuat mang ra gom 2 cot ten sinh vien+diem trung binh
        //tim sinh vien co diem trung binh cao nhat

        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong=sc.nextInt(); 
        //Khai bao mang Sinh Va nhap thong tin cho tung sinh vien
        String sinhVien[][]=new String[soLuong][4]; 
        sc.nextLine();
        for(int i=0;i<soLuong;i++){
                System.out.println("Nhap ten sinh vien thu "+(i+1)+":");
                sinhVien[i][0]=sc.nextLine();
                System.out.println("Nhap diem toan cua sinh vien thu "+(i+1)+":");
                sinhVien[i][1]=sc.nextLine();
                System.out.println("Nhap diem van cua sinh vien thu "+(i+1)+":");
                sinhVien[i][2]=sc.nextLine();
                System.out.println("Nhap diem ngoai ngu cua sinh vien thu "+(i+1)+":");
                sinhVien[i][3]=sc.nextLine();
            }
            //xuat bang diem 
            System.out.println("--------------");
            System.out.println("  Diem Sinh Vien   ");
            System.out.println("--------------");
            System.out.println("Ten \tToan \tVan \tNgoai ngu");
            for(int i=0;i<soLuong;i++){
                System.out.println(sinhVien[i][0] + "\t" + sinhVien[i][1] + "\t" + sinhVien[i][2] + "\t" + sinhVien[i][3]);
            }
            //xuat bang diem trung binh cua sinh vien
             double dtbSV[]=new double[soLuong];
            System.out.println("Ten \tDiem Trung Binh");
            for(int i=0;i<soLuong;i++){
                 dtbSV[i]=(Double.parseDouble(sinhVien[i][1])+Double.parseDouble(sinhVien[i][2])+Double.parseDouble(sinhVien[i][3]))/3;
                    System.out.println(sinhVien[i][0]+"\t"+dtbSV[i]);               
            }
            //tim dtb cao nhat
            double max=0;
            for(int i=0;i<soLuong;i++){
                if(dtbSV[i]>max){
                    max= dtbSV[i];
                }
            }
            for(int i=0;i<soLuong;i++){
                if(dtbSV[i]==max){
                    System.out.println("Sinh vien co DTB cao nhat la "+sinhVien[i][0]+" voi DTB="+max); 
                }
            }
     // in ra hàng sinh viên bất kì khi nhap ten sinh vien (một kí tự trong tên)  
     System.out.println("Nhap sinh vien can tim kiem");  
     String hoTen=sc.nextLine();  
     for(int i=0;i<soLuong;i++){
            if(sinhVien[i][0].contains(hoTen)){
                    System.out.println(sinhVien[i][0]+"-"+sinhVien[i][1]+"-"+sinhVien[i][2]+"-"+sinhVien[i][3]);
            }
     }
    }
}
