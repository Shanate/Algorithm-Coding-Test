import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> TotalPlays = new HashMap<>(); // 장르별 비교 -> 먼저 추출할 장르 위한 장치

        HashMap<String, PriorityQueue<int[]>> PlaysInGenres = new HashMap<>(); // 장르 안에서 곡 비교 -> 우선순위 큐 사용

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];

            TotalPlays.put(genre, TotalPlays.getOrDefault(genre, 0) + plays[i]); // 누적총합

            if (!PlaysInGenres.containsKey(genre)) {
                PlaysInGenres.put(genre, new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]));
            }
            PlaysInGenres.get(genre).add(new int[]{i, plays[i]});
        }
        ArrayList<String> list = new ArrayList<>(TotalPlays.keySet());
        list.sort((o1, o2) -> TotalPlays.get(o2) - TotalPlays.get(o1));

        ArrayList<Integer> answerList = new ArrayList<>();

        for (String genre : list) {
            PriorityQueue<int[]> songs = PlaysInGenres.get(genre);
            answerList.add(songs.poll()[0]);

            if(!songs.isEmpty()){
                answerList.add(songs.poll()[0]);
            }
        }

    answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}