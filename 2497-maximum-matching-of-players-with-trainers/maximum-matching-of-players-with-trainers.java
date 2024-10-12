import java.util.Arrays;
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int sizeP = players.length;
        int sizeT = trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);

        
        int counter = 0; 
        int i = 0, j = 0;
        while (i < sizeP && j < sizeT) {
            if (players[i] <= trainers[j]) {
            counter++;
            i++;
            j++;
            } else {
            j++;
            }
        }
        return counter;
        }
    
    
}