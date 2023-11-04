
public class stu {
    private float age;
    private char name;

    public stu(float age, char name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "stu{" + "age=" + age + ", name=" + name + '}';
    }

    public float getAge() {
        return age;
    }

    public char getName() {
        return name;
    }
    
    
}
