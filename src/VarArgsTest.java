public class VarArgsTest {

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5,6,7,8));
    }

    public static int sum(int ...nums){
        int sum = 0;
        for(int num:nums)
            sum+=num;
        return sum;
    }

    public static int min(int firstNum,int ...OtherNums)
    {
        int min = firstNum;
        for(int num:OtherNums)
            if(num<min)
                min = num;
        return min;
    }
}
