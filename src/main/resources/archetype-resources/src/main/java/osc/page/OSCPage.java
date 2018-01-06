package ${package}.osc.page;

import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.selenium.WebPage;
import org.suren.autotest.web.framework.settings.DriverConstants;

/**
 * @author suren
 */
@AutoPage(url = "https://gitee.com/", browser = DriverConstants.DRIVER_CHROME)
public class OSCPage extends WebPage
{
}