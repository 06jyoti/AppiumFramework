package apk.testdata;

import jsonHelperDemo.JsonHelper;

public interface AddAccount {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "AddAccount";
	
	
	String USERBANKNAME = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "name");
	String ACCOUNT_NO = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "accountNum");
	String IFSC_CODE = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "codeIFSC");

}
