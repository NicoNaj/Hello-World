package curvesPack;

import java.sql.SQLException;
import java.time.LocalDate;

import containers.ObjectNature;
import conventions.Currency;
import conventions.CurveConvention;
import conventions.DayCount;
import conventions.RateConvention;

public class CurveKey {

	public DayCount dayCount;
	public RateConvention rateConvention;
	public Currency currency;
	public ObjectNature objectNature;
	public LocalDate valuationDate;
	
	CurveKey(DayCount _dayCount, RateConvention _rateConvention, Currency _currency, ObjectNature _objectNature ,
			LocalDate _valuationDate){
		this.dayCount = _dayCount;
		this.rateConvention = _rateConvention;
		this.currency = _currency;
		this.objectNature = _objectNature;
		this.valuationDate = _valuationDate;
	}
	CurveKey(CurveConvention _otherCurveConvention, ObjectNature _objectNature, LocalDate _valuationDate) {
		this.dayCount = _otherCurveConvention.getDayCount();
		this.rateConvention = _otherCurveConvention.getRateConvention();
		this.currency = _otherCurveConvention.getCurrency();
		this.objectNature = _objectNature;
		this.valuationDate = _valuationDate;
	}
	
	public Curve createNewCurve() throws ClassNotFoundException, SQLException {
		return new Curve(this);
	}
	
}
