public class Student {
    private String sid;
    private String name;
    private String sex;
    private String age;
    private String location;

    public Student() {
    }

    ;

    public Student(String sid, String name, String sex, String age, String location) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.location = location;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
