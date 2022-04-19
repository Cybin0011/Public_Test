package com.Cybin.ReEqualsTest;

/**
 * @author Chen Yuanbin
 * @create 2022-04-01 10:59
 */
public class MyDate {
    private  int year;
    private int month;
    private  int day;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public boolean equals(Object obj) {
        MyDate obj_date = new MyDate();

        if (obj instanceof MyDate) {
            obj_date = (MyDate) obj;
        }
        if (this.day == obj_date.day && this.month == obj_date.month && this.year == obj_date.year) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
