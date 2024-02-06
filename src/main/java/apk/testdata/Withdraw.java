package apk.testdata;

import jsonHelperDemo.JsonHelper;

public interface Withdraw {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Withdraw";
	
	
	String WITHDRAW_AMOUNT = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "Amount");
	String TX_ID = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "TXid");

	

}
