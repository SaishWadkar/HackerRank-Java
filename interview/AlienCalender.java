package interview;

public class AlienCalender{

    private static final String[] days = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};
    private static final String[] months = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
    private static final int[] daysIn_Months ={36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};

    private static final int totalMonthsInYear= 11;
    private static final int additional_Day= 297;




    public static void main(String[] args){
        PrintNMonths(2717, 9, 4);

    }




    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths){

        if(startYear<0 || startYear>6999 || startMonth<1 || startMonth>11){
            System.out.println("Please Provide valid Input");
        }

        int currentYear = startYear;
        int currentMonth = startMonth-1;

        for(int i=0; i<numberOfMonths; i++){
            printMonth(currentYear,currentMonth);
            currentMonth++;
            if(currentMonth ==11){
                currentMonth=0;
                currentYear++;
            }
        }  //for loop ends
    }    //PrintNMonths ends






    public static void printMonth(int year, int month){
        String monthName = months[month];
        int totalDaysInMonth = daysIn_Months[month];

        if(month==1 && ((year*11+month)%additional_Day==0)){
            totalDaysInMonth++;
        }else if(month == 8 && year%totalMonthsInYear ==0){
            totalDaysInMonth--;
        }

        System.out.println("Month: " + monthName + " Year: " + year);
        System.out.println("Za Xo Cu Vo Bi Ne Ma Lu Ki");


        int currentDayOfWeek = MonthStartsOn(month,year);

        for (int day = 1; day <= totalDaysInMonth; day++){
            System.out.printf("%2d ", day);
            currentDayOfWeek++;
            if (currentDayOfWeek == 9){
                currentDayOfWeek = 0;
                System.out.println();
            }
        }
        if (currentDayOfWeek != 0) {
            System.out.println();
        }


    }//printMonth ends





    public static int MonthStartsOn(int month, int year){
        //day of the month logic
        int start = 2;
        return start;
    }



}
