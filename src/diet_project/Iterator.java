package diet_project;




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

          if ((word).equals("한식")){
            if ((more).equals("고기")){
            System.out.println((kioskMore.get("고기")+"Kcal"));
            }

            if ((more).equals("밥")){
            System.out.println((kioskMore.get("밥")+"Kcal"));
            }

            if ((more).equals("김치")){
            System.out.println((kioskMore.get("김치")+"Kcal"));
            }
        }
        if ((word).equals("일식")) {
            if ((more).equals("초밥")) {
                System.out.println((kioskMore.get("초밥") + "Kcal"));
            }
            if ((more).equals("우동")) {
                System.out.println((kioskMore.get("우동") + "Kcal"));
            }
            if ((more).equals("돈가쓰")) {
                System.out.println((kioskMore.get("우동") + "Kcal"));
            }
        }
        if ((word).equals("중식")) {
            if ((more).equals("탕수육")) {
                System.out.println((kioskMore.get("탕수육") + "Kcal"));
            }
            if ((more).equals("짜장면")) {
                System.out.println((kioskMore.get("짜장면") + "Kcal"));
            }

        }
        if ((word).equals("양식")) {
            if ((more).equals("햄버거")) {
                System.out.println((kioskMore.get("햄버거") + "Kcal"));
            }
            if ((more).equals("피자")) {
                System.out.println((kioskMore.get("피자") + "Kcal"));
            }

        }


    }


}

