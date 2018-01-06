package ${package}.github.page;

import com.surenpi.autotest.webui.core.LocatorType;
import com.surenpi.autotest.webui.ui.Button;
import com.surenpi.autotest.webui.ui.Text;
import org.suren.autotest.web.framework.annotation.AutoLocator;
import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.selenium.WebPage;
import org.suren.autotest.web.framework.settings.DriverConstants;

@AutoPage(url = "https://github.com/LinuxSuRen", browser = DriverConstants.DRIVER_CHROME)
public class GithubPage extends WebPage
{
    @AutoLocator(locator = LocatorType.BY_NAME, value = "q")
    private Text search;
    @AutoLocator(locator = LocatorType.BY_LINK_TEXT, value = "Sign in")
    private Button sign;

    public Text getSearch()
    {
        return search;
    }

    public void setSearch(Text search)
    {
        this.search = search;
    }

    public Button getSign()
    {
        return sign;
    }

    public void setSign(Button sign)
    {
        this.sign = sign;
    }
}