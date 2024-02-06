package apk.testdata;

import jsonHelperDemo.JsonHelper;

public interface UserLogin {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "UserLogin";
	
	
	String USERID = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "userID");
	String PASSWORD = JsonHelper.getTestDataString(FOLDER_NAME, FILE_NAME, "PASS");


}
