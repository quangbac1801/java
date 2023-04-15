import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     /*1 */
        // String c="Hello World";
        // System.err.println(c);
        // int a=4,b=6;
        // System.out.println("a+b= "+(a+b));
        //sd cho phep nhap 
    /*2 */
        // System.out.println("Nhap 2 so e,d: ");
        // int e=nhap.nextInt();
        // int d=nhap.nextInt();
        // System.out.println("e+d= "+(e+d));
     /*3 */
        /*ví duj ép kiểu: - float f1=10.7f 
         *                  int i1=(int)f1;
         *                  String v="50";
                          int z=Interger.parseInt(v);
         */
        // String f=nhap.next();
        // String g=nhap.next();
        //System.out.println("f+g= "+(Integer.parseInt(f)+Integer.parseInt(g)));
    /*4 */
        //nhap 1 so tu ban phim, kiem tra chan le
        // System.out.println("Nhap a1= ");
        // int a1=nhap.nextInt();
        // if(a1%2==0){
        //     System.out.println("a1 chan");
        // }else{
        //     System.out.println("a1 le");
        // }
    /*5 */
        //Cho duong tron tam 0(10,20) va bán kính r=10
        //nhap vao toa độ 1 diem A bat ki tu ban phim, xem A nam tren, trong, ngoai dg tron
        int x0=10,y0=20,r=10;
        System.out.println("Nhap hoanh do diem A: ");
        int xA=sc.nextInt();
        System.out.println("Nhap tung do diem A: ");
        int yA=sc.nextInt();
        double d= Math.sqrt(Math.pow(x0-xA,2)+Math.pow(y0-yA,2));
        if(r==d)
            System.out.println("Diem A nam tren duong tron");
        else if(r>d) 
            System.out.println("Diem A nam trong duong tron");
        else 
            System.out.println("Diem A nam ngoai duong tron");  
        
    }
}