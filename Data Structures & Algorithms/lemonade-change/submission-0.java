class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int c5=0,c10=0,c20=0;

        for(int i=0;i<n;i++){
            if(bills[i]==5)c5++;
            if(bills[i]==10){
                c10++;
                if(c5>=1)c5--;
                else return false;
            }
            if(bills[i]==20){
                c20++;
                if(c10>=1 && c5>=1){
                    c10--;
                    c5--;
                }
                else if(c5>=3)c5-=3;
                else return false;
            }
        }
        return true;
    }
}