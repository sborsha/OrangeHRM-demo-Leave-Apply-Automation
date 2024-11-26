package pages;

import config.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeavePage extends Setup {
    @FindBy(className = "oxd-main-menu-item")
    List<WebElement> menuItems;
    @FindBy(className = "oxd-topbar-body-nav-tab-item")
    List<WebElement>LeaveApplyBtn;
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement drpdwnLeaveType;
    @FindBy(xpath = "//*[contains(text(),'CAN - FMLA')]")
    WebElement selectLeaveType;
    @FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])")
    WebElement DatePicker;
    @FindBy(tagName = "textarea")
    WebElement cmntBox;
    @FindBy(css = "[type=\"submit\"]")
    WebElement BtnApply;

    public LeavePage(WebDriver driver){
        PageFactory.initElements (driver,this);
    }
    public void LeaveApply(String fromDate , String comments){
        menuItems.get(2).click ();  //Click on Leave Page
        LeaveApplyBtn.get(0).click ();   //click Apply button
        drpdwnLeaveType.click ();   // Click dropdown for Leave type
        selectLeaveType.click ();   //Select leave type
        DatePicker.sendKeys (fromDate);
        cmntBox.sendKeys (comments);
        BtnApply.click ();
    }
}
