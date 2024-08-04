class Solution {
    public int solution(int[][] sizes) {
            int answer = 0;
            int maxi=0;
            int maxj=0;

        for(int i=0; i<sizes.length; i++) {
//            sizes[i][0] = (sizes[i][0] > sizes[i][1]) ? sizes[i][0] : sizes[i][1]; 값이 교체가 안 됨.
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        for(int i=0; i<sizes.length; i++) {
            maxi = Math.max(maxi, sizes[i][0]);
        }
        for(int j=0; j<sizes.length; j++) {
            maxj = Math.max(maxj, sizes[j][1]);
        }

            answer = maxi * maxj;
            return answer;
    }
}