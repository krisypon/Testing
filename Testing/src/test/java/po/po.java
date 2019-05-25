package po;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po {

	@FindBy(how = How.ID, using = "input-email")
	private WebElement getEmailField;
	// public WebElement getEmailField() {
	// return getEmailField;
	// }
	public void getEmailField() {
		getEmailField.sendKeys("hello@hello.com");
	}
	
	@FindBy(how = How.ID, using = "input-email")
	private WebElement getEmail;
	public void getEmail(String string) {
		getEmailField.sendKeys(string);
	}

	Random random = new Random();
	int randInt = random.nextInt(100000);
	@FindBy(how = How.ID, using = "input-email")
	private WebElement getNewEmailField;
	public void getNewEmailField() {
		getEmailField.sendKeys(String.valueOf(randInt).concat("hello@hello.com"));
	}
	
	@FindBy(how = How.ID, using = "input-email")
	private WebElement clearEmailField;
	public void clearEmailField() {
		getEmailField.clear();
	}

	@FindBy(how = How.ID, using = "input-password")
	private WebElement getPassword;
	public void getpasswordfield() {
		getPassword.sendKeys("hellodarkness");
	}
	
	@FindBy(how = How.ID, using = "input-password")
	private WebElement getPass;
	public void getPass(String string) {
		getPass.sendKeys(string);
	}
	
	@FindBy(how = How.ID, using = "input-password")
	private WebElement getShortPassword;
	public void getShortPass() {
		getPassword.sendKeys("123");
	}
	
	@FindBy(how = How.ID, using = "input-password")
	private WebElement getLongPassword;
	public void getLongPass() {
		getPassword.sendKeys("123456789012345678901");
	}
	
	@FindBy(how = How.ID, using = "input-password")
	private WebElement clearPassword;
	public void clearPasswordField() {
		getPassword.clear();
	}

	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement getCPassword;
	public void getCPasswordfield() {
		getCPassword.sendKeys("hellodarkness");
	}
	
	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement getCShortPass;
	public void getCShortPass() {
		getCPassword.sendKeys("123");
	}
	
	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement getCLongPass;
	public void getCLongPass() {
		getCPassword.sendKeys("123456789012345678901");
	}
	
	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement getConfirmPassword;
	public void clearConfirmField() {
		getCPassword.clear();
	}
	
	@FindBy(how = How.ID, using = "input-telephone")
	private WebElement getTelephone;
	public void gettelephonefield() {
		getTelephone.sendKeys("12345678");
	}
	
	@FindBy(how = How.ID, using = "input-telephone")
	private WebElement clearTelephone;
	public void clearPhoneField() {
		getTelephone.clear();
	}

	@FindBy(how = How.ID, using = "input-firstname")
	private WebElement getFName;
	public void getFNameField() {
		getFName.sendKeys("Saulite");
	}

	@FindBy(how = How.ID, using = "input-lastname")
	private WebElement getLName;
	public void getLNameField() {
		getLName.sendKeys("Darkness");
	}
	
	@FindBy(how = How.ID, using = "input-lastname")
	private WebElement clearLName;
	public void clearLNameField() {
		getLName.clear();
	}

	@FindBy(css = "input[value='Login']")
	public WebElement loginbutton;

	@FindBy(css = "input[value='Continue']")
	public WebElement Cbutton;

	@FindBy(css = "input[name='agree']")
	private WebElement agree;
	
	@FindBy(css = "a[href=\"http://www.demoshop24.com/index.php?route=account\"]")
	public WebElement exitbutton;

	public void login() {
		getEmailField();
		getpasswordfield();
		loginbutton.click();

	}

	public void register() {
		getFNameField();
		getLNameField();
		getNewEmailField();
		gettelephonefield();
		getpasswordfield();
		getCPasswordfield();
		agree.click();
		Cbutton.click();
	}
	
	public void NoFName() {
		//getFNameField();
		getLNameField();
		getNewEmailField();
		gettelephonefield();
		getpasswordfield();
		getCPasswordfield();
		agree.click();
		Cbutton.click();
	}
	public void NoLName() {
		getFNameField();
		clearLNameField();
		Cbutton.click();
	}
	public void NoEmail() {
		getLNameField();
		clearEmailField();
		Cbutton.click();
	}
	public void NoPhone() {
		getNewEmailField();
		clearPhoneField();
		Cbutton.click();
	}
	public void NoPassword() {
		gettelephonefield();
		clearPasswordField();
		Cbutton.click();
	}
	public void NoConfirm() {
		getpasswordfield();
		clearConfirmField();
		Cbutton.click();
	}
	public void NoAgree() {
		getCPasswordfield();
		agree.click();
		Cbutton.click();
	}
	public void ShortPassword() {
		getFNameField();
		getLNameField();
		getNewEmailField();
		gettelephonefield();
		getShortPass();
		getCShortPass();
		agree.click();
		Cbutton.click();
	}
	public void LongPassword() {
		getFNameField();
		getLNameField();
		getNewEmailField();
		gettelephonefield();
		getLongPass();
		getCLongPass();
		agree.click();
		Cbutton.click();
	}
}
