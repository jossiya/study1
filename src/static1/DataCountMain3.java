package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + data1.count);
        Data3 data2= new Data3("B");
        System.out.println("B count=" + data2.count);
        Data3 data3 = new Data3("C");
        System.out.println("C count=" + data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //정적 변수의 경우 클레스로 접근을 하지 왠만하면 인스턴스로 접근을 하지 않는다.

        //클레스를 통한 접근
        System.out.println(Data3.count);

    }
}
