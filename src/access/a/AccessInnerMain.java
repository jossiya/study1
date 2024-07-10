package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default

        data.defaultField = 2;
        data.defaultFieldMethod();

        //private 호출 불가
//        data.privateFeild = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
