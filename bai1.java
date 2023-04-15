import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class bai1 {
    public static void main(String[] args) {
        
 /*1 */   //nhap vao 1 so tu ban phím va tính tổng các chữ 
    //so do va xuat ra man hinh
    //vi du 58=> 5+8
    //cach 1:
        // System.out.println("Nhap so nguyen");
        // int a=sc.nextInt();
        // int tong=0;
        // while(a>0){
        //     tong=tong+(a%10);
        //     a=a/10;
        // }
        //System.out.println("tong cac so la: "+tong);
    //cach 2
        /*Khai bao mang trong java
        * String [] chuoi;
        * int ks[];
        */
        // char [] chuoi;
        // String s;
        // System.out.println("Nhap so nguyen");
        // s=sc.next();
        // chuoi=s.toCharArray();
        // int tong1=0;
        // for(int i=0;i<chuoi.length;i++){
            //     tong1=tong1+Character.getNumericValue(chuoi[i]);//ép kiểu char
            // }System.out.println(tong1);
     /*2 */       // System.out.println("Nhap ngay trong tuan tu 0 den 6");
            // int ngay=sc.nextInt();
            // switch(ngay){
                //     case 0:System.out.println("Chu Nhat");break;
                //     case 1:System.out.println("Thu hai");break;
                //     case 2:System.out.println("Thu Ba");break;
                //     case 3:System.out.println("Thu Tu");break;
                //     case 4:System.out.println("Thu Nam");break;
                //     case 5:System.out.println("Thu Sau");break;
                //     case 6:System.out.println("Thu Bay");break;
                //     default:System.out.println("Khong co thu"+ngay);
                // }
     /*3 */           //nhap vao nam sinh va cho biet neu duoi 10 tuoi 
                //duoi 10 tiểu học
                //tu 10-15 trung hoc
                //16-18 thpt
                //Tren 18 tuôi la đai hoc
                //sd switch case
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao nam sinh");
        int namSinh=sc.nextInt();
        int tuoi =2023-namSinh;
         switch(tuoi){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("Tieu Hoc");break;
            case 10: case 11: case 12: case 13: case 14: case 15:
                System.out.println("Trung Hoc Co So");break;
            case 16: case 17: case 18:
                System.out.println("Trung hoc pho thong");break;
            default: 
                System.out.println("Dai hoc");
         }
        

    }
}
