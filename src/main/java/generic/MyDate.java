package generic;

import java.util.Comparator;

/**
 * @Author wen
 * @Data 2023/9/7 14:44
 */
public class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  year +
                "年" + month +
                "月" + day +
                "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearM = year - o.getYear();
        if (yearM != 0){
            return yearM;
        }
        int monthM = month - o.getMonth();
        if (monthM != 0){
            return monthM;
        }
        int dayM = day - o.getDay();
        return dayM;
    }
}
