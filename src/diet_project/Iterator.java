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


        System.out.println(word + "의 목록 : " + kiosk.get(word));
        System.out.println("가장 적은 칼로리의 음식은 " + minKey + "입니다");

        System.out.println("추가적인 정보를 보고 싶으시면 \"더보기\"나 음식 이름 을 입력해주세요.");


        Scanner scanner = new Scanner(System.in);
        String more = scanner.next();
        if ((more).equals("더보기")) {
            for(int i=0;  i<kiosk.get(word).size();i++){
                System.out.println(kiosk.get(word).get(i)+" 의 칼로리 는 :"+kioskMore.get(kiosk.get(word).get(i))+" Kcal");
            }
        }
        if ((word).equals("한식")){
            switch ((more)) {
                case "고기" -> System.out.println((kioskMore.get("고기") + "Kcal"));
                case "밥" -> System.out.println((kioskMore.get("밥") + "Kcal"));
                case "김치볶음밥" -> System.out.println((kioskMore.get("김치볶음밥") + "Kcal"));
                case "미역국" -> System.out.println((kioskMore.get("미역국") + "Kcal"));
                case "제육덮밥" -> System.out.println((kioskMore.get("제육덮밥") + "Kcal"));
                case "떡볶이" -> System.out.println((kioskMore.get("떡볶이") + "Kcal"));
            }

        }
        if ((word).equals("일식")) {
            switch ((more)) {
            case "초밥" -> System.out.println((kioskMore.get("초밥") + "Kcal"));
            case "우동" -> System.out.println((kioskMore.get("우동") + "Kcal"));
            case "소바" -> System.out.println((kioskMore.get("소바") + "Kcal"));
            case "돈카츠" -> System.out.println((kioskMore.get("돈카츠") + "Kcal"));
            case "타코야끼" -> System.out.println((kioskMore.get("타코야끼") + "Kcal"));
            case "오코노미야끼" -> System.out.println((kioskMore.get("오코노미야끼") + "Kcal"));
            }
        }
        if ((word).equals("중식")) {
            switch ((more)) {
                case "짜장면" -> System.out.println((kioskMore.get("짜장면") + "Kcal"));
                case "짬뽕" -> System.out.println((kioskMore.get("짬뽕") + "Kcal"));
                case "탕수육" -> System.out.println((kioskMore.get("탕수육") + "Kcal"));
                case "유린기" -> System.out.println((kioskMore.get("유린기") + "Kcal"));
                case "동파육" -> System.out.println((kioskMore.get("동파육") + "Kcal"));
            }

        }
        if ((word).equals("양식")) {
            switch ((more)) {
                case "햄버거" -> System.out.println((kioskMore.get("햄버거") + "Kcal"));
                case "피자" -> System.out.println((kioskMore.get("피자") + "Kcal"));
                case "파스타" -> System.out.println((kioskMore.get("파스타") + "Kcal"));
                case "바비큐" -> System.out.println((kioskMore.get("바비큐") + "Kcal"));
                case "핫도그" -> System.out.println((kioskMore.get("핫도그") + "Kcal"));
                case "리조또" -> System.out.println((kioskMore.get("리조또") + "Kcal"));
            }

        }




    }


}
