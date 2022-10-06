package case_study.utils.booking_comparator;

import case_study.model.rental_service.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getStartDate().isBefore(o2.getStartDate())) {
            return -1;
        } else if (o1.getStartDate().equals(o2.getStartDate())) {
            return o1.getEndDate().compareTo(o2.getEndDate());
        } else {
            return 1;
        }
    }
}
