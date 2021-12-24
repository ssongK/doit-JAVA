
class B{
    // 리턴 타입 void, 입력매개변수 없음
    void print(){
        System.out.println("안녕");
    }
    // 리턴 타입 int, 입력매개변수 없음
    int data(){
        return 3;
    }
    // 리턴 타입 double, 입력매개변수 2개
    double sum(int a, double b){
        return a+b;
    }
    // 리턴 타입 void, 입력매개변수 1개, 내부에 리턴 포함(함수종료)
    void printMonth(int m){
        if(m<0||m>12){
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m+"월 입니다.");
    }
}

public class exturnalMethod{
    public static void main(String[] arg){
        // 객체 생성
        B a = new B();
        // 메서드 호출(멤버 활용)
        a.print(); // 안녕
        int k = a.data(); 
        a.data(); 
        System.out.println(k); // 3
        double result = a.sum(3,5.2);
        System.out.println(result); // 8.2
        a.printMonth(5); // 5월 입니다.
        a.printMonth(15); // 잘못된 입력
    }
}
