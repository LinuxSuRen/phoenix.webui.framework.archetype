/*
 *
 *  * Copyright 2002-2007 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

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
		scanBasePackages = {"${package}",
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

