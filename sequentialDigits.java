class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> answer = new ArrayList<>();
        int lowCount = (int)Math.log10(low)+1;
        int highCount = (int)Math.log10(high)+1;
        int num = 0;
        for(int i=lowCount;i<=highCount;i++){
            for(int j=0;j<=9-i;j++){
                int number = Integer.parseInt(digits.substring(j,j+i));
                if(low <= number && number <= high){
                    answer.add(number);
                }
            }
        }
        return answer;
    }
}
