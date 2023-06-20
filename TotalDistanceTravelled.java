public class TotalDistanceTravelled {
    class Solution {
        public int distanceTraveled(int mainTank, int additionalTank) {
            int fuelConsumed = 0;
            while (mainTank >=5){
                fuelConsumed +=5;
                mainTank -=5;
                if(additionalTank >=1){
                    mainTank += 1;
                    additionalTank -=1;
                }
            }
            fuelConsumed += mainTank;
            return fuelConsumed *10;
        }
    }
    
}
