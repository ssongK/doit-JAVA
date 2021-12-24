class A {   // 클래스 생성
    int m = 3;   // 필드
    int n = 4;   // 필드
    void work1(){  
        int k = 5;   // 지역 변수
        System.out.println(k);   // 5
        work2(3);
    }
    void work2(int i){
        int j = 4;
        System.out.println(i + j); // 7
    }
}
public class classCreate{
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.m);  // 3
        System.out.println(a.n);  // 4
        a.work1();
    }
}