package Array;

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int need = tickets[k];
        int time = 0;

        for(int i = 0 ; i < tickets.length ; i++){
              if(i < k){
                time += Math.min(tickets[i], need);
              }else{
                time += Math.min(tickets[i], need - 1);
              }
        }

        return time;
    }
}
