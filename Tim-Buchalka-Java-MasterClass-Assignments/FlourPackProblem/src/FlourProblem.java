public class FlourProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigQuant = 5 * bigCount;
        int smallQuant = smallCount;
        int bigPack = goal/5;
        int check =0;
        if (bigQuant>goal){
            check = bigPack+smallQuant;
            if (check>=goal){
                return true;
            }
            else return false;
        }
        else if (bigCount==goal)return true;
        else if (bigCount<goal){
            check = bigQuant +smallQuant;
            if (check>=goal){
                return true;
            }
            else return false;
        }
        return false;
    }
}
