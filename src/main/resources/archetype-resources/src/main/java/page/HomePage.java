/**
 * http://surenpi.com
 */
package ${package}.page;

import org.suren.autotest.web.framework.annotation.AutoDataSource;
import org.suren.autotest.web.framework.annotation.AutoLocator;
import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.core.LocatorType;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.core.ui.Text;
import org.suren.autotest.web.framework.data.DataSourceConstants;
import org.suren.autotest.web.framework.page.Page;

/**
 * 属性上必须添加注解@Autowired以及对应的getter和setter方法
 * @author suren
 * @date Jul 23, 2016 4:41:16 PM
 */
@AutoPage(url = "http://phoenix.surenpi.com",maximize = false)
@AutoDataSource(resource = "phoenix.data.yml", type = DataSourceConstants.DS_TYPE_YAML)
public class HomePage extends Page
{
	@AutoLocator(locator = LocatorType.BY_NAME, value = "username")
	private Text userName;
	@AutoLocator(locator = LocatorType.BY_NAME, value = "password")
	private Text password;
	@AutoLocator(locator = LocatorType.BY_XPATH, value = "//button[contains(text(),'登录')]")
	private Button loginBut;
	@AutoLocator(locator = LocatorType.BY_LINK_TEXT, value = "查看项目列表")
	private Button toProjectListBut;

	public Text getUserName() {
		return userName;
	}

	public void setUserName(Text userName) {
		this.userName = userName;
	}

	public Text getPassword() {
		return password;
	}

	public void setPassword(Text password) {
		this.password = password;
	}

	public Button getLoginBut() {
		return loginBut;
	}

	public void setLoginBut(Button loginBut) {
		this.loginBut = loginBut;
	}

	public Button getToProjectListBut() {
		return toProjectListBut;
	}

	public void setToProjectListBut(Button toProjectListBut) {
		this.toProjectListBut = toProjectListBut;
	}
}