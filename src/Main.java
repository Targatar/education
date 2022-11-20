public class Main {
    public static void main(String[] args) {
        counter counter1 = new counter();
        counter counter2 = new counter();
        int counterNum = counter1.counterNum;
        int counterNum2 = counter2.counterNum;
        for (int a=1; a<99; a++){
            if (a%2==0){
                counterNum = counter1.counterUp(counterNum);
            }


            }


        System.out.println("четных чисел: " + counter.counterUp(counterNum));



    }
}