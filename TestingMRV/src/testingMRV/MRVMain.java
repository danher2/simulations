package testingMRV;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


public class MRVMain {

	public static void main(String[] args) {
		
		/*PartyContext p1 = new PartyContext(1, "Pedro");
		PartyContext p2 = new PartyContext(2, "Max");
		PartyContext p3 = new PartyContext(3, "Daniel");
		
		PartyContext[] py = {p1,p2,p3}; 
		
		Date date = new Date(Calendar.getInstance().getTimeInMillis());
		
		MRVPartyContext MRVp1 = new MRVPartyContext();
		MRVp1.setPartyContext(py);
		MRVp1.setProcessDate(date);
			
		System.out.println(MRVp1.toString());*/
		
		//need to create the date
		//see the root of process date 
		
		
		//simulating determineBulkrequest
		
		MRVPartyContext2 p4 = new MRVPartyContext2(1, "Pedro");
		MRVPartyContext2 p5 = new MRVPartyContext2(2, "Max");
		MRVPartyContext2 p6 = new MRVPartyContext2(3, "Daniel");
		
		MRVPartyContext2[] MRVPartyContextArray = {p4,p5,p6};
		Date date = new Date(Calendar.getInstance().getTimeInMillis());
		
		MRVPartyContext MRVp2 = new MRVPartyContext();
		
		
		PartyContext[] partyContextArray = new PartyContext[MRVPartyContextArray.length];
		
		for (int i = 0; i < MRVPartyContextArray.length; i++) {
			PartyContext partyContext = new PartyContext();
			System.out.println("");
			partyContext.setId(MRVPartyContextArray[i].getId());
			partyContext.setName(MRVPartyContextArray[i].getName());
			System.out.println(partyContext);
			System.out.println("");
			System.out.println("");
			partyContextArray[i] = partyContext;
			System.out.println("printing elements of partyContextArray: \n" + "position: " + i + " element: " + partyContextArray[i]);
		}
		
	
		
		
		MRVp2.setPartyContext(partyContextArray);
		MRVp2.setProcessDate(date);
		
		System.out.println("");
		System.out.println("Imprimiendo partyContextArray: " + MRVp2.getPartyContext().toString());
		
		System.out.println("MRVp2: \n" + MRVp2.toString());
		

	}

}
