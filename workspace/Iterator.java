package data.struct.workspace;


import java.util.*;

public class Iterator extends kiosk {
    public Iterator(Map<String, List<String>> kiosk, TreeMap<String, Integer> kioskMore,String minKey, int minValue, String word) {
        super();
        for (Map.Entry<String, Integer> entry : kioskMore.entrySet() ) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
    }




        System.out.println(word + "의 목록 " + kiosk.get(word) + "입니다");
        System.out.println("가장 적은 칼로리의 음식은 " + minKey + "입니다");

        System.out.println("추가적인 정보를 보고 싶으시면 \"더보기\"을 입력해주세요.");


        Scanner scanner = new Scanner(System.in);
        String more = scanner.next();
        if ((more).equals("더보기")) {
            for(int i=0;  i<kiosk.get(word).size();i++){
                System.out.println(kiosk.get(word).get(i)+" 의 칼로리는 :"+kioskMore.get(kiosk.get(word).get(i))+" Kcal");
            }
        }

    }


}
