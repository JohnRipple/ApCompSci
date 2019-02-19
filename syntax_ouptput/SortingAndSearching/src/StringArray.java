public class StringArray
{
    public static void main(String[] args){
        String s = "10-25-109-1-23-18";
        String[] nums = s.split("\\-");

        int sum = 0;
        for(String num : nums)
            sum += Integer.parseInt(num);
        System.out.println(sum);
    }
}
