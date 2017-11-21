/**
 * Created by Brian Yu on 7/9/2017.
 */
public class Month {
    private int monthNumber;
    private String monthName;

    public Month(){
        this.monthNumber = 1;
    }

    public Month(int month){
        if(month < 1 || month > 12){
            this.monthNumber = 1;
        } else {
            this.monthNumber = month;
        }
    }

    public Month(String name){
        this.monthName = name;
        switch(name){
            case "January": this.monthNumber = 1;
            break;
            case "February": this.monthNumber = 2;
            break;
            case "March": this.monthNumber = 3;
            break;
            case "April": this.monthNumber = 4;
            break;
            case "May": this.monthNumber = 5;
            break;
            case "June": this.monthNumber = 6;
            break;
            case "July": this.monthNumber = 7;
            break;
            case "August": this.monthNumber = 8;
            break;
            case "September": this.monthNumber = 9;
            break;
            case "October": this.monthNumber = 10;
            break;
            case "November": this.monthNumber = 11;
            break;
            case "December": this.monthNumber = 12;
            break;
        }
    }

    public void setMonthNumber(int monthNo){
        if(monthNo < 1 || monthNo > 12){
            monthNumber = 1;
        } else {
            monthNumber = monthNo;
        }
    }

    public int getMonthNumber(){
        return monthNumber;
    }

    public String getMonthName(){
        return monthName;
    }

    public String toString(){
        return monthName;
    }

    public boolean equals(Month test){
        if(test == this){
            System.out.println("The months are the same.");
            return true;
        } else {
            System.out.println("The months are not the same");
            return false;
        }
    }

    public boolean greaterThan(Month test){
        if(test.monthNumber > this.monthNumber){
            System.out.println("This month is greater than the other month.");
            return true;
        } else {
            System.out.println("This month is less than the other month.");
            return false;
        }
    }

    public boolean lessThan(Month test){
        if(test.monthNumber < this.monthNumber){
            System.out.println("This month is less than the other month.");
            return true;
        } else {
            System.out.println("This month is greater than the other month.");
            return false;
        }
    }
}
