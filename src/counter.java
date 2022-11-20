public class counter {
    String counterName;
    int counterNum;
    counter() {
        counterName = "счетчик";
        counterNum = 0;
    }
    public static int counterUp(int counterNum){
        counterNum++;
        return counterNum;
    }
    public static int counterDown(int counterNum){
        counterNum--;
        return counterNum;
    }
    public static int counterUpChange(int counterNum, int n){
        counterNum = counterNum+n;
        return counterNum;
    }
    public static int counterDownChange(int counterNum, int n){
        counterNum = counterNum-n;
        return counterNum;
    }
}
