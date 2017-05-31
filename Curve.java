package curvesPack;

import java.sql.SQLException;
import java.time.LocalDate;

import emeaImportPack.SqlQuery;

public class Curve {
	
	
	public CurveKey key;
	public LocalDate[] dates;
	public Double[] rates;
	
	public Curve(CurveKey _curveKey) throws ClassNotFoundException, SQLException {
		this.key = _curveKey;
		
		switch (_curveKey.objectNature) {
		
		case emeaImport :
			SqlQuery queryEMEA = new SqlQuery();
			this.dates = queryEMEA.fetchCurvesDates(_curveKey.valuationDate, "TO DO how to get RICcode");
			this.rates = queryEMEA.fetchCurvesRates(_curveKey.valuationDate, "TO DO how to get RICcode");
		case excelImport :
			
		
		case reBuilt :
			
		
		}
	}
	
	
}
