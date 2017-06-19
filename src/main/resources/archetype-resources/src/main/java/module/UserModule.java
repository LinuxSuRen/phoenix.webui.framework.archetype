package ${package}.module;

import ${package}.util.KeyboardUtils;
import org.suren.autotest.web.framework.annotation.AutoModule;
import org.suren.autotest.web.framework.core.EngineAware;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.suren.autotest.web.framework.util.ThreadUtil;

import java.awt.*;

/**
 * @author suren
 */
@AutoModule(name = "用户模块")
public class UserModule implements EngineAware
{
    private SettingUtil util;
    private ${package}.page.HomePage page;

    public void login()
    {
        page = util.getPage(com.surenpi.autotest.demo.page.HomePage.class);
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
    public void setEngine(SettingUtil util)
    {
        this.util = util;
    }
}
