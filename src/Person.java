/**
 * Created by lenovo on 2017/5/9.
 */
public class Person {

    public enum Season{
        Spring("春"),Summer("夏"),Autumn("秋"),Winner("冬");

        private String name;

        Season(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private String name;

    private String sex;

    public Person(String name,String sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))
            return false;
        Person pp = (Person)obj;
        if(this.name .equals(pp.getName()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.sex.hashCode();
    }
}
