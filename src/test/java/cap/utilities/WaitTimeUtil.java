package cap.utilities;

import cap.helpers.Constants;

public class WaitTimeUtil {

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
