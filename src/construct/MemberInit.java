package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit(){ //생성자 필요

    }
    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
