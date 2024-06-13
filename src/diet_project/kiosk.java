package diet_project;

import java.util.*;


public class kiosk {
    public static void main(String[] args) {
        Map<String, List<String>> kiosk = new HashMap<>();
        TreeMap<String,Integer> kioskKR = new TreeMap<String,Integer>();
        TreeMap<String,Integer> kioskJP = new TreeMap<String,Integer>();
        TreeMap<String,Integer> kioskCH = new TreeMap<String,Integer>();
        TreeMap<String,Integer> kioskEN = new TreeMap<String,Integer>();

        TreeMap<String, Integer> information;

        List<String> listKR = Arrays.asList("고기","밥","김치볶음밥","미역국","제육덮밥","떡볶이");
        List<String> listJP = Arrays.asList("초밥","우동","소바","돈카츠","타코야끼","오코노미야끼");
        List<String> listCH = Arrays.asList("짜장면","짬뽕","탕수육","유린기","동파육");
        List<String> listEN = Arrays.asList("햄버거","피자","파스타","바비큐","핫도그","리조또");



        kiosk.put("한식",listKR);
        kiosk.put("일식",listJP);
        kiosk.put("중식",listCH);
        kiosk.put("양식",listEN);


        // KR
        kioskKR.put("고기", 500);
        kioskKR.put("밥", 200);
        kioskKR.put("김치볶음밥", 600);
        kioskKR.put("미역국", 100);
        kioskKR.put("제육덮밥", 700);
        kioskKR.put("떡볶이", 300);

        // JP
        kioskJP.put("초밥", 350);
        kioskJP.put("우동", 400);
        kioskJP.put("소바", 300);
        kioskJP.put("돈카츠", 600);
        kioskJP.put("타코야끼", 500);
        kioskJP.put("오코노미야끼", 600);

        // CH
        kioskCH.put("짜장면", 700);
        kioskCH.put("짬뽕", 600);
        kioskCH.put("탕수육", 800);
        kioskCH.put("유린기", 700);
        kioskCH.put("동파육", 750);

        // EN
        kioskEN.put("햄버거", 500);
        kioskEN.put("피자", 600);
        kioskEN.put("파스타", 700);
        kioskEN.put("바비큐", 800);
        kioskEN.put("핫도그", 400);
        kioskEN.put("리조또", 650);

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
