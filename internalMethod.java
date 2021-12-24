public class internalMethod {
    public static void main(String[] arg){
        // 같은 클래스 안에 있는 내부 메서드 호출
        print(); // 안녕
        
        int a = twice(3);
        System.out.println(a); // 6

        double b = sum(a, 5.8);
        System.out.println(b); // 11.8
    }

    public static void print(){
        System.out.println("안녕");
    }

    public static int twice(int k){
        return k*2;
    }

    public static double sum(int m, double n){
        return m+n;
    }
}
