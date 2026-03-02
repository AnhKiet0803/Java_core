package main.section6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoTime {
    public static void main(String[] args){
        LocalDate ld1 = LocalDate.now(); // chạy LocalDate.now() máy(thiết bị) nào nó sẽ nhận của máy đó
        System.out.println(ld1);

        LocalDate ld2 = ld1.plusDays(1);
        System.out.println(ld2);

        LocalDate ld3 = ld1.plusYears(1);
        System.out.println(ld3);

        LocalDate ld4 = ld1.plusDays(30);
        // giả sử hết hạn vào ngày 19/5/2026
        LocalDate ld5 = LocalDate.parse("2026-05-19");
        LocalDate ld6 = ld5.plusYears(12);
        System.out.println(ld6);
        // hết hạn vào 19/2/2026
        LocalDate ld7 = LocalDate.of(2026,2,19);
        System.out.println(ld7);

        LocalDate ld8 = ld1.minusYears(30);
        System.out.println(ld8);

        LocalDateTime lt1 = LocalDateTime.now();
        System.out.println(lt1);

        LocalDateTime lt2 = lt1.plusHours(1);
        System.out.println(lt2);

        LocalDateTime lt3 = LocalDateTime.parse("2026-02-28T12:00:00");
        System.out.println(lt3);

        LocalDateTime lt4 = LocalDateTime.of(2026,2,13,13,20);
        System.out.println(lt4);

        System.out.println(lt4.getDayOfYear());
        System.out.println(lt4.getDayOfWeek());

        // nhập ngày sinh xem hôm đó là thứ mấy, 9 tháng 10 ngày trc là thứ mấy
        LocalDate dob = LocalDate.parse("2002-03-08");
        System.out.println(dob.getDayOfWeek());
        LocalDate dob1 = dob.minusMonths(9).minusDays(10);
        System.out.println(dob);
        System.out.println(dob1.getDayOfWeek());
    }
}
