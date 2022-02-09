package testingMRV;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class MRVPartyContext {
	
	private PartyContext[] partyContext;
	private Date processDate;
	
	
	public PartyContext[] getPartyContext() {
		return partyContext;
	}
	public void setPartyContext(PartyContext[] partyContext) {
		this.partyContext = partyContext;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	@Override
	public String toString() {
		return "MRVPartyContext [partyContext=" + Arrays.toString(partyContext) + ", processDate=" + processDate + "]";
	}
	
	
	

}
