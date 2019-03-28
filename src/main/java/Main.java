import com.thoughtworks.collection.Filter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 苏晓风 on 2019/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 1, 1, 2, 3};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] result = new Integer[]{1, 2, 3};
        List<Integer> resultList = Arrays.asList(result);

        Filter filter = new Filter(arrayList);

        List<Integer> myList =  filter.getDifferentElements();
        for(Integer i: myList){
            System.out.println(i);
        }
    }
}
