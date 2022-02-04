public class BarkingDog {
    public static boolean shouldWeWakeUp(boolean barking, int hourofDay){
        if (hourofDay<0||hourofDay>23){
            return false;
        }
        else if (barking && (hourofDay<8||hourofDay>22)){
            return true;
        }
        else{
            return false;
        }


    }
}
