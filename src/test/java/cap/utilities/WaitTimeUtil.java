package cap.utilities;

import cap.helpers.Constants;

public class WaitTimeUtil {
	/**The implicitlyWait command waits for an element to load for a specified duration..*/
	public static int getWaitTime(String strWaitVaribaleName){
		int inWaitTime=30;
		
		try{
			String strWaitNumber = System.getProperty(Constants.WAIT_NUMBER,"");
			String strWaitTime = System.getProperty(strWaitVaribaleName,"");
			
			inWaitTime = Integer.parseInt(strWaitTime) * Integer.parseInt(strWaitNumber);
		}
		catch(Exception e){

		}
		return inWaitTime;
	}
	/**The waits for an invisibilityelement to load for a specified duration..*/
	public static int getWaitForInvisibilityTime(String strWaitVaribaleName){
		int inWaitTime=60;

		try{
			String strWaitNumber = System.getProperty(Constants.WAIT_NUMBER,"");
			String strWaitTime = System.getProperty(strWaitVaribaleName,"");

			inWaitTime = Integer.parseInt(strWaitTime) * Integer.parseInt(strWaitNumber);
		}
		catch(Exception e){

		}
		return inWaitTime;
	}
}
