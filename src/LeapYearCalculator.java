public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year%400 == 0 || ((year%4==0)&&(year%100!=0))){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        isLeapYear(2000); // It will return true ;
        isLeapYear(1924); // return true;
        isLeapYear(1800); // false;
        isLeapYear(-1000); // false;
    }
}