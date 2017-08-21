import java.lang.reflect.Field;

/**
 * Created by lenovo on 2017/5/10.
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz){

        String strName = "水果名称：";
        String strColor = "水果颜色：";
        String strAddress = "产地：";

        Field[] fields = clazz.getDeclaredFields();

        for(Field field:fields){
            if(field.isAnnotationPresent(FuitName.class)){
                FuitName name = field.getAnnotation(FuitName.class);
                strName += name.name();
                System.out.println(strName);
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor color = field.getAnnotation(FruitColor.class);
                System.out.println(strColor+color.fruitColor());

            }else if(field.isAnnotationPresent(FruitProvider.class)){
                System.out.println(field.getAnnotation(FruitProvider.class).address());
            }

        }


    }

    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}
