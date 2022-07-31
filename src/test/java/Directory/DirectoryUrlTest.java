package Directory;

import PageObject.DirectoryPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;

import static PageObject.DirectoryPage.DIRECTORY_PAGE;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class DirectoryUrlTest {
    @Before
    public void setUp() {
       /* Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";*/
        DirectoryPage  directoryPage = open(DIRECTORY_PAGE, DirectoryPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        directoryPage.directoryPageWaiting();
    }

    @Test
    public void directoryPageTest(){
        DirectoryPage directoryPage = page(DirectoryPage.class);
        directoryPage.directoryAllClick();
    }

}
