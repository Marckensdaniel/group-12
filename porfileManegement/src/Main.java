

public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandPasswords = new IDandPasswords();
		RegisterPage registerPage = new RegisterPage(null);		

		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());


	}
}