import java.util.HashSet;
import java.util.Set;

public class HSet {
    public static void main(String[] args) {
        Set<String> setDemo=new HashSet<String>();
        setDemo.add("Java");
        setDemo.add("Python");
        setDemo.add("Java");
        setDemo.add("PHP");
        setDemo.add("C");
        System.out.println("So phan tu cua set:"+setDemo.size());
        System.out.println("Cac phan tu cua set:"+setDemo);
        System.out.println("Set co chua java khong:"+setDemo.contains("Java"));
        System.out.println("Set co chua C++ khong: "+setDemo.contains("C++"));
    }
}
