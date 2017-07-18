package ${package}.module;

import ${package}.util.KeyboardUtils;
import ${package}.page.HomePage;
import org.suren.autotest.web.framework.annotation.AutoModule;
import org.suren.autotest.web.framework.util.ThreadUtil;

import com.surenpi.autotest.webui.core.EngineAware;
import com.surenpi.autotest.webui.core.WebUIEngine;

import java.awt.*;

/**
 * @author suren
 */
@AutoModule(name = "用户模块")
public class UserModule implements EngineAware
{
    private WebUIEngine util;
    private HomePage page;

    public void login()
    {
        page = util.getPage(HomePage.class);
        page.open();
        page.getUserName().fillNotBlankValue();
        page.getPassword().fillNotBlankValue();
        page.getLoginBut().click();
    }

    public void toProjectList() throws AWTException
    {
        KeyboardUtils.cancel();

        ThreadUtil.silentSleep(3000);

        page.getToProjectListBut().click();
    }

    @Override
    public void setEngine(WebUIEngine util)
    {
        this.util = util;
    }
}
