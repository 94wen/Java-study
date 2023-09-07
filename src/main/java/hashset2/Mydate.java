package hashset2;

import java.util.Date;
import java.util.Objects;

/**
 * @Author wen
 * @Data 2023/9/1 21:22
 */
public class Mydate {
   public int year;
   public int month;
   public int day;

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mydate mydate)) return false;
        return year == mydate.year && month == mydate.month && day == mydate.day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
