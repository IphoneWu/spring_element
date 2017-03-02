package demo7.Po;

import java.util.Date;

/**
 * Created by win8 on 2017/3/2.
 */
public class DatePo
{
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DatePo{" +
                "date=" + date +
                '}';
    }
}
