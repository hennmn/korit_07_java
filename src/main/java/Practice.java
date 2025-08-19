import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();



        Map<String, Object> map = new HashMap<String, Object>();

        map.put("USER_ID", "AAA");

        map.put("PROG_ID", "KEBA1111");

        map.put("PROG_NAME", "KEBAKE");

        map.put("PHONE_NUM", "010-1111-1111");

        listMap.add(map);



        Map<String, Object> map1 = new HashMap<String, Object>();

        map1.put("USER_ID", "AAA");

        map1.put("PROG_ID", "KEBA2222");

        map1.put("PROG_NAME", "DANMALCH1");

        map1.put("PHONE_NUM", "010-2222-2222");



        listMap.add(map1);


        System.out.println(listMap);


        for (Map<String, Object> serMap : listMap) {
            serMap.entrySet().forEach(result -> System.out.println(result.getKey() + "=" + result.getValue())
            );
        }





    }
}
