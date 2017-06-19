/**
 * http://surenpi.com
 */
package ${package};

import ${package}.module.ProjectModule;
import ${package}.module.UserModule;
import org.suren.autotest.web.framework.annotation.AutoApplication;
import org.suren.autotest.web.framework.selenium.SeleniumEngine;
import org.suren.autotest.web.framework.settings.DriverConstants;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.suren.autotest.web.framework.util.ThreadUtil;

/**
 * 测试示例，该测试代码和runner_suite.xml的效果是一样的
 * @author suren
 * @date Jul 23, 2016 4:48:39 PM
 */
@AutoApplication(name = "Phoenix平台自动化测试",
		scanBasePackages = {"com.surenpi.autotest.demo",
				"com.surenpi.autotest.report"
		})
public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		SettingUtil util = new SettingUtil(Test.class);
		SeleniumEngine engine = util.getEngine();
		engine.setDriverStr(DriverConstants.DRIVER_HTML_UNIT);
		engine.init();
		util.initData();

		UserModule userModule = util.getModule(UserModule.class);
		userModule.login();
		userModule.toProjectList();

		ThreadUtil.silentSleep(6000);
		ProjectModule projectModule = util.getModule(ProjectModule.class);
		projectModule.addProject();
		projectModule.listProject();

		util.close();
		util.shutdown();
	}

}

