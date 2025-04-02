package excecoes.personalizadas.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import excecoes.personalizadas.model.exceptions.DomainException;

public class Reservation {

  private Integer roomNumber;
  private Date checkIn;
  private Date checkOut;

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Reservation() {
  }

  public Reservation(int id, Integer roomNumber, Date checkIn, Date checkOut) {
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
    //Isso é programação defensiva para evitar que o objeto seja instanciado com valores inválidos.
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Check-out date must be after check-in date \n");
    }
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Date getCheckIn() {
    return checkIn;
  }

  public Date getCheckOut() {
    return checkOut;
  }

  public long duration() {
    long diff = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  public void updateDates(Date checkIn, Date checkOut) {
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public String updateDates2(Date checkIn, Date checkOut) {
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      return "Reservation dates for update must be future dates";

    }
    if (!checkOut.after(checkIn)) {
      return "Check-out date must be after check-in date \n";

    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    return null;
  }

  public void updateDates3(Date checkIn, Date checkOut) {
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      throw new IllegalArgumentException("Reservation dates for update must be future dates");

    }
    if (!checkOut.after(checkIn)) {
      throw new IllegalArgumentException("Check-out date must be after check-in date \n");

    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public void updateDates4(Date checkIn, Date checkOut) throws DomainException {
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      throw new DomainException("Reservation dates for update must be future dates");

    }
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Check-out date must be after check-in date \n");

    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  @Override
  public String toString() {
    return "Room "
        + roomNumber
        + ", check-in: "
        + sdf.format(checkIn)
        + ", check-out: "
        + sdf.format(checkOut)
        + ", "
        + duration()
        + " nights\n";
  }
}
