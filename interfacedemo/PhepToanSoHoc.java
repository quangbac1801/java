package interfacedemo;

public interface PhepToanSoHoc {
    public double cong(double n1,double n2);
    public double tru(double n1,double n2);
    public double nhan(double n1,double n2);
    public double chia(double n1,double n2);
}

class PhepToan implements PhepToanSoHoc{
    public double cong(double n1,double n2){
        return (n1+n2);
    }
    public double tru(double n1,double n2){
        return (n1-n2);
    }
    public double nhan(double n1,double n2){
        return (n1*n2);
    }
    public double chia(double n1,double n2){
        double temp=0;
        if(n2==0){
            System.out.println("Phep toan chia cho 0");
        }else{
            temp=n1/n2;
        }
        return temp;
    }
}
class thucThi{
    public static void main(String[] args) {
        PhepToan pt=new PhepToan();
        System.out.println("Phep Cong = "+pt.cong(6, 8));
        System.out.println("Phep Tru = "+pt.tru(6, 8));
        System.out.println("Phep Nhan = "+pt.nhan(6, 8));
        System.out.println("Phep Chia = "+pt.chia(6, 8));

    }
}
