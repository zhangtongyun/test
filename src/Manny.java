import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2017/5/9.
 */
public class Manny {

    public Integer getNum(String str,Integer... value){
        Integer sum = 0;
        Integer.valueOf(1);
        for(Integer i:value){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Manny ma = new Manny();

//        List<Person> list1 = new ArrayList();
//        list1.add(new Person("张三","男"));
//        list1.add(new Person("李四","男"));
//        list1.add(new Person("王五","女"));
//        list1.add(new Person("张三","男"));
//        list1.add(new Person("张三","女"));
//
//        Set<Person> set = new HashSet<Person>(list1);
//
//        for(Person pp:set){
//            System.out.println(pp.getName()+":"+pp.getSex());
//        }

        System.out.println(Person.Season.Spring.getName());


    }
}
