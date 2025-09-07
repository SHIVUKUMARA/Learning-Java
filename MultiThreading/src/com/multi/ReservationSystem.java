package com.multi;

class SeatReservation {
	private int availableSeats;

	public SeatReservation(int totalSeats) {
		this.availableSeats = totalSeats;
	}

	public synchronized boolean reserveSeat(int numberOfSeats) {
		if (numberOfSeats <= availableSeats) {
			System.out.println(Thread.currentThread().getName() + " reserved " + numberOfSeats + " seats.");
			availableSeats -= numberOfSeats;
			System.out.println("Seats left: " + availableSeats);
			return true;
		} else {
			System.out.println(Thread.currentThread().getName() + " failed to reserve " + numberOfSeats
					+ " seats, Not enough seats available.");
			return false;
		}
	}
	
	public synchronized boolean cancelSeat(int numberOfSeats) {
        availableSeats += numberOfSeats;
        System.out.println(Thread.currentThread().getName() + " canceled " + numberOfSeats + " seats.");
        System.out.println("Seats left: " + availableSeats);
        return true;
    }
}

class ReservationThread extends Thread {
    private SeatReservation seatReservation;
    private int seatsToReserve;
    private boolean cancel;

    public ReservationThread(SeatReservation seatReservation, int seatsToReserve, boolean cancel) {
        this.seatReservation = seatReservation;
        this.seatsToReserve = seatsToReserve;
        this.cancel = cancel;
    }

    public void run() {
        if (cancel) {
            seatReservation.cancelSeat(seatsToReserve);
        } else {
            seatReservation.reserveSeat(seatsToReserve);
        }
    }
}

public class ReservationSystem {

	public static void main(String[] args) {
		SeatReservation seatReservation = new SeatReservation(20);

        ReservationThread thread1 = new ReservationThread(seatReservation, 15, false);
        ReservationThread thread2 = new ReservationThread(seatReservation, 4, true);
        ReservationThread thread3 = new ReservationThread(seatReservation, 12, false);

        thread1.start();
        thread2.start();
        thread3.start();
	}

}
