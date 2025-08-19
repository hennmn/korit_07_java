import java.util.*;

/*
    name=홍길동
    rating=vip
    age=30
    name=김기영
    rating=gold
    age=35
 */

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> costomers = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        Map<String, Object> map2 = new HashMap<String, Object>();
        map1.put("name","홍길동");
        map1.put("rating","vip");
        map1.put("age",30);

        map2.put("name","김기영");
        map2.put("rating","gold");
        map2.put("age",35);

        costomers.add(map1);
        costomers.add(map2);


        for(Map<String, Object> customer : costomers) {
            customer.entrySet().forEach(result -> System.out.println(result.getKey() + "=" + result.getValue()));
        }

//        for (Map<String, Object> serMap : listMap) {
//            serMap.entrySet().forEach(result -> System.out.println(result.getKey() + "=" + result.getValue())
//            );
//        }


    }
}
