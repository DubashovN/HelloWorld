package thirdTask;

public class Person {
    private int age;
    private Sex sex;
    private String name;

    public Person(int age, Sex sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
