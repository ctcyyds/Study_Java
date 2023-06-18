package Demo;

public class Student {
    private String name;
    private String age;

    public Student() {//无参构造
    }

    public Student(String name, String age) {//带参构造
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
