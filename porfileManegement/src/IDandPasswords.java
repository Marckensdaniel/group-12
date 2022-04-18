import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
    HashMap<String,String> registerinfo = new HashMap<String,String>();

	
	IDandPasswords(){
		
		logininfo.put("medina@gmail.com","pizza");
		logininfo.put("david@gmail.com","Pasword");
		logininfo.put("anthony@gmail.com","abc123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}

	}

