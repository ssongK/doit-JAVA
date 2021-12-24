import java.util.Arrays;
public class differenceParameterDatatype{
    public static void main(String[] arg){
        // 기본 자료형 매개변숫값의 변화
        int a=3;
        int result1=twice(3);
        System.out.println(result1); // 6
        int result2=twice(a);
        System.out.println(result2); // 6
        System.out.println(a); // 3

        // 참조 자료형 매개변숫값의 변화
        int[] array = new int[] {1,2,3};
        modifyData(array);
        printArray(array);
    }
    public static int twice(int a){
        a *= 2;
        return a;
    }

    public static void modifyData(int[] a){
        a[0]=4;
        a[1]=5;
        a[2]=6;
    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}