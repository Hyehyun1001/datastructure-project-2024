package data.struct.workspace;

import java.util.*;


public class kiosk {
    public static void main(String[] args) {
        Map<String, List<String>> kiosk = new HashMap<>();
        TreeMap<String,Integer> kioskKR = new TreeMap<String,Integer>();
        TreeMap<String,Integer> kioskJP = new TreeMap<String,Integer>();
        TreeMap<String,Integer> kioskCH = new TreeMap<String,Integer>();
        TreeMap<String,Integer> kioskEN = new TreeMap<String,Integer>();

        TreeMap<String, Integer> information;

        List<String> listKR = Arrays.asList("고기", "밥", "김치");
        List<String> listJP = Arrays.asList("초밥","우동","돈가쓰");
        List<String> listCH = Arrays.asList("짜장면","탕수육");
        List<String> listEN = Arrays.asList("햄버거","피자");



        kiosk.put("한식",listKR);
        kiosk.put("일식",listJP);
        kiosk.put("중식",listCH);
        kiosk.put("양식",listEN);


        //KR
        kioskKR.put("고기",312);
        kioskKR.put("밥",31);
        kioskKR.put("김치",51);

        //JP
        kioskJP.put("초밥",62);
        kioskJP.put("우동",122);
        kioskJP.put("돈가쓰",111);

        //CH
        kioskCH.put("짜장면",222);
        kioskCH.put("탕수육",333);

        //EN
        kioskEN.put("햄버거",123);
        kioskEN.put("피자",1);

        String minKey = null;
        int minValue = Integer.MAX_VALUE;



        System.out.println("한식,일식,중식,양식 중 선택해주세요.");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        while (kiosk.get(word)==null) {
            System.out.println("잘못된 입력 입니다.");
            word = scanner.next();
        }

        switch (word) {
            // TreeMap 순회
            case "한식" -> new Iterator(kiosk, kioskKR, minKey, minValue, word);
            case "일식" -> new Iterator(kiosk, kioskJP, minKey, minValue, word);
            case "중식" -> new Iterator(kiosk, kioskCH, minKey, minValue, word);
            case "양식" -> new Iterator(kiosk, kioskEN, minKey, minValue, word);
        }




    }

}
