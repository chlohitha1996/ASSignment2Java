class Member {
    String name;
    int age;
    double salary;
    Member(String n,int a,double s)
    {
        name=n;
        age=a;
        salary=s;
    }
}
public class MemberVariable {
    public static void main(String args[])
    {
        Member m=new Member("harry",34,2985.0);
        System.out.println("Members Name:"+m.name);
        System.out.println("Potters Members Age:"+m.age);
        System.out.println("Members salary:"+m.salary);

    }

}