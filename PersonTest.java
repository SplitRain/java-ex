public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();

        p1.name = "田所浩二";
        p1.age = 22;
        p1.sex =1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name+"的新年龄为"+newAge);
        System.out.println(p1.age);



        Person p2 = new Person();
        p2.name = "远野";
        p2.age = 22;
        p2.sex = 1;
        p2.study();
        System.out.println(p2.age);
        System.out.println(p2.name+"和"+p1.name+"在天台上晒太阳");
    }
